package baseball.controller;

import baseball.model.Computer;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Game {
    Computer computer = new Computer(new ArrayList<>());

    public void play() {
        playSetting();
        playGame();
        playResult();
    }

    private void playSetting() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.println("숫자를 입력해주세요 : ");
        String inputValue = Console.readLine();
    }

    private void playGame() {

    }

    private void playResult() {

    }
}