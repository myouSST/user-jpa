package com.example.user.store.jpa.jpo;

import java.util.HashSet;
import java.util.Set;

import com.example.user.domain.Team;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "team")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TeamJpo {
    @Id
    @Column(name = "id")
    private String id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = {"invoice"}, allowSetters = true)
    private Set<UserJpo> members = new HashSet<>();

    public TeamJpo(Team team) {
        this.id = team.getTeamId();
        this.members = team.getMembers();
    }
}
