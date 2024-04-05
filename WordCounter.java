package tools;

import java.util.Scanner;

public class WordCounter {
	public static int countWords(String paragraph ){
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }

        String[] words = paragraph.split("\\s+");
        return words.length;
    }
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Write the paragraph here");
		String paragraph=sc.nextLine();
		System.out.println(countWords(paragraph));
		
	}
}


