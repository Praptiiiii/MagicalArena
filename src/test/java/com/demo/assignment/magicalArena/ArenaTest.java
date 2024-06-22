package com.demo.assignment.magicalArena;


import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit tests for the Arena class.
 */
public class ArenaTest {
    @Test
    public void testFight() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Arena arena = new Arena(playerA, playerB);

        arena.fight();

        assertTrue(playerA.isAlive() || playerB.isAlive());
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}
