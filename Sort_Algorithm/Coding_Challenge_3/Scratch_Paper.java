package Sort_Algorithm.Coding_Challenge_3;

public class Scratch_Paper {
    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for (int j : radixArray) {
            System.out.println(j);
        }
    }

    //radix array, 10, 4
    public static void radixSort(int[] input, int radix, int width){
        for(int i =0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    // radix array, i (0-4), 10
    public static void radixSingleSort(int[] input, int position, int radix){
        // 6 items
        int numItems = input.length;
        // new array with the length of 10
        int[] countArray = new int[radix];

        // for each value in the radix array
        for(int value: input){
            // assign the count array a value, it increments each time
            // use the getDigit method, position = i (0-4), value =input.length , radix = 10
            countArray[getDigit(position, value, radix)]++;
        }

        // Adjust the count array
        for(int j=1; j<radix; j++){
            countArray[j] += countArray[j-1];


        }



    }
    // position = i (0-4), value = each value in input, radix = 10
    public static int getDigit(int position, int value, int radix){
        // each value in input / (int) (10 ^ i (0-4)) % 10
        // first iteration 4725 / 10^0 % 10 =
        return value/ (int) Math.pow(10, position) % radix;
    }

}
