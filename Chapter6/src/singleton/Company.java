package singleton;

public class Company {
   private static Company instance = new Company(); // 하나만 만들어져야 하는 것에 대해 여기서 미리 뉴를 처리하고 static 으로  다른 클래스에서 뉴를 하지 않고 쓰기 위해
   private Company(){}//함부로 인스턴스를 생성하지 못하도록 위에서 미리 생성하고 static 처리

    public static Company getInstance() { // 객체를 생성하지 않고 가져다 쓸 수 있는 방법 singleton pattern
       if (instance == null) {
           instance = new Company();
       }
       return instance;
    }
}
