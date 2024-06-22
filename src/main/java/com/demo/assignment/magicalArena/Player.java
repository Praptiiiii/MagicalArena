package com.demo.assignment.magicalArena;

/**
 * Represents a player with health, strength, and attack attributes.
 */
public class Player {
    private final String name;
    private int health;
    private final int strength;
    private final int attack;

    /**
     * Initializes a player with the given attributes.
     * 
     * @param name     the name of the player
     * @param health   the health of the player
     * @param strength the strength of the player
     * @param attack   the attack power of the player
     */
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    /**
     * Gets the name of the player.
     * 
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the health of the player.
     * 
     * @return the health of the player
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the strength of the player.
     * 
     * @return the strength of the player
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Gets the attack power of the player.
     * 
     * @return the attack power of the player
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Checks if the player is still alive.
     * 
     * @return true if the player's health is greater than zero, false otherwise
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Reduces the health of the player by the given amount.
     * 
     * @param amount the amount of health to reduce
     */
    public void reduceHealth(int amount) {
        this.health = Math.max(0, this.health - amount);
    }
}
