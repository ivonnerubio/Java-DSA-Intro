package SeachAlgorithm.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println(recursiveBinarySearch(intArray,7));
    }

    public static int iterativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while(start < end){
            int midPoint = (start + end) / 2;
            if(input[midPoint] == value){
                return midPoint;
            }
            else if(input[midPoint] < value){
                start = midPoint+1;

            }
            else{
                end = midPoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value){
        return recursiveBinarySearch(input, 0, input.length, value);

    }
    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if(start >= end){
            return -1;
        }
        int mid = (start+end) /2;
        System.out.println("midPoint " +input[mid]);
        if(input[mid] == value){
            return mid;
        }
        else if(input[mid] < value){
            return recursiveBinarySearch(input, mid+1, input.length, value);
        }
        else{
            return recursiveBinarySearch(input, start, mid, value);
        }




    }
}
