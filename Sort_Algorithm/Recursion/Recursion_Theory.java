package Sort_Algorithm.Recursion;

public class Recursion_Theory {

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1! = 2
    // 3! = 3 * 2! = 6

    public static void main(String[] args){
        recursiveFactorial(3);

    }
    public static int recursiveFactorial(int num){
        if (num==0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
}
