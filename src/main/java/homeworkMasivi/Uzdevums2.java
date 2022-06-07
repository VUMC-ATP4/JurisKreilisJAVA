package homeworkMasivi;

import java.util.Scanner;

public class Uzdevums2 {

    public static void main(String[] args) {

        isPrime(7);//2 uzdevums
        populateArray();//4 uzdevums
        System.out.println(calculateFactorial(10)); // 5 uzdevums
        enterPin();//6 uzdevums
//        waitUntilSum();
    }

    public static void waitUntilSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (sum <= 100) {
            sum = sum + scanner.nextInt();
            System.out.println("summa ir " + sum);
        }
        System.out.println("summa ir " + sum);
        System.out.println("Gatavs");
    }

    public static void enterPin() {
        Scanner scanner = new Scanner(System.in);
        int PIN = 1234;
        int meginajumuSkaits = 0;

        while (meginajumuSkaits < 3) {
            System.out.println("Ievadi PIN");
            if (PIN == scanner.nextInt()) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            }
            if (meginajumuSkaits == 3) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
                break;
            }
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            meginajumuSkaits++;
        }

    }


    public static int calculateFactorial(int a) {
        int factorialValue = 1;
        for (int i = 1; i <= a; i++) {
            factorialValue = factorialValue * i;
        }
        return factorialValue;
    }


    public static void populateArray() {
        int[] skaitluMasivs = new int[100];
        int b = 2;
        for (int i = 0; i < skaitluMasivs.length; i++) {
            skaitluMasivs[i] = b;
            b = b + 2;
        }
    }


    public static void isPrime(int skaitlis) {
        boolean isPrime = true;
        int i = 2;
        while (i <= skaitlis / 2) {
            if (skaitlis % i == 0) {
                isPrime = false;
                break;
            } else {
                i++;
            }
        }
        System.out.println(skaitlis + " pirmskaitlis " + isPrime);

    }

}
