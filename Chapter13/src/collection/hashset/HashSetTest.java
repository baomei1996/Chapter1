package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        boolean b = set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(b);
        System.out.println(set);
        boolean b1 = set.add("aaa");
        System.out.println(b1); //값이 중복이 되어 안들어감

        System.out.println(set);
    }
}
