package com.example.user.domain;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;

import com.example.user.share.domain.JsonSerializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Team implements JsonSerializable {

    private String teamId;

    private Set<User> members;

    public static Team sample() {
        return new Team(
            UUID.randomUUID().toString(),
            Collections.singleton(User.sample())
        );
    }

    public static void main(String[] args) {
        System.out.println(sample());
    }

    @Override
    public String toString() {
        return toJson();
    }
}
