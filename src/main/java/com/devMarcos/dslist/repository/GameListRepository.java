package com.devMarcos.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devMarcos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
