package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class StreamTaskTest {
    @Test
    void suffleTest() {
       int[] arrayGiven = { 2, 8, -7, 12, 0, 99 };
       int[] arraySuffled = new int[arrayGiven.length];
       arraySuffled = StreamTasks.suffle(arrayGiven);
       java.util.Arrays.sort(arrayGiven);
       java.util.Arrays.sort(arraySuffled);
       assertArrayEquals(arrayGiven, arraySuffled);
    }
}
