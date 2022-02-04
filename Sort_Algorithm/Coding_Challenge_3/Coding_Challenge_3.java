package Sort_Algorithm.Coding_Challenge_3;

public class Coding_Challenge_3 {
    public static void main(String[] args) {
        String[] radixArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(radixArray, 10, 5);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width){
        for (int i =0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix){
        int numItems = input.length;

        int[] countArray = new int[radix];
    }
}
