package yang_wu;
/**
 *GoalKeeper.java
 * 
 * 
 * 
 */
public class GoalKeeper extends RobotPlayer{

	public GoalKeeper(int number){
		this.number = number;
		this.playBehavior = new GoalKeeperPlay();
	}

	@Override
	public void display() {
		System.out.println("I'm a GoalKeeper.");
	}
}
