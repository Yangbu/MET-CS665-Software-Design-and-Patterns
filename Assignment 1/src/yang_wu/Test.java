package yang_wu;

public class Test {
	public static void main(String[] args) {
		//create object
		RobotPlayer defender = new Defender(1);
		defender.display();
		defender.performPlay();
		RobotPlayer goalkPlayer = new GoalKeeper(2);
		goalkPlayer.display();
		goalkPlayer.performPlay();
		RobotPlayer midFielder = new MidFielder(3);
		midFielder.display();
		midFielder.performPlay();
		RobotPlayer forward = new Forward(4);
		forward.display();
		forward.performPlay();
		//assume defender is down
		defender.down = true;
		defender.performPlay();
		//midfielder get defender's position
		midFielder.getPosition(defender);
		midFielder.display();
		midFielder.position.playBehavior.play(3);
		
	}

}
