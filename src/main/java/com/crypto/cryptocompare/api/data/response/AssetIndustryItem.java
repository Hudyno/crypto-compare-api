package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AssetIndustryItem {

        @JsonProperty("ASSET_INDUSTRY")
        private AssetIndustry assetIndustry;
}
