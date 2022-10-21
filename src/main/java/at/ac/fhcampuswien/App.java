package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int firstDay) {
        int CurrentDay = 1;
        switch (firstDay) {
            case 1:
                System.out.print(" " + CurrentDay++);
                break;
            case 2:
                System.out.print("    " + CurrentDay++);
                break;
            case 3:
                System.out.print("       " + CurrentDay++);
                break;
            case 4:
                System.out.print("          " + CurrentDay++);
                break;
            case 5:
                System.out.print("             " + CurrentDay++);
                break;
            case 6:
                System.out.print("                " + CurrentDay++);
                break;
            case 7:
                System.out.print("                   " + CurrentDay++);
                break;
        }

        for (; CurrentDay <= 8 - firstDay; CurrentDay++) {
            System.out.print("  " + CurrentDay);
        }

        System.out.println(" ");
        for (; CurrentDay <= 15 - firstDay; CurrentDay++) {
            if (CurrentDay >= 9) {
                System.out.print(" " + CurrentDay);
            } else {
                System.out.print(" " + CurrentDay + " ");
            }
        }

        System.out.println(" ");
        for (; CurrentDay <= 22 - firstDay; CurrentDay++) {
            System.out.print(CurrentDay + " ");
        }

        System.out.println();
        if (days < 30) {
            for (; CurrentDay <= 29 - firstDay; CurrentDay++) {
                if (CurrentDay - 7 >= 17) {
                    System.out.print(CurrentDay + " ");
                } else {
                    System.out.print(CurrentDay + " ");
                }
            }

            System.out.println();
            for (; CurrentDay <= days; CurrentDay++) {
                if (CurrentDay - 7 >= 17) {
                    System.out.print(CurrentDay + " ");
                } else {
                    System.out.print(CurrentDay + " ");
                }
            }
        } else {
            for (; CurrentDay <= 29 - firstDay; CurrentDay++) {

                if (CurrentDay - 7 >= 24) {
                    System.out.print(" " + CurrentDay + " ");
                } else {
                    System.out.print(CurrentDay + " ");
                }
            }

            System.out.println();
            for (; CurrentDay <= days; CurrentDay++) {
                System.out.print(CurrentDay + " ");
            }
        }

        System.out.println();
    }

    public static long[] lcg(long seed) {
        System.out.println("Pseudo Random Numbers");
        long[] array = new long[10];
        int a = 1103515245, c = 12345;
        long m = 1L << 31;
        array[0] = (a * seed + c) % m;
        for (int i = 1; i < array.length; i++) {
            array[i] = (a * array[i - 1] + c) % m;
        }
        return array;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i >= 1; i++) {
            System.out.print("Guess number " + i + ": ");
            int number = scanner.nextInt();
            if (number == numberToGuess && i <= 10) {
                System.out.println("You won wisenheimer!");
                return;
            }
            if (number < numberToGuess && i < 10) {
                System.out.println("The number AI picked is higher than your guess.");
            }
            if (number > numberToGuess && i < 10) {
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (i == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        int numberToGuess = 1 + (int) (Math.random() * 100);
        return numberToGuess;
    }

    public static boolean swapArrays(int[] array1, int[] array2) {
        System.out.println("Swap Arrays");
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                int[] temp = new int[array1.length];
                temp[i] = array1[i];
                array1[i] = array2[i];
                array2[i] = temp[i];
            }
            return true;
        } else return false;
    }

    public static int checkDigit(int[] code) {
        System.out.println("Check Digit");
        int summe = 0;
        for (int i = 0; i < code.length; i++) {
            summe += (i + 2) * code[i];
        }
        int pruefziffer = 11 - (summe % 11);
        if (pruefziffer == 10) {
            pruefziffer = 0;
        }
        if (pruefziffer == 11) {
            pruefziffer = 5;
        }
        return pruefziffer;
    }

    public static String camelCase(String input) {                  // nicht gelöst
        System.out.println("CamelCase");
        char[] inputChars = input.toCharArray();
        return input;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        //oneMonthCalendar(31, 6);
        //lcg(10);
        //guessingGame(randomNumberBetweenOneAndHundred());
        //swapArrays(int[] array1,int[] array2);
    }
}