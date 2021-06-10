package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        Sell seller = customer;
        seller.sell();

        customer.order(); //고객판매 주문
        buyer.order();    //고객판매 주문
        seller.order();   //고객판매 주문 모두 overriding 된 메서드로 나옴

    }

}
