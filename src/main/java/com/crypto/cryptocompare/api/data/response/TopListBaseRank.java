package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopListBaseRank {

    @JsonProperty("CREATED_ON")
    private Long createdOn;

    @JsonProperty("LAUNCH_DATE")
    private Long launchDate;

    @JsonProperty("CIRCULATING_MKT_CAP_USD")
    private BigDecimal circulatingMktCapUsd;

    @JsonProperty("TOTAL_MKT_CAP_USD")
    private BigDecimal totalMktCapUsd;

    @JsonProperty("SPOT_MOVING_24_HOUR_QUOTE_VOLUME_USD")
    private BigDecimal spotMoving24HourQuoteVolumeUsd;

    @JsonProperty("SPOT_MOVING_7_DAY_QUOTE_VOLUME_USD")
    private BigDecimal spotMoving7DayQuoteVolumeUsd;

    @JsonProperty("SPOT_MOVING_30_DAY_QUOTE_VOLUME_USD")
    private BigDecimal spotMoving30DayQuoteVolumeUsd;
}
