package collection.hashmap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();
        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberShin);

        memberHashMap.showAllMember();

    }
}
