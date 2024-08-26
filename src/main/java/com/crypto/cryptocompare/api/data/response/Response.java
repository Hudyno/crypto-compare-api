package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response<T> {

    @JsonProperty("Data")
    private T data;

    @JsonProperty("Err")
    private Error err;
}
