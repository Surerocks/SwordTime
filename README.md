# SwordTime

A sword play strategy game

## Inspiration
The inspiration of this item was when we realized that our original project OCR was not going to function as expected. A group member then started thinking of game ideas when they thought of a combination of Nidhogg and KenJitsu.

## The Rules
In SwordTime there are three stances: High stance, Neutral stance, and Low Stance. From each stance you can attack or block. You can also move left, right, or wait. Each turn you may choose two actions. You cannot attack twice, block twice, attack then block, or block then attack. You also cannot attack or block two turns in a row. To win the game you must either successfully attack or block your opponent. For a successful attack you must either attack an opponent who is adjacent to you while they are either not attacking or blocking, attacking you from a losing stance, blocking from a losing stance. You can also win by blocking from the correct stance. A High attack beats a Neutral attack, A Neutral attack beats a Low attack, and a Low attack beats a High attack. A Low block beats a Neutral attack, a Neutral block beats a High attack, and a High block beats a Low attack.

## Controls
The left player controls are as follows:
* Q: Attack
* W: High Stance
* E: Block
* A: Move Left
* S: Neutral Stance
* D: Move Right
* X: Low Stance
* Z: Wait

The right player controls are as follows:
* U: Attack
* I: High Stance
* O: Block
* J: Move Left
* K: Neutral Stance
* L: Move Right
* M: Low Stance
* N: Wait



## How We Built It
We used Java to for the logic of the game and Java swing for the GUI. To make all of the sprites for the characters used by the players we used Pivot Stick Figure Animator.

## Challenges We Ran Into
There was a point where there was an issue loading the sprites within Java because the resource folder was in the wrong location.

## Accomplishments
Creating a functioning game with animations. Creating a new project after the first one went belly up;

## What we Learned
Don't rely solely on third party freeware for the core of a project as you have little control over its functionality.

## What's next for SwordTime
Build SwordTime with free movement in a physics engine like Unity or Unreal Engine to allow for more gameplay options
