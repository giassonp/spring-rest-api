package com.emmerj.restapi.service;

import com.emmerj.restapi.model.Game;
import com.emmerj.restapi.model.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService{

    private GameRepository gameRepository;

    @Autowired
    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }
}
