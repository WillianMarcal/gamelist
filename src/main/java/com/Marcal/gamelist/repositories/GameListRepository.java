package com.Marcal.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Marcal.gamelist.entities.Game;
import com.Marcal.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long > {

}


