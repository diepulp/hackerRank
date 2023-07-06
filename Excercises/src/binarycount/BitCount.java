package binarycount;

public class BitCount {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    /**
     * the method returns the number of ones in a binary string
     * @param num int
     * @return the amount of ones in a given binary number
     */
    public static int countBits(int num){
        String binNum = Integer.toBinaryString(num);
        char[] chars = binNum.toCharArray();
        int acc = 0;
        for(char c : chars){
            if(c == '1'){
                acc++;
            }
        }
        return acc;
    }
}
