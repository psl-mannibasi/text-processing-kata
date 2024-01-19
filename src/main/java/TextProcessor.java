import java.util.HashMap;

public class TextProcessor {

  public HashMap<String, Integer> countTop10Words(String text) {
    String[] wordArray = splitWords(text);

    HashMap<String, Integer> top10 = new HashMap<>();

    top10 = countWords(wordArray);

    top10 = orderWords(top10);

    System.out.println(top10.toString());
    return top10;
  }

  private String[] splitWords(String text) {
    return text.split(" ");
  }

  private HashMap<String, Integer> orderWords(HashMap<String, Integer> wordCount) {
    String topWord = null;
    for (String word : wordCount.keySet()) {
      if (topWord == null) {
        topWord = word;
      }

      if (wordCount.get(word) > wordCount.get(topWord)) {
        topWord = word;
      }
    }
  }

  private HashMap<String, Integer> countWords(String[] wordArray) {
    HashMap<String, Integer> runningTotal = new HashMap<>();
    for (String word : wordArray) {
      runningTotal.put(word, 0);
    }

    for (String word : wordArray) {
      runningTotal.put(word, runningTotal.get(word) + 1);
    }

    return runningTotal;
  }

}
