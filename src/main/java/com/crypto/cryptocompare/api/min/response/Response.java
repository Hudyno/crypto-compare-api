package com.crypto.cryptocompare.api.min.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response<T> {

    @JsonProperty("Response")
    private String resp;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("HasWarning")
    private Boolean hasWarning;

    @JsonProperty("Type")
    private Integer type;

    @JsonProperty("RateLimit")
    private RateLimit rateLimit;

    @JsonProperty("Data")
    private T data;
}
