package binaryCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HackerRank {

    // Given an integer, , print its first multiples. Each multiple (where ) should be printed
    // on a new line in the form: N x i = result

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number for buffer: ");
        String input = bufferedReader.readLine();
        if (!input.isEmpty()){
            int N = Integer.parseInt(input.trim());
            while (true) {
                if (N <= 2 || N >= 20){
                    System.out.println("Enter the number: ");
                    N = Integer.parseInt(bufferedReader.readLine().trim());
                }else {
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

    public static void printMultiples(int N){

        for (int i = 0; i <= 10; i++){
            System.out.println(N * i);
        }
    }

    /**
     * Return the sequence in the form (a + 2^0 + b), (a + 2^0 * b + 2^1 * b),...
     * ... (a + 2^0 * b + 2^1 * b + ... 2^n-1 *b)
     * constraints:
     *              0 <= q <= 500
     *              0 <= a,b <= 50
     *              1 <= n <= 15
     * @return space separated string of a, b values
     */
    public static void querySequence() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            // trims the string builder to append the last value of the sequence
            sb.setLength(0);

        }
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        while(true){
            if ((a < 0 || a > 50) || (b <= 0 || b > 50) || (n <= 0 || n > 15) ){
                a = in.nextInt();
                b = in.nextInt();
                n = in.nextInt();
            } else {
                for (int j = 0; j < n; j++) {
                    sb.append((int) (a + b * (Math.pow(2, j + 1) - 1))).append(" ");
                }
                System.out.println(sb.toString());
            }
        }
    }



}// end of class
