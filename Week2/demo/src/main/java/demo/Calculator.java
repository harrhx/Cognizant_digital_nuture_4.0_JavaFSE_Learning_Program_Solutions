// src/main/java/demo/Calculator.java
package demo;

/**
 * A simple utility class to perform basic arithmetic operations.
 * This class will be tested using JUnit.
 */
public class Calculator {

    /**
     * Adds two integers and returns the sum.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     * @param a The first integer (minuend).
     * @param b The second integer (subtrahend).
     * @return The result of a - b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the product.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * Throws IllegalArgumentException if the divisor is zero.
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of a / b.
     * @throws IllegalArgumentException if b is 0.
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return (double) a / b;
    }
}
