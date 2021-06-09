package gamelevel;

public class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 달립니다. ");
    }

    @Override
    public void jump() {
        System.out.println("점프가 모얌");
    }

    @Override
    public void turn() {
        System.out.println("나느 못 돌아");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*****초보자 레벨입니다*****");
    }
}
