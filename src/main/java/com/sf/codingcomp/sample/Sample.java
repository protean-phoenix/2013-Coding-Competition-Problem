package com.sf.codingcomp.sample;

import java.util.regex.Pattern;

/**
 * A simple example class
 */
public class Sample {
	public boolean isBlank(String stringToTest) {
		if(Pattern.matches("\\s+",stringToTest)||stringToTest == "") {
			return true;
		}
		return false;
	}

	public boolean isAlpha(String stringToTest) {
		return(Pattern.matches("[a-zA-Z]+", stringToTest));
	}
}
