package com.spring.henallux.firstSpringProject.dataAccess.dao;

import com.spring.henallux.firstSpringProject.model.Game;

import java.util.ArrayList;

public interface GameDataAccess {
    public ArrayList<Game> getAllGames();
    public ArrayList<Game> getAllGamesByCategoryId(Integer category_id);
    public Game getGameById(Integer game_id);
}
