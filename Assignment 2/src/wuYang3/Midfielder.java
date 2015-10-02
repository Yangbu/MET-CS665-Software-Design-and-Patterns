package wuYang3;

import java.util.Observable;

public class Midfielder extends RobotPlayer {
	
	public Midfielder(Observable observable, int number){
		super(observable, number);
	}

	public void display() {
		if (this.ballposition == 3){
			this.sensor.resume();
			System.out.println("Number " + this.number + " Midfielder played.");
		}else if (this.ballposition == 2){
			this.sensor.resume();
			System.out.println("Now Number " + this.number + " is a defender and he played.");
		}else if (this.ballposition == 4){
			this.sensor.resume();
			System.out.println("Now Number " + this.number + " is a forward and he played.");
		}else {
			this.sensor.sleep();
			System.out.println("Number " + this.number + " is sleeping.");
		}
	}
}
