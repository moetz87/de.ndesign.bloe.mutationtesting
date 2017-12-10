package de.ndesign.blog.mutationtesting;

public class Calculator {

    public int sum(int[] numbers, int fromIndex, int toIndex) {
        int MAX = 50;
        int result = 0;
        if (toIndex < fromIndex) {
            return -1;
        }
        for (int i = fromIndex; i <= toIndex && result < MAX; i++) {
            result = result + numbers[i];
        }
        return result;
    }

}
