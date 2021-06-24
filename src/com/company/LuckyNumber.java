package com.company;

import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {
    static int totalGuess;
    static int totalGame = 0;
    static double avgGame = 0;
    static int best = 0;
    static String playAgain;
    boolean isInt = false;

    public static void main(String[] args) {
        Play();
        BaoCao();
    }
    public static void Play() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean isInt = false;
        do {
//            Tao Random Number
            int ranDomNum = random.nextInt(100);
            int aNumberGuess = 1;
            int numberGuess = -1;
            System.out.println(ranDomNum);
            System.out.println("Lucky Number from 0 - 100");
//            Doan so may  man

            do {
                System.out.println("Lucky Number is:");
                try {
                    numberGuess = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Not an integer. Try again: ");
                    if (sc.hasNextLine()) sc.nextLine();
                    continue;
                }
                if (numberGuess > ranDomNum) {
                    System.out.println("Lucky Guess Smaller");
                    aNumberGuess++;
                } else if (numberGuess < ranDomNum) {
                    System.out.println("Lucky Guess Bigger");
                    aNumberGuess++;
                } else {
                    System.out.println("You're Correct " + aNumberGuess);
                }
            } while (numberGuess != ranDomNum);

            totalGuess += aNumberGuess;
            totalGame++;
            avgGame = (double) totalGuess / totalGame;
            if (aNumberGuess < best || best == 0) {
                best = aNumberGuess;
            }
            System.out.println("You want play again?");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes"));

    }
    public static void BaoCao() {
        System.out.println(" Overall result: ");
        System.out.println(" Total game =" + totalGame);
        System.out.println(" Total guesses =" + totalGuess);
        System.out.println(" Guesses/game =" + avgGame);
        System.out.println(" Best game =" + best);
    }
}
