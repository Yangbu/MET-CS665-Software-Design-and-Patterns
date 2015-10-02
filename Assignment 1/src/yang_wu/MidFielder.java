package yang_wu;
/**
 *MidFielder.java
 * 
 * 
 * 
 */
public class MidFielder extends RobotPlayer{

	public MidFielder(int number){
		this.number = number;
		this.playBehavior = new MidFielderPlay();
	}

	@Override
	public void display() {
		System.out.println("I'm a Midfielder.");
	}
}
