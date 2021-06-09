package inheritance;

public class Circle {

    Point point;   // has a 관계

    private int radius;

    public Circle () {
        point = new Point();
    }
}
// 상속을 활용한 고객관리 프로그램
// 고객의 정보를 활용하여 고객 맞춤 서비스를 구현
// 고객의 등급에 따라 차별화 된 할인율과 포인트를 지급
// 등급에 따른 클래스를 따로 구현하는 것이 아닌 일반적인 클래스를 먼저 구현하고
// 그 보다 기능이 많은 클래스는 상속을 활용하여 구현함

//   Customer
// Vip customer gold customer