package yang_wu;

public abstract class RobotPlayer {
	public int number;
	//Declare a reference variable for the behavior interface types. All robotplayers subclasses inherit it.  
	protected PlayBehavior playBehavior;
	protected RobotPlayer position = null;
	protected boolean down;
	
	public RobotPlayer(){
	}
	abstract public void display();
	public void getPosition(RobotPlayer position){
		this.position = position;
	};
	//RobotPlayer object delegates that behavior to the object referenced by playBehaivor
	public void performPlay(){
		//Delegate to the behavior class.
		if (!this.down){
			playBehavior.play(this.number);
		}else{
			System.out.println("I'm down so I couldn't play.");
		}
	}


}
