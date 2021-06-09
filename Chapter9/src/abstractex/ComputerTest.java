package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        // Computer c1 = new Computer(); 추상메서드를 종결시키지 않았기 때문에 생성이 안됨
        Computer c2 = new DeskTop();
        Computer c3 = new MyNoteBook();
        NoteBook c4 = new MyNoteBook();

        c4.turnOn();
        c4.turnOff();
        c4.display();
        c4.typing();
    }
}
