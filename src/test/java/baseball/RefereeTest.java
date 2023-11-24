package baseball;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import baseball.model.Referee;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RefereeTest {
    @ParameterizedTest
    @MethodSource("generateData")
    public void 심판_스트라이크_테스트(List<Integer> userNumbers, List<Integer> computerNumbers, int index) {
        Referee referee = new Referee();
        int[] result = {1, 0};

        referee.judge(computerNumbers, userNumbers);

        assertThat(referee.getStrike()).isEqualTo(result[index]);
    }

    @ParameterizedTest
    @MethodSource("generateData")
    public void 심판_볼_테스트(List<Integer> userNumbers, List<Integer> computerNumbers, int index) {
        Referee referee = new Referee();
        int[] result = {2, 0};

        referee.judge(computerNumbers, userNumbers);

        assertThat(referee.getBall()).isEqualTo(result[index]);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2), 0),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), 1)
        );
    }
}
