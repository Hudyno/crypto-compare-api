package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstrumentStatus {

    @JsonProperty("ACTIVE")
    private Integer active;

    @JsonProperty("IGNORED")
    private Integer ignored;

    @JsonProperty("RETIRED")
    private Integer retired;

    @JsonProperty("EXPIRED")
    private Integer expired;
}
