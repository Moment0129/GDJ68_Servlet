package com.iu.main.api.util.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		// ArrayList
		// 배열기반 => 인덱스 번호로 접근한다
		// 배열보다 좋은 점 => 몇 개를 넣어도 상관없다.
		ArrayList ar = new ArrayList();
		
		// add()의 괄호 안에는 object 타입만 넣을 수 있는데,
		// 지금 다양한 타입으로 자동으로 AutoBoxing된 것이다. 
		ar.add(1);
		ar.add(3.1);
		ar.add("test");
//		ar.add(1, "add"); // 1번 index 자리에 "add"를 끼워넣어라.
//		ar.set(0, "first");	// 0번 index 자리에 있는 값을 "first"로 수정하라.
//		ar.remove(0);	// 0번 index를 삭제
//		ar.remove("3"); // 이 방법도 가능은 하지만 index번호로 지우는 것이 더 정확하다.
//		ar.clear(); // 해당 ArrayList 안에 있는 모든 element를 삭제
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}		
		
		
		// 다형성 / AutoUnboxing 두 개의 개념이 모두 있다.
		int num = (Integer)ar.get(0);
		
	
		
		
		// HashSet
		// 중복이 허용되지 않는다. 

		
//		LinkedList ar2 = new LinkedList();
//		ar.add("1");
//		ar.remove(0);
//		ar.clear();
//		ar.get(0);
		
		
		ListStudy listStudy = new ListStudy();
		listStudy.ex1();
		
	}	
}
