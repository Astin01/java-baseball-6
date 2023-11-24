package baseball;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import baseball.model.Computer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    void 컴퓨터_랜덤_숫자_개수_테스트(){
        Computer computer = new Computer(new ArrayList<>());

        computer.generateNumbers();

        assertThat(computer.computerNumbers()).hasSize(3);

    }

    @Test
    void 컴퓨터_랜덤_숫자_중복_테스트(){
        Computer computer = new Computer(new ArrayList<>());

        computer.generateNumbers();
        List<Integer> newList = computer.computerNumbers().stream().distinct().collect(Collectors.toList());

        assertThat(newList.size()).isEqualTo(3);
    }
}
