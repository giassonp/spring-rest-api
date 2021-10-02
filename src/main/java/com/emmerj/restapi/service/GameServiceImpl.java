package com.emmerj.restapi.service;

import com.emmerj.restapi.model.Game;
import com.emmerj.restapi.model.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GameServiceImpl implements GameService{


   private GameRepository gameRepository;

    public GameServiceImpl(){};

    @Autowired
    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }
}
