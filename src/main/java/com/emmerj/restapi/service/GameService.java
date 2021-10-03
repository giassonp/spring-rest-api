package com.emmerj.restapi.service;

import com.emmerj.restapi.model.Game;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface GameService {

    List<Game> getAllGames(Specification<Game> spec);

    List<Game> getUpcomingGames();

    List<Game> getMultiplayerGames();

    List<Game> getSinglePlayerGames();

    Game getGameById(Integer id);

    void deleteGameById(Integer id);

    void addGame(Game game);
}
