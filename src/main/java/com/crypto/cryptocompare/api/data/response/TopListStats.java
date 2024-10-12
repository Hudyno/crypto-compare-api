package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopListStats {

    @JsonProperty("PAGE")
    private Integer page;

    @JsonProperty("PAGE_SIZE")
    private Integer pageSize;

    @JsonProperty("TOTAL_ASSETS")
    private Long totalAssets;
}
