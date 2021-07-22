package com.covalenthq.java_test;
import com.covalenthq.java.*;

/**
 * @author MMoussa
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		var session=new CovalentSession("YOUR_API_KEY_HERE","json");
		var pricing = new CovalentPricing(session);
		//0x495f947276749Ce646f68AC8c248420045cb7b5e
		pricing.getHistoricalByAddress(CovalentNetworks.BINANCE_SMART_CHAIN, CovalentQuoteCurrency.usd,"0xaA0C2e4fc2b57F60FceA0a5A7b09200C918fA71b");
		pricing.getHistoricalPriceByTickerSymbol(CovalentQuoteCurrency.usd, "ETH");
		
	}

}
