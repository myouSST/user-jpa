package com.example.user.share.domain;

import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NameValueList implements JsonSerializable {
    private List<NameValue> nameValues;

    public static NameValueList sample() {
        return new NameValueList(Collections.singletonList(NameValue.sample()));
    }

    public List<NameValue> list() {
        return nameValues;
    }

    public static void main(String[] args) {
        System.out.println(sample());
    }


}
