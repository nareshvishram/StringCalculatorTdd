package com.stringcalculator.tdd;

public class StringCalculator {

	private String pattern=",|\n";
	public int add(String string) {
		if(string.length()==0)
			return 0;
		String str[]=string.split(pattern);
		return getSum(str);
	}
	private int getSum(String[] str) {
		int sum=0;
		for(String s:str){
			if(s.length()==0)
				continue;
			sum+=stringToInt(s);
		}
		return sum;
	}
	public int stringToInt(String string){
		int num= Integer.parseInt(string);
		if(num<0)
			throw new IllegalArgumentException("Negatives Not Allowed") ;
		else
			return num;
	}

}
