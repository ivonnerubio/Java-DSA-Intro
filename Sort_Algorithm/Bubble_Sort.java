package Sort_Algorithm;
    /*
        this is the implementation of the bubble sort algorithm. it works in the followin steps
            - outer loop that sets the array into two different sections sorted;unstorted
                it starts from the end where once the largest element is found it is sorted
            - inner loop that compares the two neighoring elements
                if the element of i is greater than the i+1 value then it swaps it
                - it continues to do this until the greatest number is found and placed at the end of the array
                - once all array values are done it goes back into the outer loop changing the unsorted partition and the process
                repeats
            - swap method
    */
public class Bubble_Sort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int i =0; i<intArray.length;i++){
            System.out.println(intArray[i]);    
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
