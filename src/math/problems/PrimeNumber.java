package math.problems;

import java.io.*;
import java.util.ArrayList;

public class PrimeNumber {

    static boolean Prime(int bigNumber) {
        if (bigNumber <= 1)
            return false;

        for ( int i = 2; i < bigNumber; i++)
            if (bigNumber % i == 0)
                return false;
        return true;
    }

    static void findPrime(int bigNumber) {
        for ( int i = 2; i <= bigNumber; i++){
            if (Prime(i))
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        int bigNumber = 1000000;
        findPrime(bigNumber);

    }
}
