package innerclass;

class Outer {
    int outNum = 100;
    static int sNum = 200;;

   /* Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    }
    */
    public Runnable getRunnable() {
        int localNum = 100;
        // Runnable : Thread 생성 시 사용하는 인터페이스

        return new Runnable() { // 이름을 없앰 익명 내부 클래스 단 하나만의 메서드
            @Override
            public void run() {
                // localNum += 10; 지역변수를 사용하는건 상관없지만 변화시킬 수는 없다.
                // 매모리의 생성시기가 다르기 때문 그렇기에 변화시키지 말란 의미로 final 로 설정
                outNum += 10; // 은 가능
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        };
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable().run();

    }
}
