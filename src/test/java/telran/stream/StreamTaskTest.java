package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        assertGivenAndShuffle(arr4);
    }

    void assertGivenAndShuffle(int[] arrayGiven) {
        int[] arraySuffled = new int[arrayGiven.length];
        arraySuffled = StreamTasks.shuffle(arrayGiven);
        java.util.Arrays.sort(arrayGiven);
        java.util.Arrays.sort(arraySuffled);
        assertArrayEquals(arrayGiven, arraySuffled);
    }
}
