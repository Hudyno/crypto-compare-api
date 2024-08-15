package com.crypto.cryptocompare.api.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "crypto-compare.api")
@Data
public class CryptoCompareConfig {

    private String key;
    private Integer rateLimit;
    private Integer refreshRate;
}
