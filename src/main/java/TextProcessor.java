import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

public class TextProcessor {

  public static String processText(String input){
    return "";
  }

  public static long countNumberOfWord(String input){
    return Arrays.stream(input.split("\\s")).count();
  }

  public static HashMap<String, Integer> textToHash(String input){
    HashMap<String, Integer> myMap = new HashMap<>();
    String[] splitWords = input.replace("","").split("\\s");
    splitWords.
    for(String word: splitWords)
    {
      Integer count = myMap.get(word.toLowerCase());
      myMap.put(word,count==null?1:count+1);
    }
    return myMap;
  }

  public static String top10MostCommonWords(String input){
    return "";
  }
}
