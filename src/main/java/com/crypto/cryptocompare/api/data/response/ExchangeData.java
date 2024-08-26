package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.Map;


@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "TYPE", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CexData.class, name = "602"),
        @JsonSubTypes.Type(value = DexData.class, name = "606")
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ExchangeData {

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("EXCHANGE_STATUS")
    private String exchangeStatus;

    @JsonProperty("MAPPED_INSTRUMENTS_TOTAL")
    private Integer mappedInstrumentsTotal;

    @JsonProperty("UNMAPPED_INSTRUMENTS_TOTAL")
    private Integer unmappedInstrumentsTotal;

    @JsonProperty("INSTRUMENT_STATUS")
    private InstrumentStatus instrumentStatus;

    @JsonProperty("HAS_ORDERBOOK_L2_MINUTE_SNAPSHOTS_ENABLED")
    private Boolean hasOrderbookL2MinuteSnapshotsEnabled;

    @JsonProperty("instruments")
    @Setter(AccessLevel.NONE)
    protected Map<String, ? extends InstrumentData> instrumentDataMap;

}
