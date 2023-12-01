package com.example.user.store.jpa.repository;

import com.example.user.store.jpa.jpo.TeamJpo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamJpo, Long> {
}
