package com.crypto.cryptocompare.api.configuration;

import feign.Response;
import feign.codec.ErrorDecoder;


public class CryptoCompareErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {
            default:
                return new RuntimeException(response.body().toString());
        }
    }
}
