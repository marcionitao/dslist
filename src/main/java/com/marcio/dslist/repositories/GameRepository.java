package com.marcio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
