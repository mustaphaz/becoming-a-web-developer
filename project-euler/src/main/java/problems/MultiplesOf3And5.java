package problems;

public class MultiplesOf3And5 {

    static int calculateMultiplesOf3And5(int end) {
        int sum = 0;
        for (int i = 0; i < end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateMultiplesOf3And5(1000000000));
    }

}
