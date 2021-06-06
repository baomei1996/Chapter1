package thisex;

class Person {
    String name;
    int age;
    public Person() {
        this("이름없음", 0);
        // 생성자에서 다른 생성자를 호출하는 this 를 쓸 때 이 this 는 가장 먼저 나오는 statement 이어야 한다.

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        // 자기자신의 클래스 명을 리턴값으로 넣어야함 this 주소값을 리턴하기 위해서
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {

        Person p1 = new  Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.returnSelf());


    }
}
