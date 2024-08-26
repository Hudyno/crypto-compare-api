package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstrumentMapping {

    @JsonProperty("MAPPED_INSTRUMENT")
    private String mappedInstrument;

    @JsonProperty("CHAIN_ASSET_SYMBOL")
    private String chainAssetSymbol;

    @JsonProperty("CHAIN_ASSET_ID")
    private Integer chainAssetId;

    @JsonProperty("BASE")
    private String base;

    @JsonProperty("BASE_ID")
    private Integer baseId;

    @JsonProperty("QUOTE")
    private String quote;

    @JsonProperty("QUOTE_ID")
    private Integer quoteId;

    @JsonProperty("TRANSFORM_FUNCTION")
    private String transformFunction;

    @JsonProperty("CREATED_ON")
    private Integer createdOn;
}
