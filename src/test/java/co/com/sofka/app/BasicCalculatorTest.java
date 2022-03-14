package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        //assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
       Assertions.assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing rest: 2-1=1")
    public void rest() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.rest(number1, number2);

        //assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several rests")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "2,    1,   1",
            "5,    2,   3",
            "61,  51, 10",
            "100,  20, 80"
    })
    public void severalRests(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.rest(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiplication: 2*3=6")
    public void multiplication() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 3L;
        Long expectedValue = 6L;

        // Act
        Long result = basicCalculator.multiplication(number1, number2);

        //assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2,    1,   2",
            "5,    2,   10",
            "6,    5,   30",
            "10,   2,   20"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.multiplication(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing division: 6/2=3")
    public void division() {
        // Arrange
        Long number1 = 6L;
        Long number2 = 2L;
        Long expectedValue = 3L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        //assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "2,     1,   2",
            "10,    2,   5",
            "6,     2,   3",
            "100,   25,  4"
    })
    public void severalDivisions(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

}
