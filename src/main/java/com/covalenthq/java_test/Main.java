package com.covalenthq.java_test;
import com.covalenthq.java.*;

/**
 * @author MMoussa
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		CovalentSession session=new CovalentSession("ckey_8b3b6571d83c49458ff461dfc32","json");
		CovalentPricing p = new CovalentPricing(session);
		//0x495f947276749Ce646f68AC8c248420045cb7b5e
		p.getHistoricalByAddress(CovalentNetworks.BinanceSmartChain, CovalentQuoteCurrency.usd,"0xaA0C2e4fc2b57F60FceA0a5A7b09200C918fA71b");
		p.getHistoricalPriceByTickerSymbol(CovalentQuoteCurrency.usd, "ETH");
		
	}

}
