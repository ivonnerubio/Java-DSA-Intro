package Sort_Algorithm;

import java.util.Arrays;

/* The bubble sort works in the following manner:
    1. compare two first values
    2. if the first value is greater than the second value, they trade places
    3. the second and third value are compared and if larger trade places
    4. the cycle continues until the largest value is found and is in the location if length - 1
    5. this completes the first cycle
    6. the cycle continues but the sorted partition is grown by one
    7. cycle repeats
    O(n^2)
 */
public class Bubble_Practice {

    public static void main(String[] args) {
        int[] array = {265,-4,52,66,-445,53,10845};

        for(int lastSortedPartition=array.length-1; lastSortedPartition > 0; lastSortedPartition--){
            for(int j =0; j < lastSortedPartition; j++){
                if( array[j] > array[j+1]){
                    swap(array, j,j+1);
                }
            }
        }

        System.out.println(Arrays.toString(array));
     }

    public static void swap(int[] array, int i, int j){
        if(array[i]==array[j]){
            return;
        }
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;


    }
}
