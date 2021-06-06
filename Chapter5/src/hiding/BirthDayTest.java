package hiding;

class BirthDay {

  /* (default) 패키지 내에서 사용가능 */  private int day;
    // public이면 사용가능
  // private 는 같은 클래스 안에서만 그냥 사용할 수 있음

   private int month;
    private int year;

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (month == 2) {
      if (day < 1 || day > 28) {
        System.out.println("날짜 오류입니다.");
      } else {  this.day = day;   }
    }

  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {

    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
// 하나의 파일 안에 여러개의 클래스가 있을 수 있지만 public 클래스는 하나만 있어야 하고 파일 이름과 동일해야 한다.
public class BirthDayTest {
  public static void main(String[] args){
    BirthDay day = new BirthDay();

    day.setMonth(2);
    day.setYear(2018);
    day.setDay(25);
  }

}
