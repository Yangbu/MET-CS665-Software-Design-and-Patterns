package wuYang4;
/**
 *PlaceOrders.java
 *This is the invoker
 */
public class Agent {
	
    //the initial command is empty
	Command buyCommand = null;
	Command sellCommand = null;
	//create a Constructor
	public Agent(Command buyCommand, Command sellCommand){
		this.buyCommand = buyCommand;
		this.sellCommand = sellCommand;
	}
	//create a buy method
	public void buy(String symbol, int amount){
		this.buyCommand.execute(symbol, amount);
	}
	//create a sell method	
	public void sell(String symbol, int amount){
		this.sellCommand.execute(symbol, amount);
	}
}
