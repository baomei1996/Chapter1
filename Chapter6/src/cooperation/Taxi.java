package cooperation;

public class Taxi {
    int taxiNumber;
    int passengerCount;
    int money;


    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public void take(int money) {

        passengerCount++;
        this.money += money;

    }

    public void showInfo () {
        System.out.println(taxiNumber + " 번 택시의 승객은 " + passengerCount + "명이고, 수입입" + money + "입니다." );
    }
}
