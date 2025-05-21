package com.furlan.dslist.services;

import com.furlan.dslist.dto.GameDTO;
import com.furlan.dslist.dto.GameListDTO;
import com.furlan.dslist.dto.GameMinDTO;
import com.furlan.dslist.entities.Game;
import com.furlan.dslist.entities.GameList;
import com.furlan.dslist.repositories.GameListRepository;
import com.furlan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
