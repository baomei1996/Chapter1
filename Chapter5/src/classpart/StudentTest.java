package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이순신");
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.setStudentName("김유신");
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}

//package = 소스의 묶음/ 소스의 계층구조를 보여줌/ ++ 소스 관리 유지보수의 중요한 역할을 함
