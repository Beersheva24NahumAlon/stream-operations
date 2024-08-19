package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StreamTaskTest {
    @Test
    void shuffleTest() {
        int[] arr1 = { 2, 8, -7, 12, 0, 99 };
        assertGivenAndShuffle(arr1);
        int[] arr2 = { 2 };
        assertGivenAndShuffle(arr2);
        int[] arr3 = {};
        assertGivenAndShuffle(arr3);
        int[] arr4 = { 1, 2, 3, 4, 5, 6 };
        assertGivenAndShuffle(arr4);
    }

    void assertGivenAndShuffle(int[] arrayGiven) {
        int[] arrayShuffled = new int[arrayGiven.length];
        arrayShuffled = StreamTasks.shuffle(arrayGiven);
        //some additional check, may be doesn't need
        assertTrue(isAllElemetsMatch(arrayGiven, arrayShuffled));
        assertFalse(arrayGiven.equals(arrayShuffled));
        java.util.Arrays.sort(arrayGiven);
        java.util.Arrays.sort(arrayShuffled);
        assertArrayEquals(arrayGiven, arrayShuffled);
    }

    boolean isAllElemetsMatch(int[] arrayGiven, int[] arrayShuffled) {
        int i = 0;
        while (i < arrayShuffled.length && telran.util.Arrays.search(arrayGiven, arrayShuffled[i]) != -1) {
            i++;
        }
        return i == arrayShuffled.length && arrayShuffled.length == arrayGiven.length;
    }
}