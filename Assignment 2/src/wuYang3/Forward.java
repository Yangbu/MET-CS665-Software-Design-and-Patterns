package wuYang3;

import java.util.Observable;


public class Forward extends RobotPlayer {

	public Forward(Observable observable, int number){
		super(observable, number);
	}
	
	public void display() {
		if (this.ballposition == 4){
			this.sensor.resume();
			System.out.println("Number " + this.number + " forward played.");
		}else if (this.ballposition == 2){
			this.sensor.resume();
			System.out.println("Now Number " + this.number + " is a defender and he played.");
		}else if (this.ballposition == 4){
			this.sensor.resume();
			System.out.println("Now Number " + this.number + " is a midfielder and he played.");
		}else {
			this.sensor.sleep();
			System.out.println("Number " + this.number + " is sleeping.");
		}
	}

}
