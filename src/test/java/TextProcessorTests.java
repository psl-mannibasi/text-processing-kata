import org.junit.jupiter.api.Test;

public class TextProcessorTests {
    @Test
    public void Given_Preconditions_When_StateUnderTest_Then_ExpectedBehavior() {

        String result = TextProcessor.textProcessing("Hello, this is an example for you to practice. You should grab this text and use it as your test case.");

        System.out.println(result);
    }
}
