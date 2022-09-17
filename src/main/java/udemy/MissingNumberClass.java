package udemy;

import java.util.Arrays;

public class MissingNumberClass {

    public static void main(String [] args){
        int[] input = {1,2,3,4,5,6,8,9,10};
        System.out.println(missingNumber(input));
    }

    public static int missingNumber(int[] input){
        int size = input.length;
        int expectedSum = (size+1)*(size+2)/2;
        int actualSum = Arrays.stream(input).reduce(0, Integer::sum);
        return expectedSum-actualSum;
    }
}
