package interfaceex;

public interface Calc {
    double PI = 3.14; // public static final
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }
    static int total (int[] arr) { // new 상관없이 인터페이스 이름만으로 정적 메서드를 호출
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
