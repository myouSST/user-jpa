package com.example.user.domain;

import com.example.user.share.domain.JsonSerializable;
import com.example.user.share.domain.NameValue;
import com.example.user.share.domain.NameValueList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class User implements JsonSerializable {
    private String id;

    private String name;

    @JsonIgnore
    public void setValues(NameValueList nameValues) {
        for (NameValue nameValue : nameValues.list()) {
            String value = nameValue.getValue();
            switch (nameValue.getName()) {
                case "name":
                    this.name = value;
                    break;
                default:
                    throw new IllegalArgumentException("Update now allowed: " + nameValue);
            }
        }
    }

    public static User sample() {
        return new User("myou", "유민");
    }

    @Override
    public String toString() {
        return toJson();
    }
}
