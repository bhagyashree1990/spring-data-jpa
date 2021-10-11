package com.spring.jpa.repository;

import com.spring.jpa.entity.ChessTournament;
import org.springframework.stereotype.Repository;

@Repository
public interface ChessTournamentRepository extends BaseRepository<ChessTournament, Long>{
}
