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
            while (!in.hasNextInt()){
                System.out.println("An integer is required:");
                in.nextLine();
            }
            q = in.nextInt();

        }while(q <= 0 || q > 500);

        System.out.println("The number of iterations: " + q);
    }

}// end of class
