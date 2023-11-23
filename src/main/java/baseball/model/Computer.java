package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public record Computer (List<Integer> computerNumbers) {

public void generateNumbers() {
    while (computerNumbers.size() < 3) {
        int randomNumber = Randoms.pickNumberInRange(1, 9);

        if (!computerNumbers.contains(randomNumber)) {
            computerNumbers.add(randomNumber);
        }
    }
}
}
