package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        /* int num1 = 10;
        int num2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));

        CompleteCalc calc1 = new CompleteCalc();

        calc1.showInfo();

        calc.description();//인터페이스 내에서도 default 를 통해 구현가능 재정의도 가능
        calc1.description();

         */

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);  // new 상관없이 인터페이스 이름만으로 정적 메서드를 호출
        System.out.println(sum);

        // 될 수 없는 것 Calc calc = new Calc(); / Calc calc = new Calculator();
        // 인터페이스 추상 클래스는 new 될 수 없음
        // 구현 코드가 없는 인터페이스는 타입만 상속 받기 때문에 여러개의 인터페이스를 상속받을 수 잇다.

        // 인터페이스는 "Client Code"아 서비스를 제공하는 "객체" 사이의 약속이다.
        // 어떤 객체가 어떤 interface 타입이라 함은 그 interface 가 제공하는 메서드를 구현했다는 의미임
        // Client 는 어떻게 구현 되었는지 상관없이 interface 의 정의만을 보고 사용할 수 있음 (ex) JDBC)
        // 다양한 구현이 필요한 인터페이스를 설계하는 일은 매우 중요한 일임
    }
}
