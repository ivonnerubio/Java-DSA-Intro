package Sort_Algorithm.Coding_Challenge_2;

public class Coding_Challenge_2 {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        insertion(intArray, 1, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void insertion(int[] input, int firstUnsortedIndex, int arrayLength){
        if(firstUnsortedIndex >= arrayLength){
            return;
        }

        int new_element = input[firstUnsortedIndex];
        int i;

        for (i = firstUnsortedIndex; i > 0 && input[i - 1] > new_element; i--) {
            input[i] = input[i - 1];
        }
        input[i] = new_element;

        firstUnsortedIndex++;

        insertion(input, firstUnsortedIndex, arrayLength);
    }

}
