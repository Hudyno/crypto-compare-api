package com.crypto.cryptocompare.api.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AssetIndustry {

    @JsonProperty("PAYMENT")
    PAYMENT,

    @JsonProperty("PLATFORM")
    PLATFORM,

    @JsonProperty("STABLECOIN")
    STABLECOIN,

    @JsonProperty("CROSS_CHAIN_INFRASTRUCTURE")
    CROSS_CHAIN_INFRASTRUCTURE,

    @JsonProperty("IDENTITY")
    IDENTITY,

    @JsonProperty("MEMBERSHIP")
    MEMBERSHIP,

    @JsonProperty("COLLECTIBLE")
    COLLECTIBLE,

    @JsonProperty("REPUTATION")
    REPUTATION,

    @JsonProperty("GOVERNANCE")
    GOVERNANCE,

    @JsonProperty("WRAPPED_COLLATERAL")
    WRAPPED_COLLATERAL,

    @JsonProperty("DECENTRALIZED_FINANCE_PROTOCOL")
    DECENTRALIZED_FINANCE_PROTOCOL,

    @JsonProperty("MEME")
    MEME,

    @JsonProperty("YIELD_FARMING")
    YIELD_FARMING,

    @JsonProperty("LIQUID_STAKED")
    LIQUID_STAKED,

    @JsonProperty("GAMING")
    GAMING
}
