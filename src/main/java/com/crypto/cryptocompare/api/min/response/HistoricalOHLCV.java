package com.crypto.cryptocompare.api.min.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class HistoricalOHLCV {

    @JsonProperty("Aggregated")
    private Boolean aggregated;

    @JsonProperty("TimeFrom")
    private Integer timeFrom;

    @JsonProperty("TimeTo")
    private Integer timeTo;

    @JsonProperty("Data")
    private List<HistoricalOHLCVItem> historicalOHLCVItemList;
}
