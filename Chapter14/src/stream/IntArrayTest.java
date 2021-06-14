package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        IntStream stream = Arrays.stream(arr);
        int sum = stream.sum();
        System.out.println(sum);

        int count = (int) Arrays.stream(arr).count(); // 선언해놓은 stream 은 이미 소모됐기 때문에 사용 할 수 없고 새로 선언해야 함
        System.out.println(count);
    }

}
