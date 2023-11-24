package baseball.model;

import java.util.List;
import java.util.Objects;

public class Referee {
    private int strike = 0;
    private int ball = 0;

    public void judge(List<Integer> computerNumbers, List<Integer> userNumbers) {
        for (int i = 0; i < userNumbers.size(); i++) {
            String result = judgeResult(computerNumbers, userNumbers.get(i), i);
            counter(result);
        }
    }

    private String judgeResult(List<Integer> computerNumbers, int userNumbers, int userIndex) {
        if (computerNumbers.contains(userNumbers)) {
            return judgeStrikeAndBall(computerNumbers, userNumbers, userIndex);
        }
        return "None";
    }

    private String judgeStrikeAndBall(List<Integer> computerNumbers, int userNumbers, int userIndex) {
        if (isStrike(computerNumbers, userNumbers, userIndex)) {
            return "Strike";
        }
        return "Ball";
    }

    private boolean isStrike(List<Integer> computerNumbers, int userNumbers, int userIndex) {
        return computerNumbers.indexOf(userNumbers) == userIndex;
    }

    private void counter(String result) {
        if (Objects.equals(result, "Strike")) {
            strike++;
        }
        if (Objects.equals(result, "Ball")) {
            ball++;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}