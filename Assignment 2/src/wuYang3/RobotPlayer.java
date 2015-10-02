package wuYang3;

import java.util.Observable;
import java.util.Observer;

abstract public class RobotPlayer implements Observer {
	protected int number;
	protected Observable observable;
	/*
	 * 1--subset of lower
	 * 2--lower
	 * 3--middle
	 * 4--upper
	 */
	protected int ballposition;
	protected Sensor sensor;

	public RobotPlayer(Observable observable, int number) {
		this.observable = observable;
		observable.addObserver(this);
		this.sensor = new Sensor();
		this.number = number;
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof Football) {
			Football football = (Football)observable;
			this.ballposition= football.getBallPosition();
			display();
		}
	}

	abstract public void display();
}
