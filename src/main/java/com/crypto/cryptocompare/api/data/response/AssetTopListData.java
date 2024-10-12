package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssetTopListData {

    @JsonProperty("ID")
    private Long id;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("ID_LEGACY")
    private Long idLegacy;

    @JsonProperty("ID_PARENT_ASSET")
    private Long idParentAsset;

    @JsonProperty("ID_ASSET_ISSUER")
    private Long idAssetIssuer;

    @JsonProperty("SYMBOL")
    private String symbol;

    @JsonProperty("URI")
    private String uri;

    @JsonProperty("ASSET_TYPE")
    private String assetType;

    @JsonProperty("ASSET_ISSUER_NAME")
    private String assetIssuerName;

    @JsonProperty("PARENT_ASSET_SYMBOL")
    private String parentAssetSymbol;

    @JsonProperty("CREATED_ON")
    private Long createdOn;

    @JsonProperty("UPDATED_ON")
    private Long updatedOn;

    @JsonProperty("PUBLIC_NOTICE")
    private String publicNotice;

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("LOGO_URL")
    private String logoUrl;

    @JsonProperty("LAUNCH_DATE")
    private Long launchDate;

//    @JsonProperty("PREVIOUS_ASSET_SYMBOLS")
//    private String previousAssetSymbols;

    @JsonProperty("ASSET_ALTERNATIVE_IDS")
    private List<AlternativeId> assetAlternativeIds;

    @JsonProperty("ASSET_DESCRIPTION_SNIPPET")
    private String assetDescriptionSnippet;

    @JsonProperty("ASSET_DECIMAL_POINTS")
    private Long assetDecimalPoints;

    @JsonProperty("SUPPLY_MAX")
    private BigDecimal supplyMax;

    @JsonProperty("SUPPLY_ISSUED")
    private BigDecimal supplyIssued;

    @JsonProperty("SUPPLY_TOTAL")
    private BigDecimal supplyTotal;

    @JsonProperty("SUPPLY_CIRCULATING")
    private BigDecimal supplyCirculating;

    @JsonProperty("SUPPLY_FUTURE")
    private BigDecimal supplyFuture;

    @JsonProperty("SUPPLY_LOCKED")
    private BigDecimal supplyLocked;

    @JsonProperty("SUPPLY_BURNT")
    private BigDecimal supplyBurnt;

    @JsonProperty("SUPPLY_STAKED")
    private BigDecimal supplyStaked;

    @JsonProperty("LAST_BLOCK_MINT")
    private BigDecimal lastBlockMint;

    @JsonProperty("LAST_BLOCK_BURN")
    private BigDecimal lastBlockBurn;

    @JsonProperty("PRICE_USD")
    private Double priceUsd;

    @JsonProperty("PRICE_USD_SOURCE")
    private String priceUsdSource;

    @JsonProperty("PRICE_USD_LAST_UPDATE_TS")
    private Long priceUsdLastUpdateTs;

    @JsonProperty("PRICE_CONVERSION_ASSET")
    private PriceConversionAsset priceConversionAsset;

    @JsonProperty("PRICE_CONVERSION_RATE")
    private Double priceConversionRate;

    @JsonProperty("PRICE_CONVERSION_VALUE")
    private Double priceConversionValue;

    @JsonProperty("PRICE_CONVERSION_SOURCE")
    private String priceConversionSource;

    @JsonProperty("PRICE_CONVERSION_LAST_UPDATE_TS")
    private Long priceConversionLastUpdateTs;

    @JsonProperty("MKT_CAP_PENALTY")
    private Long mktCapPenalty;

    @JsonProperty("CIRCULATING_MKT_CAP_USD")
    private BigDecimal circulatingMktCapUsd;

    @JsonProperty("TOTAL_MKT_CAP_USD")
    private BigDecimal totalMktCapUsd;

    @JsonProperty("CIRCULATING_MKT_CAP_CONVERSION")
    private BigDecimal circulatingMktCapConversion;

    @JsonProperty("TOTAL_MKT_CAP_CONVERSION")
    private BigDecimal totalMktCapConversion;

    @JsonProperty("SPOT_MOVING_24_HOUR_QUOTE_VOLUME_TOP_TIER_DIRECT_USD")
    private BigDecimal spotMoving24HourQuoteVolumeTopTierDirectUsd;

    @JsonProperty("SPOT_MOVING_24_HOUR_QUOTE_VOLUME_DIRECT_USD")
    private BigDecimal spotMoving24HourQuoteVolumeDirectUsd;

    @JsonProperty("SPOT_MOVING_24_HOUR_QUOTE_VOLUME_TOP_TIER_USD")
    private BigDecimal spotMoving24HourQuoteVolumeTopTierUsd;

    @JsonProperty("SPOT_MOVING_24_HOUR_QUOTE_VOLUME_USD")
    private BigDecimal spotMoving24HourQuoteVolumeUsd;

    @JsonProperty("SPOT_MOVING_24_HOUR_CHANGE_USD")
    private BigDecimal spotMoving24HourChangeUsd;

    @JsonProperty("SPOT_MOVING_24_HOUR_CHANGE_PERCENTAGE_USD")
    private BigDecimal spotMoving24HourChangePercentageUsd;

    @JsonProperty("SPOT_MOVING_7_DAY_CHANGE_USD")
    private BigDecimal spotMoving7DayChangeUsd;

    @JsonProperty("SPOT_MOVING_7_DAY_CHANGE_PERCENTAGE_USD")
    private BigDecimal spotMoving7DayChangePercentageUsd;

    @JsonProperty("SPOT_MOVING_30_DAY_CHANGE_USD")
    private BigDecimal spotMoving30DayChangeUsd;

    @JsonProperty("SPOT_MOVING_30_DAY_CHANGE_PERCENTAGE_USD")
    private BigDecimal spotMoving30DayChangePercentageUsd;

    @JsonProperty("TOPLIST_BASE_RANK")
    private TopListBaseRank topListBaseRank;

    @JsonProperty("ASSET_INDUSTRIES")
    private List<AssetIndustryItem> industries;
}