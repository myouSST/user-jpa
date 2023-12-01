package com.example.user.service;

import com.example.user.domain.store.TeamStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamService {
    private final TeamStore teamStore;


}
