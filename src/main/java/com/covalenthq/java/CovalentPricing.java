package com.covalenthq.java;

import java.io.IOException;


/**
 * @author Wisso
 *
 */
public class CovalentPricing {
	private CovalentSession covSession;
	public CovalentPricing(CovalentSession covSession) {
		this.covSession=covSession;
	}
	
	// GET pricing/historical_by_address/{chain_id}/{quote_currency}/{contract_address}/
	public String getHistoricalByAddress(CovalentNetworks cn,CovalentQuoteCurrency cqc,String contractAddress) throws IOException {
		String req = "pricing/historical_by_address/"+cn.getValue()+"/"+cqc.getValue()+"/"+contractAddress+"/";
		return covSession.query(req);
	}
	// GET pricing/historical_by_addresses_v2/{chain_id}/{quote_currency}/{contract_addresses}/
	public String getHistoricalByAddressesV2(CovalentNetworks cn,CovalentQuoteCurrency cqc,String contractAddresses) throws IOException {
		String req = "pricing/historical_by_addresses_v2/"+cn.getValue()+"/"+cqc.getValue()+"/"+contractAddresses+"/";
		return covSession.query(req);
	}
	// GET pricing/historical_by_addresses/{chain_id}/{quote_currency}/{contract_addresses}/
	public String getHistoricalByAddresses(CovalentNetworks cn,CovalentQuoteCurrency cqc,String contractAddresses) throws IOException {
		String req = "pricing/historical_by_addresses/"+cn.getValue()+"/"+cqc.getValue()+"/"+contractAddresses+"/";
		return covSession.query(req);
	}
	// GET pricing/historical/{quote_currency}/{ticker_symbol}/
	public String getHistoricalPriceByTickerSymbol(CovalentQuoteCurrency cqc,String tickerSymbol) throws IOException {
		String req = "pricing/historical/"+cqc.getValue()+"/"+tickerSymbol+"/";
		return covSession.query(req);
	}
	// GET pricing/tickers/
	public String getSpotPrices(CovalentQuoteCurrency cqc) throws IOException {
		String req = "pricing/tickers/"+cqc.getValue()+"/";
		return covSession.query(req);
	}
	public String getSpotPricesByTickerSymbol(CovalentQuoteCurrency cqc,String tickersSymbols) throws IOException {
		String req = "pricing/tickers/"+cqc.getValue()+"/?tickers="+tickersSymbols;
		return covSession.query(req);
	}
	// GET pricing/volatility/
	public String getPricesVolatility(CovalentQuoteCurrency cqc) throws IOException {
		String req = "pricing/volatility/"+cqc.getValue()+"/";
		return covSession.query(req);
	}
	/**
	 * @param cqc
	 * @param tickersSymbols
	 * @return
	 * @throws IOException
	 */
	public String getPricesVolatilityByTickerSymbol(CovalentQuoteCurrency cqc,String tickersSymbols) throws IOException {
		String req = "pricing/volatility/"+cqc+"/?tickers="+tickersSymbols;
		return covSession.query(req);
	}
	// 
}
