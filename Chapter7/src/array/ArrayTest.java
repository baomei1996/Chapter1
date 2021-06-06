package array;

public class ArrayTest {
    public static void main(String[] args) {
       // int[] numbers = new int[] {0, 1, 2};
        //int[] numbers = {0, 1, 2}

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(numbers.length);

        int[] studentIDs = new int[5];

        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println(studentIDs[i]);// 초기화를 안하면 값이 0으로 자동 셋팅됨
        }





    }
}
