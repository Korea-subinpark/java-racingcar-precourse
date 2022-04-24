package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Round;
import racingcar.view.InputView;

import java.util.List;

public class RacingGame {

    public void play() {
        List<Car> cars = InputView.inputUsers();
        Round round = InputView.inputRound();
    }
}
