package wuYang3;

import java.util.Observable;

public class Football extends Observable {
	private int ballposition;
	
	public Football() { }
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(int ballposition) {
		this.ballposition = ballposition;
		measurementsChanged();
	}
	
	public int getBallPosition() {
		return ballposition;
	}


}
