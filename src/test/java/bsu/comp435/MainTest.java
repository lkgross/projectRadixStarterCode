package bsu.comp435;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


class MainTest {

    @Test
    void oneDigitNumbers() {
        int[] input = {9, 3, 6, 9, 4, 3, 7, 1, 8, 1};
        int[] sorted = {1, 1, 3, 3, 4, 6, 7, 8, 9, 9};
        Main.radixSort(input);
        assert (Arrays.equals(input, sorted));
    }

    @Test
    void empty() {
        int[] input = {};
        int[] sorted = {};
        Main.radixSort(input);
        assert (Arrays.equals(input, sorted));
    }

    @Test
    void oneDigitNumbersIncludingZero() {
        int[] input = {9, 3, 6, 9, 4, 3, 7, 0, 8, 1};
        int[] sorted = {0, 1, 3, 3, 4, 6, 7, 8, 9, 9};
        Main.radixSort(input);
        assert (Arrays.equals(input, sorted));
    }

    @Test
    void twoDigitNumbers() {
        int[] input = {74, 16, 17, 32, 81, 54, 64, 60, 84, 24};
        int[] sorted = {16, 17, 24, 32, 54, 60, 64, 74, 81, 84};
        Main.radixSort(input);
        assert (Arrays.equals(input, sorted));
    }

    @Test
    void threeDigitNumbers() {
        int[] input = {476, 215, 276, 598, 194, 375, 247, 766, 784, 200};
        int[] sorted = {194, 200, 215, 247, 276, 375, 476, 598, 766, 784};
        Main.radixSort(input);
        assert (Arrays.equals(input, sorted));
    }

    @Test
    void fourDigitNumbers() {
        int[] input = {1726, 8065, 4380, 6786, 7440, 7010, 2148, 7261, 3383, 6745};
        int[] sorted = {1726, 2148, 3383, 4380, 6745, 6786, 7010, 7261, 7440, 8065};
        Main.radixSort(input);
        assert (Arrays.equals(input, sorted));
    }

    @Test
    void mixedDigitNumbers() {
        int[] input = {602, 4804, 8180, 2, 9297, 4708, 8758, 4153, 2397, 777, 2569, 2621, 67, 2335};
        int[] sorted = {2, 67, 602, 777, 2335, 2397, 2569, 2621, 4153, 4708, 4804, 8180, 8758, 9297};
        Main.radixSort(input);
        assert (Arrays.equals(input, sorted));
    }
}
