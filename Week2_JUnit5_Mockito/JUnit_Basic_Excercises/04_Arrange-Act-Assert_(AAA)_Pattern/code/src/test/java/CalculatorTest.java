// File: CalculatorTest.java

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import org.example.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // This runs BEFORE each test
        calculator = new Calculator();
        System.out.println("Setup: New Calculator created");
    }

    @AfterEach
    void tearDown() {
        // This runs AFTER each test
        calculator = null;
        System.out.println("Teardown: Calculator set to null");
    }

    @Test
    void testAddition_AAA() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result, "5 + 3 should be 8");
    }

    @Test
    void testSubtraction_AAA() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result, "10 - 4 should be 6");
    }
}
