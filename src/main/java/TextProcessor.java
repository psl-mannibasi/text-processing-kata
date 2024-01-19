import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TextProcessor {

    public static String textProcessing(String input) {

        StringBuilder builder = new StringBuilder();
        builder.append("The top 10 words used include:");

        String[] words = input.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");
        System.out.println(Arrays.toString(words));
        Map<String,Integer> map = new HashMap<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (map.containsKey(lowerWord)) {
                Integer wordCount = map.get(lowerWord);
                wordCount++;
                map.put(lowerWord, wordCount);
            } else {
                map.put(lowerWord,1);
            }
        }
        System.out.println(map);

        return builder.toString();
    }
}
