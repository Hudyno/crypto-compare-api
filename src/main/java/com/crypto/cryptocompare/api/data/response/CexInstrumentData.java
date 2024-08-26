package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CexInstrumentData extends InstrumentData {

    @JsonProperty("HAS_TRADES_SPOT")
    private Boolean hasTradesSpot;

    @JsonProperty("FIRST_TRADE_SPOT_TIMESTAMP")
    private Long firstTradeSpotTimestamp;

    @JsonProperty("LAST_TRADE_SPOT_TIMESTAMP")
    private Long lastTradeSpotTimestamp;

    @JsonProperty("TOTAL_TRADES_SPOT")
    private Long totalTradesSpot;

}
