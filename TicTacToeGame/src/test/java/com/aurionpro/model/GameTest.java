package com.aurionpro.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    private Game game;
    private Player player1;
    private Player player2;

    @BeforeEach
    public void setUp() {
        player1 = new Player("Alice", 'X');
        player2 = new Player("Bob", 'O');
        game = new Game(player1, player2);
    }

    @Test
    public void testInitialPlayer() {
        assertEquals(player1, game.getCurrentPlayer());
    }

    @Test
    public void testSwitchPlayer() {
        game.startGame();
        game.switchPlayer();
        assertEquals(player2, game.getCurrentPlayer());
    }

    @Test
    public void testCheckWinner() {
        game.getBoard().makeMove(0, 0, 'X');
        game.getBoard().makeMove(0, 1, 'X');
        game.getBoard().makeMove(0, 2, 'X');
        assertTrue(game.checkWinner());
    }

    @Test
    public void testIsDraw() {
        char[][] drawGrid = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'O'}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game.getBoard().makeMove(i, j, drawGrid[i][j]);
            }
        }
        assertTrue(game.isDraw());
    }

    @Test
    public void testIsNotDraw() {
        game.getBoard().makeMove(0, 0, 'X');
        assertFalse(game.isDraw());
    }
}
