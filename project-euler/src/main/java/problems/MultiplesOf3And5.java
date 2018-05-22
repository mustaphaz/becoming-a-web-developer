package problems;

import java.util.stream.IntStream;

public class MultiplesOf3And5 {

    // the old way:
    int calculateMultiplesOf3And5(int end) {
        int sum = 0;
        for (int i = 0; i < end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // the new way:
    private int calculateMultiplesOf3And5Stream(int end) {
        return IntStream.range(1, end)
                .filter(this::isDivisibleBy3Or5)
                .sum();
    }

    private boolean isDivisibleBy3Or5(int number){
        return number % 3 == 0 || number % 5 == 0;
    }

    public static void main(String[] args) {
        System.out.println(new MultiplesOf3And5().calculateMultiplesOf3And5(1000000000));
        System.out.println(new MultiplesOf3And5().calculateMultiplesOf3And5Stream(1000000000));
    }

}
