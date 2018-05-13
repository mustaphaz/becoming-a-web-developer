package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplesOf3And5Test {

    private MultiplesOf3And5 subject = new MultiplesOf3And5();

    @Test
    public void givenNumbersBelow1_whenCalculateMultiplesOf3And5IsCalled_thenTheSumIs0() {
        assertThat(subject.calculateMultiplesOf3And5(1)).isEqualTo(0);
    }

    @Test
    public void givenNumbersBelow10_whenCalculateMultiplesOf3And5IsCalled_thenTheSumIs23() {
        assertThat(subject.calculateMultiplesOf3And5(10)).isEqualTo(23);
    }

      @Test
    public void givenNumbersBelow1000_whenCalculateMultiplesOf3And5IsCalled_thenTheSumIs233168() {
        assertThat(subject.calculateMultiplesOf3And5(1000)).isEqualTo(233168);
    }

}