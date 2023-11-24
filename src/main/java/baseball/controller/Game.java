package baseball.controller;

import baseball.model.Computer;
import baseball.model.Referee;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Game {
    Computer computer = new Computer(new ArrayList<>());
    Referee referee = new Referee();
    User user;
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void play() {
        playSetting();
        playGame();
        playResult();
    }

    private void playSetting() {
        computer.generateNumbers();

        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.println("숫자를 입력해주세요 : ");
        String inputValue = Console.readLine();

        user  = new User(inputValue);
    }

    private void playGame() {
        referee.judge(computer.computerNumbers(), user.getUserNumbers());
    }

    private void playResult() {
        int strike = referee.getStrike();
        int ball = referee.getBall();
        judgeResult(strike, ball);
        askReplay();
    }
    private void judgeResult(int strike, int ball) {
        if(!isNone(strike, ball) && !isStrike(strike, ball)){
            outputView.showStrikeAndBall(strike, ball);
        }
    }

    private boolean isNone(int strike, int ball) {
        if(strike == 0 && ball == 0) {
            outputView.showNone();
            return true;
        }
        return false;
    }

    private boolean isStrike(int strike, int ball) {
        if (strike == 3) {
            outputView.showThreeStrike(strike);
            return true;
        }
        return false;
    }

    private void askReplay() {
        String userInput = inputView.showReplay();

        if (userInput.equals("1")) {
            play();
        }
    }
}