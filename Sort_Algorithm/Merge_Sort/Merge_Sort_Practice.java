package Sort_Algorithm.Merge_Sort;

public class Merge_Sort_Practice {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // Calls the merge method with the following parameters: input array, start #, end #
        mergeSort(intArray,0,7);

        // For loop to print the sorted values
        for (int i =0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end){
        // If the array has less than 2 of length return the array since it has been completely broken down
        // {20,35, -15}  start = 0, end = 2, 2-0=2 < 2, false
        // {20, 35} start = 0, end = 1, 1-0-1 < 2, true and return
        // {20} start = 0, end =0, 0-0 = 0 , 2, true and return
        if(end-start < 2){
            return;
        }

        // Creates a variable called mid, this only runs if a array is greater than 2 of length,
        // {20,35, -15} start = 0, end = 2, mid = 2+0=2/2 = 1
        int mid = (start+end) / 2;

        // 1st recursion method
        // this calls the merge sort method
        // for example it will continue to break down the array until the length is less than 2
        // {20, 35, -15, 7} => {20,35}
        mergeSort(input, start, mid);
        // 2nd recursion method that breaks down the left half of the array
        // {55, 1, -22}
        mergeSort(input, mid, end);

        // This is another recursion method that merges all the single arrays
        // {20, 35, -15}
        merge(input, start, mid ,end);
    }


    public static void merge(int[] input, int start, int mid, int end){

        // return the array if the array is already sorted by the mid variable
        // {20,35,-15}, mid -1 = 20, mid = 35, 20 <=35, return array
        // -
        if(input[mid-1] <= input[mid]){
            return;
        }

        // Create variables to store the numbers passed when the method was called
        int i = start;
        int j = mid;
        int tempIndex = 0;

        // create a temporary array with the same size as the input array
        int[] temp = new int[end-start];

        // {20,35,-15}
        // 0 < 1 && 1 < 2 => true, temp[0+1=1] = 20 < = 35 ? input[1] : input[2] => temp[2] = 35
        // j = 1+1 = 2
        // 0 < 1 && 2 < 2 => false end while loop

        while(i<mid && j <end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }


}
