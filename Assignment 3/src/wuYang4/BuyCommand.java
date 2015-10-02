package wuYang4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *BuyCommand.java
 */
public class BuyCommand implements Command{
	
	private StockTradeSystem stockTradeSystem = null;
	public HashMap<String, Integer> queue = new HashMap<String, Integer>();
	public BuyCommand(StockTradeSystem stockTradeSystem){
		this.stockTradeSystem = stockTradeSystem;
	}

	public void execute(String symbol, int amount) {
		/*
		 * noworking time, store the parameters in the hashmap 
		 */
		if(!this.stockTradeSystem.isWorkTime()){
			System.out.println("noworking time, please wait.");
			this.store(symbol, amount);
		}else{
			/*
			 * queue has parameters, get the parameters stored
			 */
			if(this.queue != null){
				Set<Map.Entry<String, Integer>> entrySet = this.load().entrySet();
				for (Map.Entry<String, Integer> entry : entrySet){
					this.stockTradeSystem.buy(entry.getKey(), entry.getValue().intValue());
				}
			}
			this.stockTradeSystem.buy(symbol, amount);
		}
	}
	/*
	 * store method
	 */
	public void store(String symbol, int amount){
		this.queue.put(symbol, new Integer(amount));
	}
	/*
	 * load method
	 */
	public HashMap<String, Integer> load(){
		return this.queue;
	}
}
