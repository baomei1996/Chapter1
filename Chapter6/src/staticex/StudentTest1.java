package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentJ = new Student();
        System.out.println(studentJ.studentID);
        //10001
        Student studentT = new Student();
        System.out.println(studentT.studentID);
        //10002

        System.out.println(Student.getSerialNum());

       // System.out.println(studentJ.serialNum);
        // System.out.println(studentT.serialNum);//static 변수나 메서드들은 대부분 클래스 이름으로 참조함 ex) Student.serialNum
        // privat 으로 static을 선언하면 외부에서 함부로 변경하지 못함
    }
}
