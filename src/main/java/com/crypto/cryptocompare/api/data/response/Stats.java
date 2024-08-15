package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Stats {

    @JsonProperty("TOTAL_ASSETS")
    private Integer totalAssets;

    @JsonProperty("TOTAL_FILTERED_ASSETS")
    private Integer totalFilteredAssets;
}
