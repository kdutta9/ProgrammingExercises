/** Output the Fibonacci number, for a given input.
 * Source: https://algorithms.tutorialhorizon.com/introduction-to-dynamic-programming-fibonacci-series/
 *         https://www.youtube.com/watch?v=5dRGRueKU3M
 */

class FibDP {
    public static int[] saved;

    public static void main(String[] args) {
        if (args.length != 1) {
            error();
        }

        try {
            int input = Integer.parseInt(args[0]);
            saved = new int[input+1];
            int output = fib(input);
            System.out.println(output);
        } catch (NumberFormatException nfe) {
            error();
        }
    }

    public static int recursiveFib(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        return recursiveFib(x-1) + recursiveFib(x-2);
    }

    public static int fib(int x) {
        if (saved[x] == 0) {
            saved[x] = recursiveFib(x);
        }

        return saved[x];
    }

    public static void error() {
        System.out.println("Invalid input.");
        System.exit(0);
    }
}
