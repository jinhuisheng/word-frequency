import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/1/16.
 */
class WordFrequencyTest {
//    @Test
//    void demo() {
//        assertThat(WordFrequency.calculate("he is is a boy")).isEqualTo("is 2\nhe 1\na 1\nboy 1");
//    }

    @Test
    void should_return_empty_when_input_empty() {
        assertThat(WordFrequency.calculate("")).isEqualTo("");
    }

    @Test
    void should_return_success_when_input_one_word() {
        assertThat(WordFrequency.calculate("he")).isEqualTo("he 1");
        assertThat(WordFrequency.calculate("is")).isEqualTo("is 1");
    }

    @Test
    void should_return_success_when_input_two_word() {
        assertThat(WordFrequency.calculate("he is")).isEqualTo("he 1\nis 1");
    }

    @Test
    void should_return_success_when_input_three_word() {
        assertThat(WordFrequency.calculate("he is who")).isEqualTo("he 1\nis 1\nwho 1");
    }

    @Test
    void should_return_success_when_input_repeated_word() {
        assertThat(WordFrequency.calculate("he he is")).isEqualTo("he 2\nis 1");
    }

    @Test
    void should_return_success_when_input_repeated_word_2() {
        assertThat(WordFrequency.calculate("he is is")).isEqualTo("is 2\nhe 1");
    }

    @Test
    void should_throw_exception_when_input_format_wrong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> WordFrequency.calculate("he  is"), "Format exception");

    }
}
