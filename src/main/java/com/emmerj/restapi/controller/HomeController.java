package com.emmerj.restapi.controller;

import com.emmerj.restapi.model.Game;
import com.emmerj.restapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    private GameService gameService;

    @Autowired
    public HomeController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping(value = "/games")
    public List<Game> getItinerary(){
        return gameService.getAllGames();
    }
}
