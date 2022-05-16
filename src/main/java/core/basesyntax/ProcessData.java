package core.basesyntax;

import java.util.Arrays;

public class ProcessData {
    public static final String DIVIDE_WORDS_REGEX = "\\W+";
    public static final char START_WORD_WITH_CHAR = 'w';

    public String[] processData(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0];
        }

        String filteredData = filter(input.toLowerCase());
        if (filteredData.isEmpty()) {
            return new String[0];
        }

        String[] array = filteredData.split(" ");
        Arrays.sort(array);
        return array;
    }

    private String filter(String input) {
        String[] array = input.split(DIVIDE_WORDS_REGEX);
        StringBuilder output = new StringBuilder();

        for (String element : array) {
            if (element.charAt(0) == START_WORD_WITH_CHAR) {
                output.append(element).append(" ");
            }
        }
        return output.toString().strip();
    }
}
