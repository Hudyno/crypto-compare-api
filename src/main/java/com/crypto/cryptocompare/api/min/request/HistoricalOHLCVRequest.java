package com.crypto.cryptocompare.api.min.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class HistoricalOHLCVRequest {

    @NonNull
    @JsonProperty("fsym")
    private String fsym;

    @NonNull
    @JsonProperty("tsym")
    private String tsym;

    @JsonProperty("tryConversion")
    private Boolean tryConversion;

    @JsonProperty("e")
    private String e;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("aggregate")
    private Integer aggregate;

    @JsonProperty("aggregatePredictableTimePeriods")
    private Boolean aggregatePredictableTimePeriods;

    @JsonProperty("allData")
    private Boolean allData;

    @JsonProperty("to_ts")
    private Instant toTs;

    @JsonProperty("explainPath")
    private Boolean explainPath;

    @JsonProperty("extraParams")
    private String extraParams;

    @JsonProperty("sign")
    private Boolean sign;
}
