package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopListData {

    @JsonProperty("STATS")
    private TopListStats stats;

    @JsonProperty("LIST")
    private List<AssetTopListData> assetData;
}
