package scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else  if (ch == 'p' || ch == 'P') {
            scheduler = new PriorityAllocation();
        } else  {
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
     }
}

// 인터페이스 요소
// 상수 : 모든 변수는 상수로 변환됨
// 추상 메서드 : 모든 메서드는 추상 메서드로 구현됨
// 디폴트 메서드 : 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있음
// 정적 메서드 : 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
// private 메서드 : 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음.
//                 인터페이스 내부에서만 기능을 제공하기 위해 구형하는 메서드