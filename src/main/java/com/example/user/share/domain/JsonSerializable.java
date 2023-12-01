package com.example.user.share.domain;

import java.io.Serializable;

import com.example.user.util.JsonUtils;

public interface JsonSerializable extends Serializable {
    default String toJson() {
        return JsonUtils.toJson(this);
    }
}
