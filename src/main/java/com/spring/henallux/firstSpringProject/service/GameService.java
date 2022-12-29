package com.spring.henallux.firstSpringProject.service;


import com.spring.henallux.firstSpringProject.dataAccess.dao.GameDataAccess;
import com.spring.henallux.firstSpringProject.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameService {
    private GameDataAccess gameDAO;


    @Autowired
    public GameService(GameDataAccess gameDAO) {
        this.gameDAO = gameDAO;
    }

    public ArrayList<Game> getAllGames(){
        return gameDAO.getAllGames();
    }

    public Game getGameById(Integer game_id){
        return gameDAO.getGameById(game_id);
    }

    public ArrayList<Game> getAllGamesByCategoryId(Integer category_id){
        return gameDAO.getAllGamesByCategoryId(category_id);
    }

}
