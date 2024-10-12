package com.crypto.cryptocompare.api.data.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoricalSupplyParameters implements RequestParameters {

    @NonNull
    @JsonProperty("asset")
    private String asset;

    @JsonProperty("groups")
    private List<String> groups;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("to_ts")
    private Long to_ts;

    @JsonProperty("aggregate")
    private Integer aggregate;

    @JsonProperty("fill")
    private Boolean fill;

    @JsonProperty("asset_lookup_priority")
    private String assetLookupPriority;

    @JsonProperty("response_format")
    private String responseFormat;
}
