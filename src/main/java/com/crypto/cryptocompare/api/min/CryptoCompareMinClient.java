package com.crypto.cryptocompare.api.min;

import com.crypto.cryptocompare.api.configuration.CryptoCompareClientConfig;
import com.crypto.cryptocompare.api.min.request.HistoricalOHLCVRequest;
import com.crypto.cryptocompare.api.min.response.HistoricalOHLCV;
import com.crypto.cryptocompare.api.min.response.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "CryptoCompareMin", url = "https://min-api.cryptocompare.com", configuration = CryptoCompareClientConfig.class)
public interface CryptoCompareMinClient {

    @GetMapping("/data/v2/histoday")
    Response<HistoricalOHLCV> getDailyPairOHLCV(@SpringQueryMap HistoricalOHLCVRequest historicalOHLCVRequest);
}
