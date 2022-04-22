package racingcar.controller;

import racingcar.view.InputView;

public class RacingGame {

    public void play() {
        try {
            String[] users = InputView.inputUsers();
            int round = InputView.inputRound();
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자가 아닌 문자가 입력되었습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 이름이 5자를 초과했습니다.");
        }
    }
}
