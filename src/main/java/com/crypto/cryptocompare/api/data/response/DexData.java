package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DexData extends ExchangeData {

    @JsonProperty("TOTAL_AMM_SWAPS_ONCHAIN")
    private Long totalAmmSwapsOnChain;

    @JsonProperty("TOTAL_AMM_LIQUIDITY_UPDATES_ONCHAIN")
    private Long totalAmmLiquidityUpdatesOnChain;

    public void setInstrumentDataMap(Map<String, DexInstrumentData> instrumentDataMap) {
        this.instrumentDataMap = instrumentDataMap;
    }

    @Override
    public Map<String, DexInstrumentData> getInstrumentDataMap() {
        return (Map<String, DexInstrumentData>) this.instrumentDataMap;
    }


}
