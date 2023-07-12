package com.iu.main.api.util.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListStudy {
	
	public void s1() {
		
		// 다형성 / AutoUnboxing 두 개의 개념이 모두 있다.
//		int num = (Integer)ar.get(0);
		
		// ▲ 또한 ArrayList 안에 Integer타입만 있을거라는 보장이 없기 때문에
		//   다른 타입으로 한 번 감싸주었어야 하는것이다.
		//   하지만 아래의 Generic을 써준다면 아예 Integer타입만 나오도록 할 수
		// ▼ 있기 때문에 오토언박싱 필요X
			
		// <> : Generic
		// E : Element : 변수 
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(2);
		
		int num = ar.get(0);
	}
	

	public void ex1() { 
		Random random = new Random();
		HashSet hs = new HashSet();
		
//		// for문으로 하는 방법
//		for(int i=0; i>-1; i++) {
//			hs.add(random.nextInt(44)+1);
//			if(hs.size()==6) {
//				break;
//			}
//		}
		
		while(hs.size()!=6) {
			hs.add(random.nextInt(44)+1);
		}
		
		System.out.println(hs);
	}
}
