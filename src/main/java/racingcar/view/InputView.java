package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final int USERNAME_LENGTH_LIMIT = 5;

    public static String[] inputUsers() {
        System.out.println("-경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
        String[] inputs = Console.readLine().split(",");
        for (String input : inputs) {
            validateUsername(input);
        }

        return inputs;
    }

    public static int inputRound() {
        System.out.println("-시도할 횟수");
        return Integer.parseInt(Console.readLine());
    }

    private static void validateUsername(String input) {
        if (input.length() > USERNAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException("[ERROR] 이름이 5자를 초과했습니다.");
        }
    }
}
