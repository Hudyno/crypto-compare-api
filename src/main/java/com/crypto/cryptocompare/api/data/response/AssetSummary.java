package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AssetSummary {

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("ID")
    private Integer id;

    @JsonProperty("SYMBOL")
    private String symbol;

    @JsonProperty("ASSET_TYPE")
    private String assetType;

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("LOGO_URL")
    private String logoUrl;

    @JsonProperty("LAUNCH_DATE")
    private Long launchDate;
}
