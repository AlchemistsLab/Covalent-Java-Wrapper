package com.covalenthq.java;

public enum CovalentNetworks {
	ETHERIUM("1"),
	POLYGON("137"),
	AVALANCHE("43114"),
	BINANCE_SMART_CHAIN("56"),
	FANTOM_OPERA("250"),
	TESTNET_POLYGON_MATIC_MUMBAI("80001"),
	TESTNET_FUJI_CCHAIN("43113"),
	TESTNET_KOVAN("42"),
	TESTNET_BINANCE_SMART_CHAIN("97"),
	TESTNET_MOONBASE_ALPHA("1287"),
	TESTNET_FANTOM("4002");
	
	public final String value;

    CovalentNetworks(String value) {
    	this.value = value;
	}
    
    public String getValue() {
        return value;
    }
}
