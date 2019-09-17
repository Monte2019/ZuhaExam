package math.problems;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13,21,34
         */
        int[] Fib = new int[40];
        Fib[0] = 0;
        Fib[1] = 1;
        for (int i = 2; i<40; i++) {
            Fib[i] = Fib[i-1] + Fib[i-2];
        }
        System.out.println(Arrays.toString(Fib));
        System.out.println(Fib.length);
    }
}

