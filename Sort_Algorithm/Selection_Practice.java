package Sort_Algorithm;

import java.util.Arrays;

public class Selection_Practice {
    public static void main(String[] args) {
        int[] intArray = {2,4,4,22,-45,-3400,131242};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 0; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, lastUnsortedIndex, largest);
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j) {
        if (array[i] == array[j]) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;


    }
}
