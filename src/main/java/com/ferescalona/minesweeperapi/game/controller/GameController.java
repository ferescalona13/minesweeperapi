package com.ferescalona.minesweeperapi.game.controller;

import com.ferescalona.minesweeperapi.game.request.NewGameRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class GameController {

    private final GameService gameService;

    @PostMapping("/startgame")
    public void startNewGame (@RequestBody final NewGameRequest newGameRequest){
        gameService.startNewGame(newGameRequest);
    }

    @GetMapping("/startgame")
    public void startNewGame (){
        gameService.startNewGame(null);
    }
}
