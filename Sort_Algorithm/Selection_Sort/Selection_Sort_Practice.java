package Sort_Algorithm.Selection_Sort;

public class Selection_Sort_Practice {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;

            for(int i = 0 ; i < lastUnsortedIndex; i++){
                if(intArray[i] > largest){
                    swap(intArray, i, lastUnsortedIndex);
                    largest = intArray[i];
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
