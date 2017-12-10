package de.ndesign.blog.mutationtesting.test;

import org.junit.Assert;
import org.junit.Test;

import de.ndesign.blog.mutationtesting.Calculator;

public class CalculatorTestIteration1 {

    @Test
    public void testSum() {
        // Prepare
        int[] numbers = { 1, 1, 1, 2, 2, 2, 1, 1, 1 };
        int fromIndex = 3;
        int toIndex = 6;
        int expectedResult = 7;
        Calculator sut = new Calculator();
        // Act
        int result = sut.sum(numbers, fromIndex, toIndex);
        // Verify
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSumWithToIndexBiggerThanFromIndex() {
        // Prepare
        int[] numbers = { 1, 1, 1, 2, 2, 2, 1, 1, 1 };
        int fromIndex = 6;
        int toIndex = 3;
        int expectedResult = -1;
        Calculator sut = new Calculator();
        // Act
        int result = sut.sum(numbers, fromIndex, toIndex);
        // Verify
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSumWithMaximumReached() {
        // Prepare
        int[] numbers = { 1, 1, 1, 40, 20, 2, 1, 1, 1 };
        int fromIndex = 3;
        int toIndex = 6;
        int expectedResult = 60;
        Calculator sut = new Calculator();
        // Act
        int result = sut.sum(numbers, fromIndex, toIndex);
        // Verify
        Assert.assertEquals(expectedResult, result);
    }

}
