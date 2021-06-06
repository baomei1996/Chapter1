package staticex;

public class Student {

    private static int serialNum = 10000;
    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        int i = 10;// 지역변수 이 메서드가 호출될 때 생성 이 메서드가 끝나면 없어짐 그렇기에 문제가 되지 않음
        i++;
        System.out.println(i);

        // studentName = "홍길동"; 멤버변수 인스턴스변수 / new 될 떼 생성됨 static은 new 와 상관없이 호출되기 때문에 인스턴스 변수를 사용할 수 없다.
        return serialNum;// static 변수, 클래스 변수

    }

}
