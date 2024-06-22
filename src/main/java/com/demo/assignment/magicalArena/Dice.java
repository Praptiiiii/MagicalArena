package com.demo.assignment.magicalArena;

import java.util.Random;

/**
 * Represents a dice with a specified number of sides.
 */
public class Dice {
    private final int sides;
    private final Random random;

    /**
     * Initializes a dice with the given number of sides.
     * 
     * @param sides the number of sides of the dice
     */
    public Dice(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    /**
     * Rolls the dice and returns a random number between 1 and the number of sides.
     * 
     * @return the result of the dice roll
     */
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}
