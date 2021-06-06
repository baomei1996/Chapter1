package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("james", 5000);
        Student tomas = new Student("tomas", 10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        tomas.takeSubway(subwayGreen);
        tomas.showInfo();
        subwayGreen.showInfo();


        Taxi taxi20 = new Taxi(20);
        tomas.takeTaxi(taxi20);
        tomas.showInfo();
        taxi20.showInfo();

        //static 정적변수 / 여런 인스턴스 변수를 공유할 때 전체프로그램이 메모리에 로드될때 할당을 받음 따라서
        // 인스턴스의 생성과 관계없이 클래스 이름으로 직접 참조함
        // 클래수 변수라고도 함
        // (상수, 리터럴, static) 등

        // 인스턴스 변수는  new 할때 할당을 받음

    }
}
