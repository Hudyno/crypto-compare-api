package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CexData extends ExchangeData {

    @JsonProperty("TOTAL_TRADES_SPOT")
    private Long totalTradesSpot;

    public void setInstrumentDataMap(Map<String, CexInstrumentData> instrumentDataMap) {
        this.instrumentDataMap = instrumentDataMap;
    }

    @Override
    public Map<String, CexInstrumentData> getInstrumentDataMap() {
        return (Map<String, CexInstrumentData>) this.instrumentDataMap;
    }


}
