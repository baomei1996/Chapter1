package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        GoldCustomer customerShin = new GoldCustomer(10011, "신사임당");
        GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
        VIPCustomer customerKim = new VIPCustomer(10013, "김유신", 67);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        //customerList.add(customerKim);

        System.out.println("=========== 고객정보 출력 =======");

        for (Customer customer : customerList) {
            System.out.println(Customer.showCustomerInfo());
        }

        System.out.println("========== 할인률과 보너스 포인트 결과 ==========");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);

            System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불하셨습니다. ");
            System.out.println(customer.showCustomerInfo());
        }
    }
}
