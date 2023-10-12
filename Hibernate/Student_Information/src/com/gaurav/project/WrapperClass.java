package com.gaurav.project;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intObj1 = new Integer(15);
		Integer intObj2 = new Integer("15");
		System.out.println(intObj1);
		System.out.println(intObj2);
		
		float flt = 50f;
		System.out.println("Float variable f value is:" + flt);
		
		double c = 20.20;
		Double cObj1 = new Double(c);
		System.out.println(cObj1);
		Double cObj3 = new Double("45.48");
		System.out.println(cObj3);

	}

}
