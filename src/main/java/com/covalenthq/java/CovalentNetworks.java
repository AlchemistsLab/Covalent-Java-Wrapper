package com.covalenthq.java;

public enum CovalentNetworks {
	Ethereum("1"),
	Polygon("137"),
	Avalanche("43114"),
	BinanceSmartChain("56"),
	FantomOpera("250"),
	TestnetPolygonMaticMumbai("80001"),
	TestnetFujiCChain("43113"),
	TestnetKovan("42"),
	TestnetBinanceSmartChain("97"),
	TestnetMoonbaseAlpha("1287"),
	TestnetFantom("4002");
	
	public final String value;

    CovalentNetworks(String value) {
    	this.value = value;
	}
    
    public String getValue() {
        return value;
    }
}
