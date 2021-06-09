package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
       /* Customer customerLee = new Customer(100010, "Lee");
        int price = customerLee.calcPrice(10000);
        customerLee.calcPrice(10000);
        System.out.println("상품의 가격은 "+price +" 이고, "+ customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
        price = customerKim.calcPrice(10000);
        customerKim.calcPrice(10000);
        System.out.println("상품의 가격은 "+price +" 이고, "+ customerKim.showCustomerInfo());
        */

        Customer customerWho = new VIPCustomer(100010, "Who", 100);
        int price =  customerWho.calcPrice(10000);
        System.out.println("지불 금액은 " + price + " 이고, " + customerWho.showCustomerInfo());

        // 묵시적 형 변환과 재정의 된 메소드 호출
        // 가상 메서드
        // 프로그램에서 어떤 객체의 변수나 메서드의 참조는 그 타입에 따라 이루어짐. 가상 메서드의 경우
        // 타입과 상관없이 실제 생성된 인스턴스의 메서드가 호출되는 원리
        // 타입은 Customer 이지만, 실제 생성된 인스턴스인 VIPCustomer 클래스의 메서드가 호출됨

        // 다형성
        // : 하나의 코드가 여러가지 자료형으로 구현되어 실행되는 것
        //   정보은닉, 상속과 더불어 객체지향 프로그래밍에 가장 큰 특징 하나
        //   객체지향 프로그래밍의 유연성, 재활용성, 유지보수성에 기본이 되는 특징임

    }
}
