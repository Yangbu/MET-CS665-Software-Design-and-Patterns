package wuYang4;

/**
 *StockTradeSystem.java
 */
public class StockTradeSystem {
	/*
	 * set workTime
	 */
	private boolean workTime = true;
	
	public boolean isWorkTime() {
		return workTime;
	}
	public void setWorkTime(boolean workTime) {
		this.workTime = workTime;
	}

	/*
	 * buy method
	 */
	public void buy(String symbol, int amount){
		System.out.println("Buy " + amount + " " + symbol + " stocks");
	}
	/*
	 * sell method
	 */
	public void sell(String symbol, int amount){
		System.err.println("Sell " + amount + " " + symbol + " stocks");
	}
}
