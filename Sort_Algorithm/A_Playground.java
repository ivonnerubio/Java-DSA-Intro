package Sort_Algorithm;

public class A_Playground {

    /*
        this is a algorithm that looks for the largest value in an array
        it goes from left to right comparing neighboring values until the end
        it places the largest of the two first values into a new int
        if the new int is larger than the comparing value it saves that comparing value to the largest value
        once the first outer loop is completed the sorted partition of the array is 1 at the right of the array
        it continues each step comparing values until the outer loop has finished which now sorts the entire array


    */
    public static void main(String args[]){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 1; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, lastUnsortedIndex, largest);
            for(int i =0; i<intArray.length;i++){
                System.out.print(intArray[i] + " "); 
            }
            System.out.println(); 
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
