package com.spring.henallux.firstSpringProject.dataAccess.dao;

import com.spring.henallux.firstSpringProject.dataAccess.entity.GameEntity;
import com.spring.henallux.firstSpringProject.dataAccess.repository.GameRepository;
import com.spring.henallux.firstSpringProject.dataAccess.util.ProviderConverter;
import com.spring.henallux.firstSpringProject.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class GameDAO implements GameDataAccess {

    private GameRepository gameRepository;
    private ProviderConverter providerConverter;

    @Autowired
    public GameDAO(GameRepository gameRepository, ProviderConverter providerConverter) {
        this.gameRepository = gameRepository;
        this.providerConverter = providerConverter;
    }

    public ArrayList<Game> getAllGames() {
        List<GameEntity> gameEntities = gameRepository.findAll();
        ArrayList<Game> games = new ArrayList<>();
        for (GameEntity entity : gameEntities) {
            Game game = providerConverter.gameEntityToGameModel(entity);
            games.add(game);
        }
        return games;
    }

    public ArrayList<Game> getAllGamesByCategoryId(Integer category_id){
        List<GameEntity> gameEntities = gameRepository.findByCategoryCategoryId(category_id);
        ArrayList<Game> games = new ArrayList<>();
        for (GameEntity entity : gameEntities) {
            Game game = providerConverter.gameEntityToGameModel(entity);
            games.add(game);
        }
        return games;
    }

    public Game getGameById(Integer game_id){
        GameEntity gameEntity = gameRepository.findById(game_id).orElse(null);
        if(gameEntity != null){
            Game game = providerConverter.gameEntityToGameModel(gameEntity);
            return game;
        }
        return null;
    }
}
