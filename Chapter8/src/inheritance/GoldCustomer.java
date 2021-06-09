package inheritance;

public class GoldCustomer extends Customer {

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        customerGrade = "Gold";
    }

    public int calcPrice (int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * bonusRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
