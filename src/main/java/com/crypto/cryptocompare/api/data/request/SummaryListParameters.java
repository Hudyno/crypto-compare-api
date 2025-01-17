package com.crypto.cryptocompare.api.data.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryListParameters implements RequestParameters {

    @JsonProperty("asset_type")
    private String assetType;

    @JsonProperty("filters")
    private List<String> filters;

    @JsonProperty("assets")
    private List<String> assets;

    @JsonProperty("asset_lookup_priority")
    private String assetLookupPriority;
}
