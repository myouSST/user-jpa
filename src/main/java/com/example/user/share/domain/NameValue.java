package com.example.user.share.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NameValue implements JsonSerializable {

    private String name;

    private String value;

    public static NameValue sample() {
        return new NameValue("name", "길동홍");
    }

    @Override
    public String toString() {
        return toJson();
    }
}
