package com.Marcal.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Marcal.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {

}
