package com.example.user.store.jpa;

import java.util.List;
import java.util.Optional;

import com.example.user.domain.Team;
import com.example.user.domain.store.TeamStore;
import com.example.user.store.jpa.repository.TeamRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TeamJpaStore implements TeamStore {
    private TeamRepository teamRepository;

    @Override
    public Optional<Team> find(Long teamId) {
        teamRepository.findById(teamId);
        return Optional.empty();
    }

    @Override
    public List<Team> findAll() {
        return null;
    }

    @Override
    public void save(Team team) {

    }

    @Override
    public void update(Team team) {

    }
}
