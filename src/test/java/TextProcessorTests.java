import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextProcessorTests {

    @Test
    public void numberOfWordsInText_Expected21Words() {
        String input = "Hello, this is an example for you to practice. You should grab this text and use it as your test case.";
        long expectedOutput = TextProcessor.countNumberOfWord(input);
        Assertions.assertEquals(expectedOutput, 21);
    }

    @Test
    public void mapCounter_Expected10WordsWithCountedEncounters() {
        String input = "Hello, this is an example for you to practice. You should grab this text and use it as your test case.";
        HashMap<String, Integer> actualOutput = TextProcessor.textToHash(input);
        HashMap<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("you",2);
        expectedOutput.put("this",2);
        expectedOutput.put("your",2);
        expectedOutput.put("to",2);
        expectedOutput.put("text",2);
        expectedOutput.put("test",2);
        expectedOutput.put("should",2);
        expectedOutput.put("practice",2);
        expectedOutput.put("use",2);
        expectedOutput.put("it",2);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void Given_Preconditions_When_StateUnderTest_Then_ExpectedBehavior() {
        String input = "Hello, this is an example for you to practice. You should grab this text and use it as your test case.";
        String expectedOutput = "The top 10 words used include:\n"
            + "\n"
            + "1. you\n"
            + "2. this\n"
            + "3. your\n"
            + "4. to\n"
            + "5. text\n"
            + "6. test\n"
            + "7. should\n"
            + "8. practice\n"
            + "9. use\n"
            + "10. it\n"
            + "\n"
            + "The text has 21 words in total";
        String actualOutput = "The top 10 words used include:\n"
            + "\n"
            + "1. you\n"
            + "2. this\n"
            + "3. your\n"
            + "4. to\n"
            + "5. text\n"
            + "6. test\n"
            + "7. should\n"
            + "8. practice\n"
            + "9. use\n"
            + "10. it\n"
            + "\n"
            + "The text has 21 words in total";
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
