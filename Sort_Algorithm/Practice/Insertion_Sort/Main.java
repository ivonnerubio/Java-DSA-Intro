package Sort_Algorithm.Practice.Insertion_Sort;

import Sort_Algorithm.Insertion_Sort.Insertion_Sort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        for(int unsorted=1; unsorted<arr.length; unsorted++){
            int new_element = arr[unsorted];
            int i =0;

            for(i =0; i > 0 && arr[i-1] > new_element; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = new_element;


        }

        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
