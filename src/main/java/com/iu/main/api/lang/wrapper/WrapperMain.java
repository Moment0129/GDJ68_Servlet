package com.iu.main.api.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		
//		Integer in = new Integer(3);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		// valueOf()
		// 문자열같은 다른 타입을 primitive type으로 바꿀 수 있다. 
		int num = 10;
		Integer num2 = new Integer(num);
		num = num2.intValue();
		
		num2 = new Integer("32");
		num = num2.intValue();
		
		// AutoBoxing
		// primitive type => reference type
		num2 = num;	//
		
		// AutoUnBoxing
		// reference type => primitive type
		num = num2;
		
		
		Long l1 = 10L; // AutoBoxing
//		// l1 = num; // 둘의 타입이 다르기 때문에 불가능.
//		// l1 = (long)num;
		
		String n = "20";
		num = Integer.valueOf(n);
		num = Integer.parseInt(n);
		System.out.println(num*3);
		
		// valueOf() 와 parseInt() 의 차이
		// return값을 primitive type으로 주는지,
		// reference type 주는지의 차이
		
		WrapperStudy wrapperStudy = new WrapperStudy();
//		wrapperStudy.ex1();
		wrapperStudy.ex2();

	}

}
