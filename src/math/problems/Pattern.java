package math.problems;

public class Pattern {

    static void subtract(int n) {

        int count = 1;
        int times = 10;
        int amount = n - (count * times);
        for (n = 100; n > 0; n--) {
            for (n = 100; n >amount; n--) {
                System.out.println(n - count);

                if (n - count < 1) {
                    break;

                }
            }
            count += 1;
        }
    }

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */
        int n = 100;
        subtract(n);
    }
}
