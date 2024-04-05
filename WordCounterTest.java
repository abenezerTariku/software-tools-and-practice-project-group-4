package tools;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {
  
    @SuppressWarnings("static-access")
	@ParameterizedTest
    @CsvSource({
    	"This is a simple paragraph , 5",
            "This is another paragraph with more words ,7",
            //empty paragraph
            "  ,0"
    })
    public void testCountWords(String paragraph,int count  ) {
        WordCounter wordCounter = new WordCounter();
        assertEquals(count,wordCounter.countWords(paragraph));

        
    }
}
