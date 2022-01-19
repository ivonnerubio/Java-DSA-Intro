package Sort_Algorithm;

import java.util.Arrays;

public class Selection_Practice {
    public static void main(String[] args) {
        int[] intArray = {2,4,4,22,-45,-3400,131242};

        for(int firstUnsortedIndex =1; firstUnsortedIndex < intArray.length-1; firstUnsortedIndex++){
            int newElement =0;
            for(int lastSortedIndex=0; lastSortedIndex < intArray.length; lastSortedIndex++){
                if(firstUnsortedIndex <= lastSortedIndex){
                    newElement = firstUnsortedIndex;
                    swap(intArray, firstUnsortedIndex, newElement);
                }
            }
        }
        for(int i =0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }


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
