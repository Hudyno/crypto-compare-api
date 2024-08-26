package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DexInstrumentData extends InstrumentData {

    @JsonProperty("HAS_AMM_SWAPS_ONCHAIN")
    private Boolean hasAmmSwapsOnChain;

    @JsonProperty("FIRST_AMM_SWAP_ONCHAIN_TIMESTAMP")
    private Long firstAmmSwapOnChainTimestamp;

    @JsonProperty("LAST_AMM_SWAP_ONCHAIN_TIMESTAMP")
    private Long lastAmmSwapOnChainTimestamp;

    @JsonProperty("TOTAL_AMM_SWAPS_ONCHAIN")
    private Integer totalAmmSwapsOnChain;

    @JsonProperty("HAS_AMM_LIQUIDITY_UPDATES_ONCHAIN")
    private Boolean hasAmmLiquidityUpdatesOnChain;

    @JsonProperty("FIRST_AMM_LIQUIDITY_UPDATE_ONCHAIN_TIMESTAMP")
    private Long firstAmmLiquidityUpdateOnChainTimestamp;

    @JsonProperty("LAST_AMM_LIQUIDITY_UPDATE_ONCHAIN_TIMESTAMP")
    private Long lastAmmLiquidityUpdateOnChainTimestamp;

    @JsonProperty("TOTAL_AMM_LIQUIDITY_UPDATES_ONCHAIN")
    private Integer totalAmmLiquidityUpdatesOnChain;

    @JsonProperty("INSTRUMENT_MARKET_FEE_PERCENTAGE")
    private Double instrumentMarketFeePercentage;

    @JsonProperty("INSTRUMENT_BASE_TOKEN_ADDRESS")
    private String instrumentBaseTokenAddress;

    @JsonProperty("INSTRUMENT_QUOTE_TOKEN_ADDRESS")
    private String instrumentQuoteTokenAddress;

}
