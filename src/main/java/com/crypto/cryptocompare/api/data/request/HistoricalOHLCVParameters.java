package com.crypto.cryptocompare.api.data.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoricalOHLCVParameters extends RequestParameters {

    @NonNull
    @JsonProperty("market")
    private String market;

    @NonNull
    @JsonProperty("instrument")
    private String instrument;

    @JsonProperty("groups")
    private List<String> groups;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("to_ts")
    private Integer toTs;

    @JsonProperty("aggregate")
    private Integer aggregate;

    @JsonProperty("fill")
    private Boolean fill;

    @JsonProperty("apply_mapping")
    private Boolean applyMapping;

    @JsonProperty("response_format")
    private String responseFormat;

    @JsonProperty("instrument_lookup_strategy")
    private String instrumentLookupStrategy;
}
