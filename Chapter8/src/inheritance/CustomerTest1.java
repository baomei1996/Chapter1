package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
/*
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("Lee");
 */

        VIPCustomer customerKim = new VIPCustomer(10112, "Kim", 10100 );
        customerKim.setCustomerID(10101);
        customerKim.setCustomerName("Kim");
        customerKim.bonusPoint = 1000;
        // Customer 로 형변환을 할 경우 VIPCustomer 의 agentID 나 saleRatio 는 가져올 수 없음

        //System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

        Customer customerGold = new GoldCustomer(10002, "Jin");
        customerGold.calcPrice(2000);
        System.out.println(customerGold.showCustomerInfo());
    }
}

// 메서드 오버라이딩
// 상위 클래스에 정의 된 메서드 중 하위 클래스와 기능이 맞지 않거나 추가 기능이 필요한 경우
// 같은 이름과 매개변수로 하위 클래스에서 재정의 함


// 상위 클래스로의 묵시적 형 변환 (업캐스팅)
// 상위 클래스 형으로 변수를 선언하고 하위 클래스 인스턴스를 생성할 수 있음
// 하위 클래스는 상위 클래스 타입을 내포하고 있으므로 상위 클래스로 묵시적 형변환이 가능함

// ex) Customer vc = new VIPCustomer();

// 형변환에서의 메모리
// VIPCustomer() 생성자의 호출로 인스턴스는 모두 생성 되었지만
// 타입이 Customer 이므로 접근 할 수 있는 변수나 메서드는 Customer 의 변수와 메서드임