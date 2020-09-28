package wordFrequency;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/9/28.
 */
public class WordFrequencyTest {
//    @Test
//    void should_parse_right() {
//        String input = "she is a girl is no no is";
//        assertThat(WordFrequency.calculate(input)).isEqualTo("is 3\nno 2\nshe 1\na 1\ngirl 1");

    @Test
    void test() {
        assertThat(WordFrequency.calculate("")).isEqualTo("");
    }

    @Test
    void test2() {
        assertThat(WordFrequency.calculate("he")).isEqualTo("he 1");
    }

    @Test
    void test3() {
        assertThat(WordFrequency.calculate("he is")).isEqualTo("he 1\nis 1");
    }

    @Test
    void test4() {
        assertThat(WordFrequency.calculate("he he")).isEqualTo("he 2");
    }

    @Test
    void test5() {
        assertThat(WordFrequency.calculate("he he is")).isEqualTo("he 2\nis 1");
    }

    @Test
    void test6() {
        assertThat(WordFrequency.calculate("he is is")).isEqualTo("is 2\nhe 1");
    }

//    }

}
