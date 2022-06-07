package diceGame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pirmais spēlētāj! Ieraksti savu vārdu..");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Otrais spēlētāj! Ieraksti savu vārdu..");
        Player player2 = new Player(scanner.nextLine());

        turn(player1);
        turn(player2);

        result(player1, player2);

    }

    private static void result(Player player1, Player player2) {
        if (player1.getDiceSum() > player2.getDiceSum()) {
            System.out.println("Uzvarēja spēlētājs " + player1.name);
        } else {
            System.out.println("Uzvarēja spēlētājs " + player2.name);
        }
    }

    private static void turn(Player player1) {
        int i = 0;
        int maxAttempts = 3;
        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);
        while (i < maxAttempts && shouldContinue) {
            System.out.println("Met kauliņus.." + player1.name);
            player1.dices = rollDices(6);
            System.out.println("Summa ir : " + player1.getDiceSum());
            System.out.println("Vai metīsi vēlreiz? Tev atlikuši " + (2 - i) + " metieni Y/N");
            if (scanner.nextLine().equals("N")) {
                shouldContinue=false;
            }
            i++;
        }
    }

    public static Dice[] rollDices(int numberOfDices) {
        Dice[] dices = new Dice[numberOfDices];
        for (int i = 0; i <= numberOfDices - 1; i++) {
            dices[i] = new Dice();
            dices[i].roll();
            dices[i].getFaceValue();
        }
        return dices;
    }
}

