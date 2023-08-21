package src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] myarray = {2,7,9,11};
        System.out.println(Arrays.toString(twoSum1(myarray,9)));

    }
    public static int[] twoSum1(int[] array, int target){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1; j<array.length;j++)
                if((array[i]+array[j])==target) return new int[]{i,j};
        }
        return new int[]{};

    }
}
