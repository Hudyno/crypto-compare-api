package com.crypto.cryptocompare.api.data;

import com.crypto.cryptocompare.api.configuration.CryptoCompareClientConfig;
import com.crypto.cryptocompare.api.data.request.HistoricalOHLCVParameters;
import com.crypto.cryptocompare.api.data.request.HistoricalSupplyParameters;
import com.crypto.cryptocompare.api.data.request.MarketsAndInstrumentsParameters;
import com.crypto.cryptocompare.api.data.request.MarketsParameters;
import com.crypto.cryptocompare.api.data.request.SummaryListParameters;
import com.crypto.cryptocompare.api.data.request.TopListParameters;
import com.crypto.cryptocompare.api.data.response.CexData;
import com.crypto.cryptocompare.api.data.response.CexHistoricalOHLCV;
import com.crypto.cryptocompare.api.data.response.DexData;
import com.crypto.cryptocompare.api.data.response.DexHistoricalOHLCV;
import com.crypto.cryptocompare.api.data.response.HistoricalSupply;
import com.crypto.cryptocompare.api.data.response.Response;
import com.crypto.cryptocompare.api.data.response.SummaryListData;
import com.crypto.cryptocompare.api.data.response.TopListData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(value = "CryptoCompareData", url = "https://data-api.cryptocompare.com", configuration = CryptoCompareClientConfig.class)
public interface CryptoCompareDataClient {

    @GetMapping("/asset/v1/summary/list")
    Response<SummaryListData> getSummaryList(@SpringQueryMap SummaryListParameters parameters);

    @GetMapping("/spot/v1/markets/instruments")
    Response<Map<String, CexData>> getSpotMarketsAndInstruments(@SpringQueryMap MarketsAndInstrumentsParameters parameters);

    @GetMapping("/onchain/v1/amm/markets/instruments")
    Response<Map<String, DexData>> getDexMarketsAndInstruments(@SpringQueryMap MarketsAndInstrumentsParameters parameters);

    @GetMapping("/spot/v1/markets")
    Response<Map<String, CexData>> getSpotMarkets(@SpringQueryMap MarketsParameters parameters);

    @GetMapping("/onchain/v1/amm/markets")
    Response<Map<String, DexData>> getDexMarkets(@SpringQueryMap MarketsParameters parameters);

    @GetMapping("/spot/v1/historical/days")
    Response<List<CexHistoricalOHLCV>> getCexDailyHistoricalOHLCV(@SpringQueryMap HistoricalOHLCVParameters parameters);

    @GetMapping("/onchain/v1/amm/historical/swap/days")
    Response<List<DexHistoricalOHLCV>> getDexDailyHistoricalOHLCV(@SpringQueryMap HistoricalOHLCVParameters parameters);

    @GetMapping("/asset/v1/top/list")
    Response<TopListData> getTopListData(@SpringQueryMap TopListParameters parameters);

    @GetMapping("/onchain/v2/historical/supply/days")
    Response<List<HistoricalSupply>> getHistoricalSupply(@SpringQueryMap HistoricalSupplyParameters parameters);
}
