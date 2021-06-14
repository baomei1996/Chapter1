package innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass () {
        inClass = new InClass();
    }
    private class InClass{
        int inNum = 200;
        // static int sInNum = 100; static 변수는 생성과 상관없이 사용이 가능해야 하지만
        // inner class 는 생성이 되어야 실행되기때뮨에 내부에서는 사용할 수 없음
        void inTest() {
            System.out.println(num);// 외부 클래스의 private 변수 사용 가능
            System.out.println(sNum); //정적변수의 사용은 가능하다

        }
    }
    public void usingInTest() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //num += 10; // 외부클래스의 인스터스변수 사용할 수 없음 - 생성이 될지 안될지 모르기 때문
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
            // System.out.println(iNum); 정적변수 클래스의 생성과 상관 없이 정적 메서드는 그냥 호출 될 수 있기 때문에 사용 불가
            System.out.println(sInNum);

            OutClass.InStaticClass.sTest(); // 생성과 상관없이 사용가능한 정적 메서드
        }

    }

}

public class InnerTest {

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
       // outClass.inClass.inTest();

        //OutClass.InClass inClass = outClass.new InClass();

        outClass.usingInTest(); // private 한 경우

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();


    }
}
