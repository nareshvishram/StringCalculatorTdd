package com.stringcalculator.tdd;

public class StringCalculator {

	public int add(String string) {
		if(string.length()==0)
			return 0;
		return stringToInt(string);
	}
	public int stringToInt(String string){
		return  Integer.parseInt(string);
	}

}
