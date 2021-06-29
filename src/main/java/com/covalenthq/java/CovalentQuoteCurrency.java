package com.covalenthq.java;

public enum CovalentQuoteCurrency {
	usd("usd"),
	cad("cad"),
	inr("inr"),
	eth("eth"),
	eur("eur");
	
	public final String value;
	
	CovalentQuoteCurrency(String value) {
    	this.value = value;
	}
	
	public String getValue() {
        return value;
    }
}
