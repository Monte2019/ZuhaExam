package math.problems;

import java.util.Scanner;

public class Factorial {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = userNumber.nextInt();
        int fact = 1;


        if (n < 1) {
            System.out.println(1);
        }

        for (int i = 2;i <=n; i++){
            fact*= i;
        }
        System.out.println(fact);

    }
}
