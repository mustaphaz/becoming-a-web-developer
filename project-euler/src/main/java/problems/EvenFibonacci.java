package problems;

public class EvenFibonacci {

    static int sumEvenFibonacciNumbers(int end) {
        int sum = 0;
        int preLastTerm;
        int lastTerm = 1;
        int value = 1;

        while (value <= end) {
            preLastTerm = lastTerm;
            lastTerm = value;
            value = lastTerm + preLastTerm;
            System.out.println(preLastTerm + "," + lastTerm + "," +  value);
            if(value % 2 == 0) {
                System.out.printf("value %d is even%n", value);
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenFibonacciNumbers(4000000));
    }
}
