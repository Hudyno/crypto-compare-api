package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "TYPE", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CexInstrumentData.class, name = "612"),
        @JsonSubTypes.Type(value = DexInstrumentData.class, name = "1201")
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class InstrumentData {

    @JsonProperty("INSTRUMENT_MAPPING")
    protected InstrumentMapping instrumentMapping;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("INSTRUMENT_STATUS")
    private String instrumentStatus;

    @JsonProperty("INSTRUMENT")
    private String instrument;

    @JsonProperty("HISTO_SHARD")
    private String histoShard;

    @JsonProperty("MAPPED_INSTRUMENT")
    private String mappedInstrument;

}
