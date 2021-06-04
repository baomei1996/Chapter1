package assignment;

public class OperationEx5 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        int result = num1 & num2;
        int result2 = num1 | num2;

        System.out.println(result); // 0
        System.out.println(result2); //15

        int num3 = 5; // 00000101;

        System.out.println(num3 << 1); //10
        System.out.println(num3); //5
        System.out.println(num3 << 2);//20
        System.out.println(num3 << 3); //40  * 2^n
        System.out.println(num3 >> 1); // 00000010 %2^n
    }
}
