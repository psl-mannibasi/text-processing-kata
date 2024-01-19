import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class TextProcessorTests {

  @Test
  public void Given_Preconditions_When_StateUnderTest_Then_ExpectedBehavior() {
    TextProcessor textProcessor = new TextProcessor();

    // arrange
    String text = "Hello Hello";
    HashMap<String, Integer> expectedTop10 = new HashMap<>();
    expectedTop10.put("Hello", 2);

    // act
    HashMap<String, Integer> actualTop10 = textProcessor.countTop10Words(text);

    // assert
    assertTrue(expectedTop10.equals(actualTop10));
  }
}
