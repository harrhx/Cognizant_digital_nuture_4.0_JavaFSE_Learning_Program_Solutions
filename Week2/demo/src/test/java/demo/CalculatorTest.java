// src/test/java/demo/CalculatorTest.java
package demo;

// Import the JUnit 5 Test annotation
import org.junit.jupiter.api.Test;
// Import JUnit 5 assertions for testing expected outcomes
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for the Calculator class.
 * This class demonstrates basic JUnit 5 testing for arithmetic operations.
 */
public class CalculatorTest {

    // Create an instance of the Calculator class to test
    private Calculator calculator = new Calculator();

    /**
     * Test case for the add method with positive numbers.
     */
    @Test
    void testAddPositiveNumbers() {
        // Arrange (Given)
        int num1 = 5;
        int num2 = 3;
        int expectedSum = 8;

        // Act (When)
        int actualSum = calculator.add(num1, num2);

        // Assert (Then)
        assertEquals(expectedSum, actualSum, "The add method should correctly sum two positive numbers.");
    }

    /**
     * Test case for the add method with negative numbers.
     */
    @Test
    void testAddNegativeNumbers() {
        // Arrange
        int num1 = -5;
        int num2 = -3;
        int expectedSum = -8;

        // Act
        int actualSum = calculator.add(num1, num2);

        // Assert
        assertEquals(expectedSum, actualSum, "The add method should correctly sum two negative numbers.");
    }

    /**
     * Test case for the add method with mixed positive and negative numbers.
     */
    @Test
    void testAddMixedNumbers() {
        // Arrange
        int num1 = 10;
        int num2 = -7;
        int expectedSum = 3;

        // Act
        int actualSum = calculator.add(num1, num2);

        // Assert
        assertEquals(expectedSum, actualSum, "The add method should correctly sum mixed positive and negative numbers.");
    }

    /**
     * Test case for the subtract method with positive numbers.
     */
    @Test
    void testSubtractPositiveNumbers() {
        // Arrange
        int num1 = 10;
        int num2 = 4;
        int expectedResult = 6;

        // Act
        int actualResult = calculator.subtract(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult, "The subtract method should correctly subtract positive numbers.");
    }

    /**
     * Test case for the multiply method.
     */
    @Test
    void testMultiplyNumbers() {
        // Arrange
        int num1 = 5;
        int num2 = 4;
        int expectedProduct = 20;

        // Act
        int actualProduct = calculator.multiply(num1, num2);

        // Assert
        assertEquals(expectedProduct, actualProduct, "The multiply method should return the correct product.");
    }

    /**
     * Test case for the divide method with a valid division.
     */
    @Test
    void testDivideNumbers() {
        // Arrange
        int num1 = 10;
        int num2 = 2;
        double expectedQuotient = 5.0;

        // Act
        double actualQuotient = calculator.divide(num1, num2);

        // Assert
        assertEquals(expectedQuotient, actualQuotient, 0.001, "The divide method should return the correct quotient.");
    }

    /**
     * Test case for the divide method when division by zero occurs.
     * It asserts that an IllegalArgumentException is thrown.
     */
    @Test
    void testDivideByZero() {
        // Arrange
        int num1 = 10;
        int num2 = 0;

        // Assert that calling divide with 0 as divisor throws IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(num1, num2);
        }, "Dividing by zero should throw an IllegalArgumentException.");
    }
}
