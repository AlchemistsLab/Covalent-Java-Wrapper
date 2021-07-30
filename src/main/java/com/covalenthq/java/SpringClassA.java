package com.covalenthq.java;

import static com.covalenthq.java.CovalentRestApplication.API_KEY;
import static com.covalenthq.java.CovalentSession.serverUrl;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class SpringClassA extends CovalentClassA {

    private static final Logger log = LoggerFactory.getLogger(CovalentRestApplication.class);

    private final RestTemplate restTemplate;

    @Autowired
    public SpringClassA(RestTemplate restTemplate, CovalentSession session) {
        super(session);
        this.restTemplate = restTemplate;
    }


    @Override
    public String getTokenBalancesForAddress(CovalentNetworks cn, String address, boolean nft, boolean noNftFetch,
        CovalentQuoteCurrency cqc, String primer, String match, String group, String sort, int skip, int limit)
        throws IOException {

        // UriComponentsBuilder API allows to create ready-to-go url with all path params and query params encoded
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(serverUrl + "{chain_id}/address/{address}/balances_v2/")
            .queryParam("key", API_KEY)
            .buildAndExpand(
                CovalentNetworks.BINANCE_SMART_CHAIN.getValue(),
                "0x685B1ded8013785d6623CC18D214320b6Bb64759");

            Object response = restTemplate.getForEntity(builder.toUriString(), Object.class);
            log.info(response.toString());
            return response.toString();
    }
}
