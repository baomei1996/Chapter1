package inheritance;

import java.util.ArrayList;

class Animal {
    public void move () {
        System.out.println("동물이 움직입니다. ");
    }

}

class Human extends Animal {
    public void move () {
        System.out.println("사람이 두발로 걷습니다. ");
    }

    public void readBook () {
        System.out.println("사람이 책을 읽습니다. ");
    }
}
class Tiger extends Animal {
    public void move () {
        System.out.println("호랑이가 네발로 걷습니다. ");
    }

    public void hunting () {
        System.out.println("호랑이가 사냥을 합니다. ");
    }
}

class Egle extends Animal {
    public void move () {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying (){
        System.out.println("하늘을 날아갑니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Egle());


        // 다형성 사용 예제 1)
        Animal[] animalList = new Animal[3];
        animalList[0] = new Human();
        // 예제 2
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger());

        Animal animal = new Animal();
        animal.move();
    }

    public void moveAnimal (Animal animal) {
        animal.move();

        if (animal instanceof Human) {
            Human human = (Human)animal;
            human.readBook();
        } else if (animal instanceof  Tiger) {
            Tiger tiger = (Tiger)animal;
            tiger.hunting();
        } else if (animal instanceof  Eagle) {
            Egle egle = (Egle)animal;
            egle.flying();
        } else {
            System.out.println("지원하지 않는 기능입니다.");
        }

        //예제 3// Human h = (Human) animal;
    }
}

// 다형성 구현하기
// 하나의 클래스를 상속받은 여러 클래스가 있는 경우
// 각 클래스마다 같은 이름의 서로 다른 메서드를 재정의 함
// 상위 클래스 타입으로 선언된 하나의 변수가 여러 인스턴스에 대입되어
// 다양한 구현이 실행될 수 있음

// 다형성 활용하기
// 일반고객과 VIP 고객의 중간등급 고객을 생성
// 5명의 고객을 ArrayList에 생성하여 저장한 다음
// 각 고객이 물건을 샀을 때 가격과 보너스 포인트를 계산 함

// 여러 클래스를 생성하지 않고 하나의 클래스에 공통적인 요소를 모으고