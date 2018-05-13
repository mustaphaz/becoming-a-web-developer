package problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvenFibonacciTest {

    @Test
    void givenTheLimitOf10_whensumEvenFibonacciNumbersIsCalled_thenTheSumIs10() {
        assertThat(EvenFibonacci.sumEvenFibonacciNumbers(10)).isEqualTo(10);
    }

    @Test
    void givenTheLimitOf4000000_whensumEvenFibonacciNumbersIsCalled_thenTheSumIs4613732() {
        assertThat(EvenFibonacci.sumEvenFibonacciNumbers(4000000)).isEqualTo(4613732);
    }

}