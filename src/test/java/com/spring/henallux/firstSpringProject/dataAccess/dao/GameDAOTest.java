package com.spring.henallux.firstSpringProject.dataAccess.dao;


import com.spring.henallux.firstSpringProject.dataAccess.dao.GameDAO;
import com.spring.henallux.firstSpringProject.dataAccess.entity.CategoryEntity;
import com.spring.henallux.firstSpringProject.dataAccess.entity.DiscountEntity;
import com.spring.henallux.firstSpringProject.dataAccess.entity.GameEntity;
import com.spring.henallux.firstSpringProject.dataAccess.repository.GameRepository;
import com.spring.henallux.firstSpringProject.dataAccess.util.ProviderConverter;
import com.spring.henallux.firstSpringProject.model.Category;
import com.spring.henallux.firstSpringProject.model.Discount;
import com.spring.henallux.firstSpringProject.model.Game;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class GameDAOTest {

    private GameDAO gameDAO;

    @Mock
    private GameRepository gameRepository;

    @Before
    public void setUp() throws Exception{
        gameDAO = new GameDAO(gameRepository,new ProviderConverter());
    }

    @Test
    public void testGameDAO() {
        ArrayList<GameEntity> mockedGameEntities = new ArrayList<>();

        GameEntity gameEntity = new GameEntity();
        gameEntity.setGame_id(1);
        gameEntity.setName("Sherlock");
        gameEntity.setDescription("Suis la piste et trouve le meurtrier");
        gameEntity.setPrice(25F);

        gameEntity.setDiscount(null);

        gameEntity.setCategory(new CategoryEntity());
        gameEntity.getCategory().setCategory_id(1);

        gameEntity.setImage("games/categorie-deduction/jeu2.jpg");
        gameEntity.setMinimum_age(12);
        gameEntity.setMinimum_number_players(2);
        gameEntity.setMaximum_number_players(8);
        mockedGameEntities.add(gameEntity);

        when(gameRepository.findAll()).thenReturn(mockedGameEntities);

        ArrayList<Game> expectedResults = new ArrayList<>();
        Game game = new Game();

        game.setGame_id(1);
        game.setName("Sherlock");
        game.setDescription("Suis la piste et trouve le meurtrier");
        game.setPrice(25F);

        game.setDiscount(new Discount());

        game.setCategory(new Category());
        game.getCategory().setCategory_id(1);

        game.setImage("games/categorie-deduction/jeu2.jpg");
        game.setMinimum_age(12);
        game.setMinimum_number_players(2);
        game.setMaximum_number_players(8);

        expectedResults.add(game);

        System.out.println(gameDAO.getAllGames().toString());

        assertThat(gameDAO.getAllGames()).usingRecursiveComparison().ignoringCollectionOrder().isEqualTo(expectedResults);



    }

}
