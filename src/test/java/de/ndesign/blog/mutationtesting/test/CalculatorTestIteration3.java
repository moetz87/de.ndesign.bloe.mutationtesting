package de.ndesign.blog.mutationtesting.test;

import org.junit.Assert;
import org.junit.Test;

import de.ndesign.blog.mutationtesting.Calculator;

public class CalculatorTestIteration3 {

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
    public void testSumFromIndexEqualsToIndex() {
        // Prepare
        int[] numbers = { 1, 1, 1, 2, 2, 2, 1, 1, 1 };
        int fromIndex = 3;
        int toIndex = 3;
        int expectedResult = 2;
        Calculator sut = new Calculator();
        // Act
        int result = sut.sum(numbers, fromIndex, toIndex);
        // Verify
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSumWithMaximumEquallyReached() {
        // Prepare
        int[] numbers = { 1, 1, 1, 40, 10, 2, 1, 1, 1 };
        int fromIndex = 3;
        int toIndex = 6;
        int expectedResult = 50;
        Calculator sut = new Calculator();
        // Act
        int result = sut.sum(numbers, fromIndex, toIndex);
        // Verify
        Assert.assertEquals(expectedResult, result);
    }

}
