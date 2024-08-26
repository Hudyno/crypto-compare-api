package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "TYPE", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CexHistoricalOHLCV.class, name = "954"),
        @JsonSubTypes.Type(value = DexHistoricalOHLCV.class, name = "1225")
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoricalOHLCV {

    @JsonProperty("UNIT")
    private String unit;

    @JsonProperty("TIMESTAMP")
    private Long timestamp;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("MARKET")
    private String market;

    @JsonProperty("INSTRUMENT")
    private String instrument;

    @JsonProperty("MAPPED_INSTRUMENT")
    private String mappedInstrument;

    @JsonProperty("BASE")
    private String base;

    @JsonProperty("QUOTE")
    private String quote;

    @JsonProperty("BASE_ID")
    private Integer baseId;

    @JsonProperty("QUOTE_ID")
    private Integer quoteId;

    @JsonProperty("TRANSFORM_FUNCTION")
    private String transformFunction;

    @JsonProperty("OPEN")
    private Double open;

    @JsonProperty("HIGH")
    private Double high;

    @JsonProperty("LOW")
    private Double low;

    @JsonProperty("CLOSE")
    private Double close;

    @JsonProperty("VOLUME")
    private Double volume;

    @JsonProperty("QUOTE_VOLUME")
    private Double quoteVolume;

    @JsonProperty("VOLUME_BUY")
    private Double volumeBuy;

    @JsonProperty("QUOTE_VOLUME_BUY")
    private Double quoteVolumeBuy;

    @JsonProperty("VOLUME_SELL")
    private Double volumeSell;

    @JsonProperty("QUOTE_VOLUME_SELL")
    private Double quoteVolumeSell;

    @JsonProperty("VOLUME_UNKNOWN")
    private Double volumeUnknown;

    @JsonProperty("QUOTE_VOLUME_UNKNOWN")
    private Double quoteVolumeUnknown;
}
