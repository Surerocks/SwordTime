
public enum Stance { 
	ABOVE("High"),
	NEUTRAL("Neutral"),
	UNDER("Low");
	
	private final String name;
	
	private Stance(String s){
		name = s;
	}
	
	public String toString() {
	    return this.name;
	 }

};