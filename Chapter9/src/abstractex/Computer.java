package abstractex;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다. ");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다. ");
    }


}

// 추상클래스와 템플릿 메서드
// 템플릿 메서드 : 추상 메서드나 구현된 메서드를 활용하여
//              전체 기능의 흐름(시나리오) 을 정의하는 메서드
//              final 로 선언하면 하위클래스에서 재정의 할 수 없음

// 프레임 워크에서 많이 사용되는 설계패턴
// 추상클래스소 선언된 상위클래스에 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고
// 하위 클래스에서 다르게 구현되어야 하는 부분은 추상 메서드로 선언해서 하위 클래스가 구현하도록 함