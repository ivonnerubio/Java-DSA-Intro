package Sort_Algorithm;

import com.sun.source.tree.LabeledStatementTree;

public class Selection_Theory {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            int new_element = intArray[firstUnsortedIndex];
            int i;

            for(i =firstUnsortedIndex; i > 0 && intArray[i-1] > new_element; i--){
                intArray[i] = intArray[i-1];

            }
            intArray[i] = new_element;
        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }

}
