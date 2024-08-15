package com.crypto.cryptocompare.api.min;

import com.crypto.cryptocompare.api.min.request.HistoricalOHLCVRequest;
import com.crypto.cryptocompare.api.min.response.HistoricalOHLCV;
import com.crypto.cryptocompare.api.min.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Log4j2
public class CryptoCompareMinApi {

    private final CryptoCompareMinClient cryptoCompareMinClient;

    public Optional<Response<HistoricalOHLCV>> getDailyPairOHLCV(HistoricalOHLCVRequest request) {
        Response<HistoricalOHLCV> response = cryptoCompareMinClient.getDailyPairOHLCV(request);

        if (response.getResp().equals("Error")) {
            log.error(response.getMessage());
            return Optional.empty();
        }
        return Optional.of(response);
    }
}
