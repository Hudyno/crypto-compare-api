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
public class MarketsAndInstrumentsParameters implements RequestParameters {

    @JsonProperty("market")
    private String market;

    @JsonProperty("instruments")
    private List<String> instrumentList;

    @JsonProperty("instrument_status")
    private List<String> instrumentStatusList;

    @JsonProperty("instrument_lookup_strategy")
    private String instrumentLookupStrategy;
}
