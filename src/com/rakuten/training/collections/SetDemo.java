package com.rakuten.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

//		Set<String> uniqueWords = new LinkedHashSet<>();
		Set<String> uniqueWords = new TreeSet<>();
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a word (or quit): ");
			String aWord = kb.nextLine();
			if(aWord.equalsIgnoreCase("quit")) {
				break;
			}
			if(!uniqueWords.add(aWord)) {
				System.out.println("Duplicate detected!!");
			}
			
			
		}
		
		System.out.println("__________________ ALL WORDS _________________");
		for(String s:uniqueWords) {
			System.out.println(s);
		}
		

	}

}
