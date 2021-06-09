package witharraylist;

import inheritance.Customer;

public class VIPCustomer extends Customer {
    int agentID;
    double saleRatio;
    double bonusRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio  = 0.1;

        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String) 호출!");
    }

    public int getAgentID() {
        return agentID;
    }

    public int calcPrice (int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * bonusRatio);
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }

    @Override
    public double getBonusRatio() {
        return bonusRatio;
    }

    @Override
    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 Id는 " + agentID + "입니다. ";
    }
}
