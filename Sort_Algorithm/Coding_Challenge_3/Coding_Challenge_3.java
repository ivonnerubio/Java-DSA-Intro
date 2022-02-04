package Sort_Algorithm.Coding_Challenge_3;

public class Coding_Challenge_3 {
    public static void main(String[] args) {
        String[] radixArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(radixArray, 26, 5);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width-1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }
        public static void radixSingleSort(String[] input, int position, int radix){
            // 6 items
            int numItems = input.length;
            // new array with the length of 10
            int[] countArray = new int[radix];

            // for each value in the radix array
            for(String value: input){
                // assign the count array a value, it increments each time
                // use the getDigit method, position = i (0-4), value =input.length , radix = 10
                countArray[getIndex(position, value)]++;
            }

            // Adjust the count array
            for(int j=1; j<radix; j++){
                countArray[j] += countArray[j-1];
            }

            String[] temp = new String[numItems];

            // temp[--countArray[getDigit(position,input[]
            for(int tempIndex=numItems-1; tempIndex >=0; tempIndex--){
                temp[--countArray[getIndex(position,input[tempIndex] )]] = input[tempIndex];
            }

            for(int tempIndex=0;tempIndex < numItems; tempIndex++){
                input[tempIndex] = temp[tempIndex];
            }


        }

        public static int getIndex(int position, String value){
            return value.charAt(position) - 'a';
        }
}
