public class Note2 {
    /*
8. String 클래스
- String 을 선언하는 2가지 방법
  1) String str1 = new String("abc")l
  2) String srt2 = "test";
- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool) 에 있는 주로를 참조하는 방법 두 가지

9. String 클래스로 문자열 연결
- 한번 생성된 String 값은 불변
- 두 개의 문자열을 연결하면 새로운 인스턴스가 생성됨
- 문자열 연결을 계속하면 메모리에 garbage 가 많이 생길 수 있음
따라서 StringBuilder, StringBuffer 사용하기
- 내부적으로 가변적인 char[] 배열을 가지고 있는 클래스
- 문자열을 여러 번 연결하거나 사용하면 유용함
- 매번 새로 생성하지 않고 기존 배열을 변경하므로 garbage 가 생기지 않음
- StringBuffer 는 멀티 쓰레드 프로그래밍에서 동기화 (synchronization) 을 보장
- 단일 쓰레드 프로그램에서는 StringBuilder 를 사용하기를 권장
- toString 메서드로 String 반환환

10. Class 클래스
- 자바의 모든 클래스와 인터페이스는 컴파일 후 클래스 파일로 생성됨
- class 파일에는 객체의 정보 (멤버변수, 메서드, 생성자 등)가 포함되어 있음
- class 클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음
11. Class 클래스 정보 가져오기
- reflection 프로그래밍 : 클래스를 이용하여 클리스의 정보 (생성자, 멤버변수, 메서드)를 가져오고 이를
  활용하여 인스턴스를 생성하고, 메서드를 호출하는 등의 프로그래밍 방식
- 로컬 메모리에 객체가 없어서 객체의 데이터 타입을 직접 알 수 없는 경우 (원격에 객체가 있는경우등)
  객체 정보만을 이용하여 프로그래밍 할 수 있음
- Constructor, Method, Filed 등 java.lang.reflect 패키지에 있는 클래스들을 활용하여 프로그래밍
- 일반적으로 자료형을 알 수 있는 경우에는 사용하지 않음

12. Class.forName() 메서드로 동적 로딩하기
- 동적로딩이란? 컴파일 시에 데이터 타입이 모두 binding 되어 자료형이 로딩되는 것 (static loading) 이 아니라
  실행중에 데이터 타입을 알고 binding 되는 방식
- 프로그래밍 할 때는 어떤 클래스를 사용할지 모를 때 변수로 처리하고 실행될때 해당변수에 대입된 값의 클래스가
  실행될 수 있도록 Class 클래스에서 제공하는 static 메서드
- 실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용함
- 컴파일 타임에 체크 할 수 없으므로 해당 문자열에 대한 클래스가 없는 경우 예외(ClassNonFoundException)이 발샐할 수 있음



     */
}