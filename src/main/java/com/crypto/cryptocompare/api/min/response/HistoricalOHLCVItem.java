package com.crypto.cryptocompare.api.min.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HistoricalOHLCVItem {

    @JsonProperty("time")
    private Integer time;

    @JsonProperty("high")
    private Double high;

    @JsonProperty("low")
    private Double low;

    @JsonProperty("open")
    private Double open;

    @JsonProperty("volumefrom")
    private Double volumefrom;

    @JsonProperty("volumeto")
    private Double volumeto;

    @JsonProperty("close")
    private Double close;

    @JsonProperty("conversionType")
    private String conversionType;

    @JsonProperty("conversionSymbol")
    private String conversionSymbol;
}
