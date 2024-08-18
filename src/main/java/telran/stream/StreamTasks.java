package telran.stream;

import java.util.Random;

public class StreamTasks {
    public static int[] shuffle(int[] arr) {
        int[] res = {};
        if (arr.length > 0) {
            res = new Random().ints(0, arr.length).distinct().limit(arr.length).map(n -> arr[n]).toArray();
        }
        return res;
    }
}