package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Error {

    @JsonProperty("type")
    private Integer type;

    @JsonProperty("message")
    private String message;

    @JsonProperty("other_info")
    private OtherInfo otherInfo;
}
