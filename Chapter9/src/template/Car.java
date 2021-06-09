package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();

    public void washCar() {}

    public void startCar () {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff () {
        System.out.println("시동을 끕니다. ");
    }

    public final void run() {
        // final 을 선언하게 되면 상속받은 클래스에서 재정의 할 수 없다. 고정된 시나리오를 원할떼 (template 메서드 )
        startCar();
        drive();
        wiper();
        washCar();// 이미 구현{}을 함 그렇기에 하위클래스에서 반드시 책임을 질 필요가 없음 즉 필요에 따라 재정의 할 수 있다.
        stop();
        turnOff();
    }
}
