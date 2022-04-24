package racingcar.model;

import org.junit.platform.commons.util.StringUtils;

public class Car {

    private static final int USERNAME_LENGTH_LIMIT = 5;

    private final String name;

    public Car(String name) {
        if (StringUtils.isBlank(name)) {
            System.out.println("[ERROR] 이름이 입력되지 않았습니다.");
            throw new IllegalArgumentException("[ERROR] 이름이 입력되지 않았습니다.");
        }

        if (name.length() > USERNAME_LENGTH_LIMIT) {
            System.out.println("[ERROR] 이름이 5자를 초과했습니다.");
            throw new IllegalArgumentException("[ERROR] 이름이 5자를 초과했습니다.");
        }

        this.name = name;
    }
}
