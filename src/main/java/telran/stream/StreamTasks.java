package telran.stream;

import java.util.Arrays;
import java.util.Random;

public class StreamTasks {
    public static int[] shuffle(int[] arr) {
        return Arrays.stream(arr).boxed().sorted((a, b) -> new Random().nextInt(2) - 1).mapToInt(n -> n).toArray();
    }
}
