package com.crypto.cryptocompare.api.data;

import com.crypto.cryptocompare.api.configuration.CryptoCompareClientConfig;
import com.crypto.cryptocompare.api.data.request.SummaryListRequest;
import com.crypto.cryptocompare.api.data.response.AssetSummary;
import com.crypto.cryptocompare.api.data.response.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "CryptoCompareData", url = "https://data-api.cryptocompare.com", configuration = CryptoCompareClientConfig.class)
public interface CryptoCompareDataClient {

    @GetMapping("/asset/v1/summary/list")
    Response<AssetSummary> getSummaryList(@SpringQueryMap SummaryListRequest summaryListRequest);
}
