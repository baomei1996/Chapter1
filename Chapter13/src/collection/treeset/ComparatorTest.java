package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>(new MyCompare());// 내림차순으로 정렬
        // 기본적으로 comparable 을 많이 사용 comparator 를 사용하고자 한다면 위와 같이 new 를 해주면 됨
        tree.add("aaa");
        tree.add("bbb");
        tree.add("ccc");

        System.out.println(tree);
    }
}
