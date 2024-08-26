package com.crypto.cryptocompare.api.data;

import com.crypto.cryptocompare.api.data.request.SummaryListRequest;
import com.crypto.cryptocompare.api.data.response.AssetSummary;
import com.crypto.cryptocompare.api.data.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Objects.nonNull;

@Service
@RequiredArgsConstructor
@Log4j2
public class CryptoCompareDataApi {

    private final CryptoCompareDataClient cryptoCompareDataClient;

    public Optional<Response<AssetSummary>> getSummaryList(SummaryListRequest summaryListRequest) {
        Response<AssetSummary> response = cryptoCompareDataClient.getSummaryList(summaryListRequest);

    public Response<SummaryListData> getSummaryList(SummaryListParameters parameters) {
        return cryptoCompareDataClient.getSummaryList(parameters);
    }
}
