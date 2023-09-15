package com.devopshint.StringPalindrome;
public class App {

	public boolean isPalindrome(String input) {
                 
		if (input == null) {
			throw new IllegalArgumentException("input shouldn't be null");
		}
		int len=reverselen(input);
		

		if (input.equals(reverse(input)) && len>0) {
			return true;
		} else {
			return false;
		}
		
	}

	private String reverse_reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}
       private int reverselen(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return input.length();
	}

	private String reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}

}
