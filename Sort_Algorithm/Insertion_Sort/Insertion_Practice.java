package Sort_Algorithm.Insertion_Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Practice {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedPartition = 1; firstUnsortedPartition < intArray.length; firstUnsortedPartition++){

            int new_element = intArray[firstUnsortedPartition];
            int i;
            for(i = firstUnsortedPartition; i > 0 && intArray[i-1] > new_element; i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = new_element;
        }
        for (int j : intArray) {
            System.out.println(j);
        }
    }

}
