import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * @author huisheng.jin
 * @date 2020/1/16.
 */
public class WordFrequency {
    public static String calculate(String str) {
        if (StringUtils.isBlank(str)) {
            return "";
        }
        return Arrays.stream(str.split(" "))
                .filter(WordFrequency::checkFormat)
                .collect(Collectors.groupingBy(item -> item, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> (int) (b.getValue() - a.getValue()))
                .map(item -> countOneWord(item.getKey(), item.getValue()))
                .collect(Collectors.joining("\n"));
    }

    private static boolean checkFormat(String word) {
        if (StringUtils.isEmpty(word)) {
            throw new IllegalArgumentException("Format exception");
        }
        return true;
    }

    private static String countOneWord(String word, Long value) {
        return word + " " + value;
    }
}
