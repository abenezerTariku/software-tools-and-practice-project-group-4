package tools;


import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorizationTest {

    @Test
    public void testCalculatePrimeFactors() {
        List<Integer> expectedFactors = List.of(2, 2, 2, 3, 7);
        List<Integer> actualFactors = PrimeFactorization.calculatePrimeFactors(168);
        
        assertEquals(expectedFactors, actualFactors);
    }
}
