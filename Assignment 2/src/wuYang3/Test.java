package wuYang3;

public class Test {

	public static void main(String[] args) {
		Football football = new Football();
		RobotPlayer forward = new Forward(football, 1);
		RobotPlayer midfielder = new Midfielder(football, 2);
		RobotPlayer defender = new Defender(football, 3);
		RobotPlayer goalKeeper = new GoalKeeper(football, 4);
		/*
		 * 1--subset of lower
		 * 2--lower
		 * 3-middle
		 * 4--upper
		 */
		football.setMeasurements(1);
		System.out.println("*********************************");
		football.setMeasurements(2);
	}
}
