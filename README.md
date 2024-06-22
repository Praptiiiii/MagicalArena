# Magical Arena

Magical Arena is a simple simulation of a magical arena where two players fight until one of them dies. The players take turns attacking and defending, and their health is reduced based on the damage calculations.

## Table of Contents

- [Getting Started](#getting-started)
- [Usage](#usage)
- [Running the Tests](#running-the-tests)
- [Project Structure](#project-structure)
- [Design Details](#design-details)

## Getting Started

These instructions will help you set up and run the Magical Arena project on your local machine for development and testing purposes.

### Prerequisites

- Java 11+
- Maven

### Design Details
Arena
The Arena class is responsible for managing the fight between two players. It initializes the players and the dice, and it controls the turn-based fighting logic. The fight continues until one player's health reaches zero.

Dice
The Dice class simulates a dice roll with a configurable number of sides. It uses the Random class to generate random numbers representing the dice rolls.

Player
The Player class represents a player with health, strength, and attack attributes. It includes methods to reduce the player's health and check if the player is still alive.

Testing
The project includes unit tests for the Player and Arena classes. These tests ensure that the player initialization, health reduction, and fight mechanics work correctly.
