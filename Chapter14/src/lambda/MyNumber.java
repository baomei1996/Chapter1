package lambda;

@FunctionalInterface // 사용하므로써 하나 이상의 메서드를 만들지 못하도록 함
public interface MyNumber {
    int getMaxNumber(int num1, int num2);

}
