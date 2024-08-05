package com.aurionpro.model;

public class TicTacToeFacade {
    private Game game;

    public TicTacToeFacade() {
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');
        game = new Game(player1, player2);
    }

    public void play() {
        game.startGame();
    }
}
