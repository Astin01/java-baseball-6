package baseball.view;

public class OutputView {
    public void showThreeStrike(int strike) {
        System.out.println(strike + "스트라이크");
    }
    public void showStrikeAndBall(int strike, int ball) {
        System.out.println(ball + "볼"+strike + "스트라이크 " );
    }
    public void showNone(){
        System.out.println("낫싱");
    }
}
