package abstractex;

public class MyNoteBook extends NoteBook {
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing()");
    }

    // abstract 클래스를 상속받게 되면 하위 클래스는 상위 클래의 추상메서드에 대한 구현 책임이 있다.
}