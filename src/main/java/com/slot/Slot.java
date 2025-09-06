package com.slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Slot {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList(
                "🍎","🍏","🍌","🍒","🍑","🍓","🍋","🍉",
                "🍇","🥝","🥑","🥥","🥭","🍍","🍊","🍈",
                "🫐","🍅"
        );

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int roundCounter = 0;

        while (roundCounter < 100) {
            List<String> roundResult = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                roundResult.add(fruits.get(rand.nextInt(fruits.size())));
            }

            System.out.print(roundCounter + ".   ");
            System.out.println(roundResult);

            if (roundResult.get(0).equals(roundResult.get(1)) && roundResult.get(0).equals(roundResult.get(2))) {
                System.out.println("🎉 JACKPOT! 🎉");
                break;
            } else {
                System.out.println("No Luck!");
            }

            roundCounter++;
            System.out.println("Press Enter for next round...");
            sc.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}


/*
Java Interview Task – Slot Machine Simulation

Objective:
Implement a simple slot machine simulation in Java that randomly generates fruit symbols and determines if the player hits a jackpot.

Requirements:

Symbols:

Use a collection of 18 fruit symbols (e.g., 🍎, 🍌, 🍒, 🥝, 🥑, 🍍, etc.).

Symbols should be stored in a collection such as List<String> or ArrayList.

Gameplay:

The slot machine should simulate 10 rounds of play.

In each round, 3 random symbols should be drawn from the collection.

Display the symbols of the current round.

Winning Condition:

If all 3 symbols in a round are identical, print "JACKPOT!" with a celebratory emoji.

Otherwise, print "No Luck!".

User Interaction:

Pause between rounds and wait for the user to press Enter to proceed.

Implementation Details:

Use proper Java best practices for random number generation (e.g., java.util.Random) instead of hard-coded values.

Ensure string comparison uses .equals() instead of ==.

Reset any counters or temporary collections between rounds to avoid accumulating results from previous rounds.

Use UTF-8 encoding to properly display emoji characters in the console.
 */