package wordFrequency;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author huisheng.jin
 * @date 2020/9/28.
 */
public class WordFrequency {

    private static final String DELIMITER = "\n";
    private static final String SEPARATOR = " ";

    public static String calculate(String input) {
        return StringUtils.isBlank(input) ? "" : parse(input);
    }

    private static String parse(String input) {
        String[] stringArray = input.split(SEPARATOR);
        LinkedHashMap<String, Long> group = groupCount(stringArray);
        Stream<Map.Entry<String, Long>> sorted = sort(group);
        return join(sorted);
    }

    private static String join(Stream<Map.Entry<String, Long>> entryStream) {
        return entryStream
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .collect(Collectors.joining(DELIMITER));
    }

    private static Stream<Map.Entry<String, Long>> sort(LinkedHashMap<String, Long> group) {
        return group.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()));
    }

    private static LinkedHashMap<String, Long> groupCount(String[] stringArray) {
        return Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new
                        , Collectors.mapping(String::new, Collectors.counting())));
    }
}
