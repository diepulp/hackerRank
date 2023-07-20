package binarycount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HackerRank {

    // Given an integer, , print its first multiples. Each multiple (where ) should be printed
    // on a new line in the form: N x i = result

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number for buffer: ");
        String input = bufferedReader.readLine();
        if (!input.isEmpty()) {
            int N = Integer.parseInt(input.trim());
            while (true) {
                if (N <= 2 || N >= 20) {
                    System.out.println("Enter the number: ");
                    N = Integer.parseInt(bufferedReader.readLine().trim());
                } else {
                    HackerRank.printMultiples(N);
                    break;
                }
            }
        } else {
            System.out.println("Provide Input ");
        }
//        bufferedReader.close();
        querySequence();
    }

    public static void printMultiples(int N) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(N * i);
        }
    }

    /**
     * Return the sequence in the form (a + 2^0 + b), (a + 2^0 * b + 2^1 * b),...
     * ... (a + 2^0 * b + 2^1 * b + ... 2^n-1 *b)
     * constraints:
     * 0 < t <= 500
     * 0 <= a,b <= 50
     * 1 <= n <= 15
     *
     * @return space separated string of a, b values
     */
    public static void querySequence() {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int q;
        do {
            System.out.println("Enter the number of iterations: ");
            while (!in.hasNextInt()) {
                System.out.println("An integer is required:");
                in.nextLine();
            }
            q = in.nextInt();

        } while (q <= 0 || q > 500);

        for (int i = 1; i <= q; i++) {
            int a = getValidatedInt("Enter a", 0, 50, in);
            int b = getValidatedInt("Enter b: ", 0, 50, in);
            int n = getValidatedInt("Enter n: ", 1, 15, in);
            sb.setLength(0);
            for (int j = 0; j < n; ++j) {
                sb.append((int) (a + b * (Math.pow(2, j + 1) - 1)))
                        .append(" ");
            }
            System.out.println(sb);
        }
    }

    public static int getValidatedInt(String prompt, int min, int max, Scanner in) {
        int num;
        do {
            System.out.println(prompt);
            while (!in.hasNextInt()) {
                System.out.println("An integer is required");
                in.next(); // Consume the invalid input to avoid an infinite loop
            }
            num = Integer.parseInt(in.next()); // next returns a string, parse int is necessary
            in.nextLine();
        } while (num < min && num >= max);

        return num;
    }

    public static void primitives() {
        Scanner in = new Scanner(System.in);
        int numOfInputs = in.nextInt();
        String input = "";
        for (int i = 1; i <= numOfInputs; i++) {

            input = in.next();
            if (input.length() > 19) {
                System.out.println(input + " can't be fitted in any number");
            } else {
                boolean fitsIntoAnyDataType = false;
                long number = Long.parseLong(input);
                System.out.println("n can be fitted in: ");
                if (fitsIntoByte(number)) {
                    fitsIntoAnyDataType = true;
                    System.out.println("* byte");
                }
                if (fitsIntoShort(number)) {
                    System.out.println("* short");
                    fitsIntoAnyDataType = true;

                }
                if (fitsIntoInt(number)) {
                    System.out.println("* int");
                    fitsIntoAnyDataType = true;
                }
                if (fitsIntoLong(number)) {
                    System.out.println("* short");
                    fitsIntoAnyDataType = true;
                }
            }
        }
    }

    public static boolean fitsIntoDouble(long number) {
        return fitsIntoDouble((double) number);
    }

    protected static boolean fitsIntoDouble(double number) {
        return true;
    }

    public static boolean fitsIntoByte(long number) {
        return number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE;
    }

    public static boolean fitsIntoShort(long number) {
        return number >= Short.MIN_VALUE && number <= Short.MAX_VALUE;
    }

    public static boolean fitsIntoInt(long number) {
        return number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE;
    }

    public static boolean fitsIntoLong(long number) {
        return true;
    }


}// end of class
