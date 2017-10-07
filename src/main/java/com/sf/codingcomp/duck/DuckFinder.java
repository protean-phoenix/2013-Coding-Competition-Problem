package com.sf.codingcomp.duck;

import java.lang.reflect.Method;

public class DuckFinder {

	public static <T> boolean isADuck(T objectToCheck) {
		
		Class clazz = objectToCheck.getClass();
		try {
			//used looksLikeADuck instead of walksLikeADuck to match JUnit
			Method method1 = clazz.getMethod("looksLikeADuck", null); 
			Method method2 = clazz.getMethod("quacksLikeADuck", null);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}

}
