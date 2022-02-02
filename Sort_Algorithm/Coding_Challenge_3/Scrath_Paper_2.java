package Sort_Algorithm.Coding_Challenge_3;

public class Scrath_Paper_2 {
    public static void main(String[] args) {
        int value = 4725;
        int position = 3;
        int radix = 10;
        System.out.println(value/ (int) Math.pow(10, position) % radix);

    }
}
