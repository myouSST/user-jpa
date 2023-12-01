package com.example.user.domain.store;

import java.util.List;
import java.util.Optional;

import com.example.user.domain.Team;

public interface TeamStore {
    Optional<Team> find(Long teamId);

    List<Team> findAll();

    void save(Team team);

    void update(Team team);
}
