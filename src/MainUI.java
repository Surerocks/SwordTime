import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainUI implements Observer {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel(new GridLayout(1,8));
	private JLabel[] images = new JLabel[8];
	private Game game;
	private JLabel leftStance;
	private JLabel leftMove;
	private JLabel rightStance;
	private JLabel rightMove;
	private JLabel win;


	public MainUI(){
		new Animation();
		game = new Game();
		setUpMenu();
		setUpGUI();
		
		MoveListener listen = new MoveListener(game);
		frame.addKeyListener(listen);
		game.addObserver(this);

	}
	
	private void setUpGUI(){
		for(int i=0;i<images.length;i++){
			images[i] = new JLabel();
			panel.add(images[i]);
		}
		JPanel topPanel = new JPanel(new GridLayout(3,6));
		win = new JLabel();
		leftStance = new JLabel("Stance: Neutral");
		leftMove = new JLabel("Move:");
		rightStance = new JLabel("Stance: Neutral");
		rightMove = new JLabel("Move:");
		topPanel.add(new JLabel()); // empty
		topPanel.add(leftStance);
		topPanel.add(new JLabel()); // empty
		topPanel.add(new JLabel()); // empty
		topPanel.add(rightStance);
		topPanel.add(new JLabel()); // empty
		
		topPanel.add(new JLabel()); // empty
		topPanel.add(new JLabel()); // empty
		topPanel.add(win); // empty
		topPanel.add(new JLabel()); // empty
		topPanel.add(new JLabel()); // empty
		topPanel.add(new JLabel()); // empty
		
		topPanel.add(new JLabel()); // empty
		topPanel.add(leftMove);
		topPanel.add(new JLabel()); // empty
		topPanel.add(new JLabel()); // empty
		topPanel.add(rightMove);
		topPanel.add(new JLabel()); // empty
		setImages(game.getBoard());
		panel.setMinimumSize(new Dimension(400,200));
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		

		
		frame.setMinimumSize(new Dimension(800,200));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	private void setUpMenu(){
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem reset = new JMenuItem("Reset");
		
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				game = new Game();
				updateUI();
				win.setText("");
			}
		});
		
		file.add(reset);
		menubar.add(file);
		menubar.setVisible(true);
		frame.setJMenuBar(menubar);
	}
	
	public void updateUI(){
		setImages(game.getBoard());
	}
	
	private void setImages(Board b){
		for(int i=0;i<images.length;i++){
			images[i].setIcon(null);
			images[i].setMinimumSize(new Dimension(50,50));
		}
		ImageIcon i1 = new ImageIcon(game.getLeftPlayer().getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon i2 = new ImageIcon(game.getRightPlayer().getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		images[b.getLeftPosition()].setIcon(i1);
		images[b.getRightPosition()].setIcon(i2);
		leftStance.setText("Stance: "+ game.getLeftPlayer().getStance());
		if(game.getLeftPlayer().getPreviousAction() == null)
		{
			leftMove.setText("Move:");
		}
		else if(game.getLeftPlayer().getPreviousAction() == Action.ATTACK)
		{
			leftMove.setText("Move: Attack");
		}
		else
		{
			leftMove.setText("Move: Block");
		}
		rightStance.setText("Stance: "+ game.getRightPlayer().getStance());
		
		if(game.getRightPlayer().getPreviousAction() == null)
		{
			rightMove.setText("Move:");
		}
		else if(game.getRightPlayer().getPreviousAction() == Action.ATTACK)
		{
			rightMove.setText("Move: Attack");
		}
		else
		{
			rightMove.setText("Move: Block");
		}
	}
	
	public void update(Observable arg0, Object arg1) {
		if(!(arg0 instanceof Game)){
			return;
		}
		Game g = (Game) arg0;
		
		if(arg1 instanceof GameOverEvent){
			GameOverEvent e = (GameOverEvent) arg1;
			handleGameOver(g,e.getWinner());
		} else if (arg1 instanceof ActionAnimationEvent){
			// Play animation for given actions
			ActionAnimationEvent e = (ActionAnimationEvent) arg1;
			if(e.getAction() == Action.MOVE_LEFT || e.getAction() == Action.MOVE_RIGHT){
				Board b = g.getBoard();
				setImages(b);
			} else {
				AnimationThread t = new AnimationThread(this, e.getAction(), e.getPerson(), game.isLeftPlayer(e.getPerson()));
				t.run();
			}
		}

	}


	private void handleGameOver(Game g, Person winner) {
		System.out.println("ITS OVER");
		if(g.isLeftPlayer(winner))
			win.setText("Left Player Wins");
		else
			win.setText("Right Player Wins");
	}
	
	
	
}
