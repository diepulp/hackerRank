package binarycount;

import java.io.IOException;
import java.util.*;


public class Test {
    public static void main(String[] args) throws IOException {

        //reverse an array
    //     int[] arr = {1,2,3,4,5};
    //     Queue<Integer> q = new ArrayDeque<>();
    //     Stack<Integer> stack = new Stack<>();

    //     for (int i: arr){
    //         stack.push(i);
    //     }
    //     System.out.println("Queue after the array added " + stack);

    //   while (!stack.isEmpty()){
    //         q.add(stack.pop());
    //   }
    //     System.out.println();
    //     System.out.println("From the stack " + stack);

    //     System.out.println("From the queue " + q);

    //     for (int i = 0; i < (arr.length -1) / 2; i++){
    //         int firstIndex = arr[i];
    //         int lastIndex = arr[(arr.length - 1) - i];
    //         int tempIndex = 0;
    //         tempIndex = firstIndex;
    //         arr[i] = lastIndex;
    //         arr[(arr.length - 1) - i ] = tempIndex;
    //     }
    //     System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double d = sc.nextDouble();
//        sc.nextLine();
        String s = sc.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Integer: " + num);
    }

    
}

