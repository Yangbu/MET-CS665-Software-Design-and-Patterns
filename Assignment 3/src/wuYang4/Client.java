package wuYang4;
/**
 *Client.java
 *
 */
public class Client {

	public static void main(String[] args) {
		
		//create an instance of an object:stockTradeSystem	
		StockTradeSystem stockTradeSystem = new StockTradeSystem();
		//set noworking state
		stockTradeSystem.setWorkTime(false);
		Command buy = new BuyCommand(stockTradeSystem);
		Command sell = new SellCommand(stockTradeSystem);
		Agent agent = new Agent(buy ,sell);
		//customer's need: type of stock and its amount
		agent.buy("A", 300);
		agent.sell("B", 50);
		agent.buy("C", 200);
		agent.sell("D", 60);
		agent.buy("E", 320);
		agent.sell("F", 20);
		//set working state
		stockTradeSystem.setWorkTime(true);
		agent.buy("G", 70);
		agent.sell("H", 90);
		
		
	}
	
	
}

