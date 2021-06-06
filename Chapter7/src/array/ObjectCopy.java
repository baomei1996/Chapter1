package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥1", "조정래");
        bookArray1[1] = new Book("태백산맥2", "조정래");
        bookArray1[2] = new Book("태백산맥3", "조정래");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].setBookName(bookArray1[i].getBookName());
        }


       // System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박원서");

       for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        // 얕은복사 값이 복사 된 것이 아닌 주소가 복사된 것 그렇기에 값이 바뀌면 복사한 배열 역시 값이 바뀜
        // 깊은복사를 하고자 한다면 두개의 배열을 따로 new 하고, 직접 대입함


        String[] strArr = {"Java", "Android", "C"};

        for (String s : strArr) {
            System.out.println(s);
        }

        int[] arr = {1, 2, 3, 4, 5};

        for (int num : arr) {
            System.out.println(num);
        }



    }
}
