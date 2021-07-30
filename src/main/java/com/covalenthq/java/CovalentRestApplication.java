package com.covalenthq.java;

import static com.covalenthq.java.CovalentSession.serverUrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootApplication
public class CovalentRestApplication {
    public static final String API_KEY = "ckey_00000000000000000";
    private static final Logger log = LoggerFactory.getLogger(CovalentRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CovalentRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

        // UriComponentsBuilder API allows to create ready-to-go url with all path params and query params encoded
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(serverUrl + "{chain_id}/address/{address}/balances_v2/")
            .queryParam("key", API_KEY)
            .buildAndExpand(
                CovalentNetworks.BINANCE_SMART_CHAIN.getValue(),
                "0x685B1ded8013785d6623CC18D214320b6Bb64759");

        return args -> {
            Object response = restTemplate.getForEntity(builder.toUriString(), Object.class);
            log.info(response.toString());
        };
    }
}
