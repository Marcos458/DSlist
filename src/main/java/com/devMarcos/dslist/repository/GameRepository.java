package com.devMarcos.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devMarcos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
