package Sort_Algorithm.Shell_Sort;

public class Shell_Practice_3 {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int gap = intArray.length/2; gap > 0; gap/=2){
            for(int i = gap; i < intArray.length; i++){
                int j = i;
                int new_element = intArray[i];
                while(j >= gap && intArray[j-gap] > new_element){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                intArray[j] = new_element;
            }
        }
        for(int count: intArray){
            System.out.print(count + " ");
        }
    }
}
