package com.ferescalona.minesweeperapi.game.controller;

import com.ferescalona.minesweeperapi.game.request.NewGameRequest;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public void startNewGame(final NewGameRequest newGameRequest) {

        System.out.println("GAME STARTED MY FRIEND");
    }
}
