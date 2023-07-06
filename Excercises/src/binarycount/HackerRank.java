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

        // collect the input from the user for the t iterations
        System.out.println("Enter t: ");
        int t;

        // check if the input exists
        while (in.hasNext()){
            // validate t for an integer
            try {
                if (in.hasNextInt()){
                    do {
                        System.out.println("Enter the integer value for t: ");
                        t = in.nextInt();
                    } while (t > 0 && t <= 500);
                } else {
                    System.out.println("Invalid input, try again");
                }
            } catch (InputMismatchException ie){
                System.out.println("The t must be an integer");
                in.nextLine();
            }
            //check for constraints at least once

        }


    }

}// end of class


/**
 while (true){
 if (t <= 0 || t >= 500){
 System.out.println("Number of iterations? : ");
 t = in.nextInt();
 } else {
 StringBuilder sb = new StringBuilder();

 for (int i = 0; i < t; i++) {
 // trims the string builder to append the last value of the sequence
 sb.setLength(0);
 System.out.println("Enter the a value:");
 int a = in.nextInt();
 System.out.println("Enter the b value:");
 int b = in.nextInt();
 System.out.println("Enter the n value:");
 int n = in.nextInt();
 // (a < 0 || a > 50) || (b <= 0 || b > 50) || (n <= 0 || n > 15)
 while (true) {
 if (a <= 0 || a > 50){
 System.out.println("Enter the a value:");
 a = in.nextInt();
 } else if (b <= 0 || b > 50 ){
 System.out.println("Enter the b value:");
 b = in.nextInt();
 } else if (n <= 0 || n > 10){
 System.out.println("Enter the n value:");
 n = in.nextInt();
 } else {
 for (int j = 0; j < n; j++) {
 sb.append((int) (a + b * (Math.pow(2, j + 1) - 1))).append(" ");
 }
 System.out.println(sb);
 break;
 }
 }
 }
 }
 }
 */