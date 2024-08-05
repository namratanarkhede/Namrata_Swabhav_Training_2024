package com.aurionpro.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("Alice", 'X');
        assertEquals("Alice", player.getName());
        assertEquals('X', player.getSymbol());
    }

    @Test
    public void testPlayerSymbol() {
        Player player = new Player("Bob", 'O');
        assertEquals('O', player.getSymbol());
    }

    @Test
    public void testPlayerName() {
        Player player = new Player("Charlie", 'X');
        assertEquals("Charlie", player.getName());
    }
}

