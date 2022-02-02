package Sort_Algorithm.Coding_Challenge_3;

public class Coding_Challenge_3 {
    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringsArray, 10, 4);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width){
        for (int i =0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix){

    }
}
