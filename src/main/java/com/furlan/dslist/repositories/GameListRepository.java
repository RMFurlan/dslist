package com.furlan.dslist.repositories;

import com.furlan.dslist.entities.Game;
import com.furlan.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
