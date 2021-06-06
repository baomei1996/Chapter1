package thisex;

class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public  static void main(String[] args) {
        Birthday b1 = new Birthday();

        Birthday b2 = new Birthday();

        System.out.println(b1);
        b1.printThis();//This 가 가르키는 것은 그때의 자기의 메모리,  자신 new 할때 주소값이 달라짐
    }
}
