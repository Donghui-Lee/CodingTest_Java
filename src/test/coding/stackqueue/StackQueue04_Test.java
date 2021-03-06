package test.coding.stackqueue;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dhlee.coding.stackqueue.StackQueue04;
import dhlee.coding.stackqueue.StackQueue04_Best;

@DisplayName("Stack Queue")
public class StackQueue04_Test {

    final StackQueue04 test = new StackQueue04();
    final StackQueue04_Best bestTest = new StackQueue04_Best();

    @Test
    void test_01() {
        int[] price = {1, 2, 3, 2, 3};
        int[] answer = {4, 3, 1, 1, 0};

        int[] result = test.solution(price);
        int[] result2 = bestTest.solution(price);

        assertThat(result).isEqualTo(answer);
        assertThat(result2).isEqualTo(answer);
    }

    @Test
    void test_02() {
        int[] price = {1, 1, 1, 1, 1};
        int[] answer = {4, 3, 2, 1, 0};

        int[] result = test.solution(price);
        int[] result2 = bestTest.solution(price);

        assertThat(result).isEqualTo(answer);
        assertThat(result2).isEqualTo(answer);
    }

    @Test
    void test_03() {
        int[] price = {5, 4, 3, 2, 1};
        int[] answer = {1, 1, 1, 1, 0};

        int[] result = test.solution(price);
        int[] result2 = bestTest.solution(price);

        assertThat(result).isEqualTo(answer);
        assertThat(result2).isEqualTo(answer);
    }
}
