package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data<T> {

    @JsonProperty("STATS")
    private Stats stats;

    @JsonProperty("LIST")
    private List<T> list;
}
