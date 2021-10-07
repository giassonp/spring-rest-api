package com.emmerj.restapi.service;

import com.emmerj.restapi.model.Game;
import java.util.List;

public interface GameService {

    List<Game> getAllGames(String title);

    List<Game> getUpcomingGames();

    List<Game> getMultiplayerGames();

    List<Game> getSinglePlayerGames();

    Game getGameById(Integer id);

    void deleteGameById(Integer id);

    void addGame(Game game);
}
