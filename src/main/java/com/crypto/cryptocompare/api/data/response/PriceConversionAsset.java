package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceConversionAsset {

    @JsonProperty("ID")
    private Long id;

    @JsonProperty("SYMBOL")
    private String symbol;

    @JsonProperty("ASSET_TYPE")
    private String assetType;

}
