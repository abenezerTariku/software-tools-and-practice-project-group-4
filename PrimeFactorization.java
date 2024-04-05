package tools;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public static List<Integer> 
    
    calculatePrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number = number / i;
            }
        }
        
        if (number > 1) {
            primeFactors.add(number);
        }
        
        return primeFactors;
    }
    
    public static void main(String[] args) {
    	System.out.println(calculatePrimeFactors(78));
    	
    }
}



