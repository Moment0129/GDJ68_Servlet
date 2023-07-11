package com.iu.main.api.lang;

public class LangMain {

	public static void main(String[] args) {
		
		// 모든 클래스는 Object 타입이다.
		Object obj = new Test();
		obj = new ChildTest();
		
		obj = new Object();
		Object obj2 = new Object();
		
		// 주소비교
		System.out.println(obj == obj2);
		
		// 이 또한 주소비교
		// false가 나온다.
		System.out.println(obj.equals(obj2));
		Test test = new Test();
		
		// 참조변수를 출력하면
		// 내부에서 toString을 호출한다. 
		System.out.println(obj);
		System.out.println(obj.toString());
		
		System.out.println(test.toString());
		System.out.println(test);

	}

}
