package Sort_Algorithm.Recursion;

public class Iterative {
    public static void main(String[] args){
        iterativeFactorial(3);

    }
    public static int iterativeFactorial(int num){
        if (num==0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i<= num; i++){
            factorial *=i;
        }
        System.out.println(factorial);
        return factorial;
    }
}
