package witharraylist;

public class Customer { //protected 상속관계에서는 public / (default) 같은 패키지 내에서만
    // private < default < protected < public2
    //            외부클래스  하위클래스  동일패키지  내부클래스
    //  public        O         O         O        O
    //  protected     X         O         O        O
    //  (default)     X         X         O        O
    //  private       X         X         X        O

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

   /* public Customer() {

        System.out.println("Customer 호출!");
        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }
    */

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) 호출!");

    }


    public int calcPrice (int price) {

        if (customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio;
        }
        return price;
    }

    public static String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

}

// 새로운 고객 등급이 필요한 경우
// 단골 고객에 대한 혜택이 필요함
//이런식으로 하면 등급이 늘어날때마다 이렇게 한다? 비효율적이고 코드가 늘어질것
