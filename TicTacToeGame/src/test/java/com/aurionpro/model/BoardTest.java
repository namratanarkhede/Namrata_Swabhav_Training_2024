package com.aurionpro.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    private Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testBoardInitialization() {
        char[][] expected = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        assertArrayEquals(expected, board.getGrid());
    }

    @Test
    public void testMakeMoveValid() {
        assertTrue(board.makeMove(0, 0, 'X'));
        assertEquals('X', board.getGrid()[0][0]);
    }

    @Test
    public void testMakeMoveInvalid() {
        board.makeMove(0, 0, 'X');
        assertFalse(board.makeMove(0, 0, 'O'));  // Spot already taken
    }

    @Test
    public void testCheckWinnerRow() {
        board.makeMove(0, 0, 'X');
        board.makeMove(0, 1, 'X');
        board.makeMove(0, 2, 'X');
        assertTrue(board.checkWinner('X'));
    }

    @Test
    public void testCheckWinnerColumn() {
        board.makeMove(0, 0, 'O');
        board.makeMove(1, 0, 'O');
        board.makeMove(2, 0, 'O');
        assertTrue(board.checkWinner('O'));
    }

    @Test
    public void testCheckWinnerDiagonal() {
        board.makeMove(0, 0, 'X');
        board.makeMove(1, 1, 'X');
        board.makeMove(2, 2, 'X');
        assertTrue(board.checkWinner('X'));
    }

    @Test
    public void testBoardIsFull() {
        char[][] fullGrid = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'O'}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.makeMove(i, j, fullGrid[i][j]);
            }
        }
        assertTrue(board.isFull());
    }

    @Test
    public void testBoardNotFull() {
        board.makeMove(0, 0, 'X');
        assertFalse(board.isFull());
    }
}
