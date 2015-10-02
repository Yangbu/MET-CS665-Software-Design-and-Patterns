package wuYang3;

public class Sensor {

	public boolean activited = false;
	
	public Sensor(){}
	
	public void sleep(){
		System.out.println("The sensor is sleeping.");
	}
	
	public void resume(){
		this.activited = true;
		System.out.println("The sensor is activited.");
	}
}
