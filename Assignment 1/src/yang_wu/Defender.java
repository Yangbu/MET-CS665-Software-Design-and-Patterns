package yang_wu;
/**
 *Defender.java
 * 
 * 
 * 
 */
public class Defender extends RobotPlayer{

	public Defender(int number){
		this.number = number;
		this.playBehavior = new DefenderPlay();
	}
	@Override
	public void display() {
		System.out.println("I'm a Denfender.");
	}
}
