package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Integer> userNumbers = new ArrayList<>();

    public User(String inputValue) {
        for (int i = 0; i < inputValue.length(); i++) {
            userNumbers.add(Integer.parseInt(inputValue.substring(i, i + 1)));
        }
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }
}
