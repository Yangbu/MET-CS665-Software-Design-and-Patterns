package wuYang3;

import java.util.Observable;

public class GoalKeeper extends RobotPlayer {

	public GoalKeeper(Observable observable, int number) {
		super(observable, number);
	}

	public void display() {
		if (this.ballposition == 1){
			this.sensor.resume();
			System.out.println("Number " + this.number + " Goalkeeper played.");
		}else {
			this.sensor.sleep();
			System.out.println("Number " + this.number + " Goalkeeper is sleeping.");
		}
	}
	

}
