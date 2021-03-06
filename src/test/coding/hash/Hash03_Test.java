package test.coding.hash;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dhlee.coding.hash.Hash03;
import dhlee.coding.hash.Hash03_Best;

@DisplayName("Hash")
public class Hash03_Test {
    final Hash03 test = new Hash03();
    final Hash03_Best bestTest = new Hash03_Best();

    @Test
    void test_01() {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = 5;

        int result = test.solution(clothes);
        int result2 = bestTest.solution(clothes);

        assertThat(result).isEqualTo(answer);
        assertThat(result2).isEqualTo(answer);
    }

    @Test
    void test_02() {
        String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        int answer = 3;

        int result = test.solution(clothes);
        int result2 = bestTest.solution(clothes);

        assertThat(result).isEqualTo(answer);
        assertThat(result2).isEqualTo(answer);
    }

    @Test
    void test_03() {
        String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"yellowhat", "headgear"}, {"green_turban", "headgear"}};
        int answer = 8;

        int result = test.solution(clothes);
        int result2 = bestTest.solution(clothes);

        assertThat(result).isEqualTo(answer);
        assertThat(result2).isEqualTo(answer);
    }
}
