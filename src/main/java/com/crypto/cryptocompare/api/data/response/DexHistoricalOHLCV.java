package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DexHistoricalOHLCV extends HistoricalOHLCV {

    @JsonProperty("FIRST_SWAP_TIMESTAMP")
    private Long firstSwapTimestamp;

    @JsonProperty("FIRST_SWAP_BLOCK")
    private Double firstSwapBlock;

    @JsonProperty("LAST_SWAP_TIMESTAMP")
    private Long lastSwapTimestamp;

    @JsonProperty("LAST_SWAP_BLOCK")
    private Double lastSwapBlock;

    @JsonProperty("FIRST_SWAP_PRICE")
    private Double firstSwapPrice;

    @JsonProperty("HIGH_SWAP_PRICE")
    private Double highSwapPrice;

    @JsonProperty("HIGH_SWAP_TIMESTAMP")
    private Long highSwapTimestamp;

    @JsonProperty("HIGH_SWAP_BLOCK")
    private Double highSwapBlock;

    @JsonProperty("LOW_SWAP_PRICE")
    private Double lowSwapPrice;

    @JsonProperty("LOW_SWAP_TIMESTAMP")
    private Long lowSwapTimestamp;

    @JsonProperty("LOW_SWAP_BLOCK")
    private Double lowSwapBlock;

    @JsonProperty("LAST_SWAP_PRICE")
    private Double lastSwapPrice;

    @JsonProperty("TOTAL_SWAPS")
    private Long totalSwaps;

    @JsonProperty("TOTAL_SWAPS_BUY")
    private Long totalSwapsBuy;

    @JsonProperty("TOTAL_SWAPS_SELL")
    private Long totalSwapsSell;

    @JsonProperty("TOTAL_SWAPS_UNKNOWN")
    private Long totalSwapsUnknown;
}
