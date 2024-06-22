package com.demo.assignment.magicalArena;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.*;


public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player("Player A", 50, 5, 10);
        assertEquals("Player A", player.getName());
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerHealthReduction() {
        Player player = new Player("Player A", 50, 5, 10);
        player.reduceHealth(20);
        assertEquals(30, player.getHealth());
        player.reduceHealth(40);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player("Player A", 50, 5, 10);
        assertTrue(player.isAlive());
        player.reduceHealth(50);
        assertFalse(player.isAlive());
    }
}

