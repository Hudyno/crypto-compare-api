package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CexHistoricalOHLCV extends HistoricalOHLCV{

    @JsonProperty("FIRST_TRADE_TIMESTAMP")
    private Long firstTradeTimestamp;

    @JsonProperty("LAST_TRADE_TIMESTAMP")
    private Long lastTradeTimestamp;

    @JsonProperty("FIRST_TRADE_PRICE")
    private Double firstTradePrice;

    @JsonProperty("HIGH_TRADE_PRICE")
    private Double highTradePrice;

    @JsonProperty("HIGH_TRADE_TIMESTAMP")
    private Long highTradeTimestamp;

    @JsonProperty("LOW_TRADE_PRICE")
    private Double lowTradePrice;

    @JsonProperty("LOW_TRADE_TIMESTAMP")
    private Long lowTradeTimestamp;

    @JsonProperty("LAST_TRADE_PRICE")
    private Double lastTradePrice;

    @JsonProperty("TOTAL_TRADES")
    private Long totalTrades;

    @JsonProperty("TOTAL_TRADES_BUY")
    private Long totalTradesBuy;

    @JsonProperty("TOTAL_TRADES_SELL")
    private Long totalTradesSell;

    @JsonProperty("TOTAL_TRADES_UNKNOWN")
    private Long totalTradesUnknown;
}
