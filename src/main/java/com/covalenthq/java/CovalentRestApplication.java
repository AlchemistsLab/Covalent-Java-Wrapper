package com.covalenthq.java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CovalentRestApplication {
    public static final String API_KEY = "ckey_00000000000000000";

    public static void main(String[] args) {
        SpringApplication.run(CovalentRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean CovalentSession covalentSession() {
        return new CovalentSession(API_KEY, "json");
    }

    @Bean
    public CommandLineRunner run(SpringClassA springClassA) {

        return args -> springClassA.getTokenBalancesForAddress(
            CovalentNetworks.BINANCE_SMART_CHAIN,
            "0x685B1ded8013785d6623CC18D214320b6Bb64759", false, false, CovalentQuoteCurrency.usd,
        null, null, null, null, 0, 50);
    }
}
