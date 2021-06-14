package lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber maxNum = (x, y) -> (x >= y)? x : y;
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);

        // 인터페이스 안에 여러 메서드가 있다면 이 식이 어떤 메서드를 가르키는지 모호해지기 때문에 하나의 메서드에 대한 식만 만들 수 있음
    }
}
