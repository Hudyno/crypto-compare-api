package com.crypto.cryptocompare.api.data.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoricalSupply {

    @JsonProperty("UNIT")
    private String unit;

    @JsonProperty("TIMESTAMP")
    private Long timestamp;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("ASSET_ID")
    private Long assetId;

    @JsonProperty("SYMBOL")
    private String symbol;

    @JsonProperty("SUPPLY_CIRCULATING")
    private BigDecimal supplyCirculating;

    @JsonProperty("SUPPLY_TOTAL")
    private BigDecimal supplyTotal;

    @JsonProperty("SUPPLY_BURNT")
    private BigDecimal supplyBurnt;

    @JsonProperty("SUPPLY_MAX")
    private BigDecimal supplyMax;

    @JsonProperty("SUPPLY_STAKED")
    private BigDecimal supplyStaked;

    @JsonProperty("SUPPLY_FUTURE")
    private BigDecimal supplyFuture;

    @JsonProperty("SUPPLY_ISSUED")
    private BigDecimal supplyIssued;

    @JsonProperty("SUPPLY_LOCKED")
    private BigDecimal supplyLocked;
}
