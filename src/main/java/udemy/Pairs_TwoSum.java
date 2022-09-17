package udemy;

public class Pairs_TwoSum {

    public static void main(String args[]){
        int[] input = {1,2,3,4,5,6,7,8,9};
        getPairs(12, input);
    }

    public static int[] getPairs( int value, int[] input){
        int current;
        for (int i = 0 ; i < input.length; i++){
            for (int j = i+1; j < input.length; j++){
                if (input[i] + input[j] == value)
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
