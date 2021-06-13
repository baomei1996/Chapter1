public class Note3 {
    /*
    1. TreeSet 클래스
    - 객체의 정렬에 사용되는 클래스
    - 중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬 함
    - 내부적으로 이진 검색트리 (binary search tree) 로 구현되어 있음
    - 이진 검색 트리에 저장 될 때 비교하여 저장될 위치를 정함
    - 객체 비교를 위
    해 Comparable 이나 Comparator 인터페이스를 구현해야 함

    2. Comparable 인터페이스와 Comparator 인터페이스
    - 정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
    - Comparable 은 CompareTo() 메서드를 구현
    - 매개변수와 객체 자신 (this)를 비교
    - Comparator 는 Compare() 메서드를 구현
      두 개의 매개 변수를 비교
      TreeSet 생성자에 Comparator 가 구현된 객체를 매개변수로 존달
    - 일반적으로 Comparable 을 더 많이 사용
    - 이미 Comparable 이 구현된 경우 Comparator 를 이용하여 다른 정렬 방식을 구현할 수 있음


    3. Map 인터페이스
    - key-value pair 의 객체를 관리하는데 필요한 메서드가 정의 됨
    - key 는 중복될 수 없음
    - 검색을 위한 자료 구조
    - key 를 이용하여 저장하거나 검색, 삭제 할 때 사용하면 편리함
    - 내부적으로 hash 방식으로 구현
      index = hash(key)// index 는 저장위치
    - key 가 되는 객체는 객체의 유일성함의 여부를 알기 위해 equals() 와 hashCode() 메서드를 재정의 함

    4. HashMap 클래스
    - Map 인터페이스를 구현한 클래스 중 가장 일반적으로 사용하는 클래스
    - HashTable 클래스는 자바2부터 제공된 클래스로 Vector 처럼 동기화를 제공 함
    - 여러 메서드를 활용하여 pair 자료를 쉽고 빠르게 관리할 수 있음


     */
}
