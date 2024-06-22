package com.demo.assignment.magicalArena;


public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice attackDice;
    private Dice defendDice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackDice = new Dice(6);
        this.defendDice = new Dice(6);
    }

    public void fight() {
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                takeTurn(playerA, playerB);
                if (playerB.isAlive()) {
                    takeTurn(playerB, playerA);
                }
            } else {
                takeTurn(playerB, playerA);
                if (playerA.isAlive()) {
                    takeTurn(playerA, playerB);
                }
            }
        }
        printWinner();
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = attackDice.roll();
        int defendRoll = defendDice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;

        int damage = Math.max(0, attackDamage - defendStrength);
        defender.reduceHealth(damage);

        System.out.printf("%s attacks with %d damage, %s defends with %d strength, %s loses %d health.\n",
                attacker.getName(), attackDamage, defender.getName(), defendStrength, defender.getName(), damage);
    }

    private void printWinner() {
        if (playerA.isAlive()) {
            System.out.println(playerA.getName() + " wins!");
        } else {
            System.out.println(playerB.getName() + " wins!");
        }
    }

    public static void main(String[] args) {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        arena.fight();
    }
}

