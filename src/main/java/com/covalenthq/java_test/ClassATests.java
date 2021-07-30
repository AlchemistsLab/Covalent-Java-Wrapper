package com.covalenthq.java_test;

import com.covalenthq.java.CovalentClassA;
import com.covalenthq.java.CovalentNetworks;
import com.covalenthq.java.CovalentPricing;
import com.covalenthq.java.CovalentQuoteCurrency;
import com.covalenthq.java.CovalentSession;

public class ClassATests {

    public static void main(String[] args) throws Exception {
        var session = new CovalentSession("ckey_2000734ae6334c75b8b44b1466e","json");
        var pricing = new CovalentClassA(session);
        pricing.getTokenBalancesForAddress(
            CovalentNetworks.BINANCE_SMART_CHAIN,
            "0x685B1ded8013785d6623CC18D214320b6Bb64759",
            true,
            true,
            CovalentQuoteCurrency.usd,
            "[{'$match':{'decoded.params.0.value':'0x6b175474e89094c44da98b954eedeac495271d0f'}}]",
            "{block_signed_at:{$gt:'2021-07-21T03:18:56.809Z'}}",
            "{data.address: 1}",
            "{data.updated_at: 1}",
            0,
            10
            );
    }

}
