public class Note2 {
    /*

     7. 컬렉션 프레임워크
    - 프로그램 구현에 필요한 자료구조(Data Structure)를 구현해 놓은 라이브러리
    - java.until 패키지에 구현되어 있음
    - 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
    - 여러 인터페이스와 구현 클래스 사용 방법을 이해해야 함

           [Collection]                                            [Map]
                 ^                                                   ^
                 |                                                   |
       [List]           [Set]                         [Hashtable] [HashMap] [TreeMap]
          ^                 ^                             ^
          [ArrayList]       [HashSet]                  [Properties]
          [Vector]          [TreeSet]     {Iterator}
          [LinkedList]                     데이터 순회


    8. Collection 인터페이스
    - 하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스
    - 하위에 List 와  Set 인터페이스가 있음
    - 여러 클래스등이 Collection 인터페이스를 구현함
    - List 인터페이스 : 순서가 있는 자료관리, 중복허용. 이 인터페이스를 구현한 클래스는
                      ArrayList, Vector, LikedList, Stack, Queue 등이 있음
    - Set 인터페이스 : 순서가 정해져있지 않음, 중복을 허용하지 않음. 이 인터페이스를 구현한 클래스는
                      HashSet, TreeSet 등이 있음

    9. Collection 인터페이스
    -  Collection 인터페이스에 사용된 주요 메서드
    boolean add (E e) - Collection 에 객체를 추가합니다.
    void clear() - Collection 에 모든 객체를 제거합니다.
    Iterator<E> iterator - Collection 을 순회할 반복자(Iterator)를 반환합니다.
    boolean remove(Object o) - Collection 에 매개변수에 해당하는 인스턴스가 존재하면 제거합니다.
    int size() - Collection 에 있는 요소의 개수를 반환합니다.

    10. ArrayList 와 Vector
    - 객체 배열을 구현한 클래스
    - Vector 는 자바 2부터 제공된 클래스
    - 멀티쓰레드 상태에서 리소스에 대한 동기화가 필요한 경우 Vector 를 사용
    - 일반적으로 ArrayList 를 더 많이 사용함
    - ArrayList 에 동기화 기능이 추가되어야 하는 경우
      Collection. synchronizedList(new ArrayList<String>());
    - 동기화(synchronization) : 두 개의 쓰레드가 동시에 하나의 리소스에 접근 할 때 순서를 맞추어서 데이터에
      오류가 발생하지 않도록 함

    11. Stack 과 Queue
    - Stack 과 Queue 의 기능은 구현된 클래스가 있지만 ArrayList 나 LinkedList 를 활용하여서 사용될 수도 있음
    - Stack : Last In First
    - 맨 마지막에 추가 된 요소가 먼저 꺼내지는 자료구조
      게임의 무르기 기능, 최근 자료 추출등에서 사용

      12. Iterator 사용하여 순회하기
      - Collection 의 개체를 순회하는 인터페이스
      - iterator () 메서드를 호출
      
      13. Set 인터페이스
      - Collection 하위의 인터페이스
      - 중복을 허용하지 않음
      - 아이디, 주민번호, 사번 등 유일한 값이나 객체를 관리할 때 사용
      - List 는  순서기반 인터페이스지만, Set 은 순서가 없음
      - 저장된 순서와 출력순서는 다를 수 있음
      - get(i) 메서드가 제공되지 않음



     */
}
