package com.crypto.cryptocompare.api.configuration;

import feign.Logger;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CryptoCompareClientConfig {

    private final CryptoCompareConfig cryptoCompareConfig;

    @Bean
    public RequestInterceptor requestInterceptor() {

        return requestTemplate -> requestTemplate.header("Authorization", "Apikey " + cryptoCompareConfig.getKey());
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

    @Bean
    public CryptoCompareErrorDecoder errorDecoder() {
        return new CryptoCompareErrorDecoder();
    }
}
