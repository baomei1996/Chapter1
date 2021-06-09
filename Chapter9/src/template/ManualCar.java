package template;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다. ");
        System.out.println("사람이 핸들을 조작합니다. ");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 정지합니다. ");

    }

    public void wiper() {
        System.out.println("사람이 수동으로 와이퍼를 작동합니다. ");
    }

    //public void run() {} 상위 클래스에서 final로 고정됨
}
