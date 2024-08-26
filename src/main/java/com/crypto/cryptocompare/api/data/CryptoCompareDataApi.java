package com.crypto.cryptocompare.api.data;

import com.crypto.cryptocompare.api.data.request.HistoricalOHLCVParameters;
import com.crypto.cryptocompare.api.data.request.MarketsAndInstrumentsParameters;
import com.crypto.cryptocompare.api.data.request.MarketsParameters;
import com.crypto.cryptocompare.api.data.request.SummaryListParameters;
import com.crypto.cryptocompare.api.data.response.CexData;
import com.crypto.cryptocompare.api.data.response.CexHistoricalOHLCV;
import com.crypto.cryptocompare.api.data.response.DexData;
import com.crypto.cryptocompare.api.data.response.DexHistoricalOHLCV;
import com.crypto.cryptocompare.api.data.response.Response;
import com.crypto.cryptocompare.api.data.response.SummaryListData;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Log4j2
public class CryptoCompareDataApi {

    private final CryptoCompareDataClient cryptoCompareDataClient;


    public Response<SummaryListData> getSummaryList(SummaryListParameters parameters) {
        return cryptoCompareDataClient.getSummaryList(parameters);
    }

    public Response<Map<String, CexData>> getSpotMarketsAndInstruments(MarketsAndInstrumentsParameters parameters) {
        return cryptoCompareDataClient.getSpotMarketsAndInstruments(parameters);
    }

    public Response<Map<String, DexData>> getDexMarketsAndInstruments(MarketsAndInstrumentsParameters parameters) {
        return cryptoCompareDataClient.getDexMarketsAndInstruments(parameters);
    }

    public Response<Map<String, CexData>> getSpotMarkets(MarketsParameters parameters) {
        return cryptoCompareDataClient.getSpotMarkets(parameters);
    }

    public Response<Map<String, DexData>> getDexMarkets(MarketsParameters parameters) {
        return cryptoCompareDataClient.getDexMarkets(parameters);
    }

    public Response<List<DexHistoricalOHLCV>> getDexDailyHistoricalOHLCV(HistoricalOHLCVParameters parameters) {
        return cryptoCompareDataClient.getDexDailyHistoricalOHLCV(parameters);
    }

    public Response<List<CexHistoricalOHLCV>> getCexDailyHistoricalOHLCV(HistoricalOHLCVParameters parameters) {
        return cryptoCompareDataClient.getCexDailyHistoricalOHLCV(parameters);
    }
}
