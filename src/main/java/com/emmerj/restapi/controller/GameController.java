package com.emmerj.restapi.controller;

import com.emmerj.restapi.model.Game;
import com.emmerj.restapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameService gameService;

    public GameController(){};

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping()
    public List<Game> getAllGames(@RequestParam(value = "title", required = false) String title){
        return gameService.getAllGames(title);
    }

    @GetMapping(value = "/{id}")
    public Game getGameById(@PathVariable("id") Integer gameId){
        return gameService.getGameById(gameId);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteGameById(@PathVariable("id") Integer gameId){
        gameService.deleteGameById(gameId);
    }

    @GetMapping(value = "/upcoming")
    public List<Game> getUpcomingGames(){
        return gameService.getUpcomingGames();
    }

    @GetMapping(value = "/singleplayer")
    public List<Game> getSinglePlayerGames(){
        return gameService.getSinglePlayerGames();
    }

    @GetMapping(value = "/multiplayer")
    public List<Game> getMultiplayerGames(){
        return gameService.getMultiplayerGames();
    }

    @PutMapping
    public void addGame(@RequestBody Game game){
        gameService.addGame(game);
    }
}
