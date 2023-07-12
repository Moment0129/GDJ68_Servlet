package com.iu.main.api.lang.wrapper;

import java.util.Scanner;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;

public class WrapperStudy {
	
	public void s1() {
		BankBookDAO bankBookDAO = new BankBookDAO();

		String str = "청약저축-5.2-1";
		
		String [] datas = str.split("-");
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName(datas[0]);      
		bankBookDTO.setBookRate(Double.parseDouble(datas[1]));
		bankBookDTO.setBookSale(Integer.parseInt(datas[2])); 
			
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		// 1.남녀구분
		// 2.나이
		// 3. 3-5:봄, 6-8:여름, 9-11:가을, 12-2:겨울
		
		String jumin = sc.nextLine();
		
		// 1.남녀구분
		String s = jumin.substring(7, 8);
		
//		 
		
		if(s.equals("1") || s.equals("3")) {
			System.out.println("남자");
		} else if(s.equals("2") || s.equals("4")) {
			System.out.println("여자");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		// 2.나이
//		String year = jumin.substring(0, 2)
//		int age = 0;
//		
//		if(s=="1" || s=="2") {
//			age = 1900 + Integer.parseInt(year);
//		} else if(s=="3" || s=="4") {
//			age = 2000 + Integer.parseInt(year);
//		}
//		
//		System.out.println("나이 : " + (2023-age));
		
		

		
		
		// 3. 계절
		//  3-5:봄, 6-8:여름, 9-11:가을, 12-2:겨울
		String month = jumin.substring(2, 4);
		
//		if(month.equals("03") || month.equals("04") || month.equals("05")) {
//			System.out.println("봄");
//		} else if(month.equals("06") || month.equals("07") || month.equals("08")) {
//			System.out.println("여름");
//		} else if(month.equals("09") || month.equals("10") || month.equals("11")) {
//			System.out.println("가을");
//		} else if(month.equals("12") || month.equals("01") || month.equals("02")) {
//			System.out.println("겨울");
//		}
		
		int m = Integer.parseInt(month);
		
		if(m>=3 && m<=8) {
			System.out.println("봄");
		} else if(m>=6 && m<=8) {
			System.out.println("여름");
		} else if(m>=9 && m<=11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
	}
	
	public void ex2() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주민 번호 입력");
//		
//		String jumin = "951226-1234567";
//		
//		for(int i=0; i<jumin.length()-1; i++) {
//			System.out.println(jumin.charAt(i));
//			String d = jumin.substring(i, i+1);
//				if(d.equals("-")){
//					continue;
//			
//			
//			for (int i=0; i<jumin.length()-1; i++)
//			System.out.println(jumin.charAt(i))
//	
//		// toCharArray()
//		// 문자열을 char타입 문자배열로 만들어준다.
//		char [] jumins = jumin.toCharArray();
//		for(int i=0; i<jumins.length; i++) {
//			
//		}
//		}
//		
//		
//		
//		String jumin1 = jumin.substring(0, 6);
//		String jumin2 = jumin.substring(7, 13);
//		
//		String [] jumins = new String [13];
//
//		for(int i=0; i<=13; i++) {
//			
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin="951226-1234567";
		int num=2;
		int sum=0;
		for(int i=0;i<jumin.length()-1;i++) {
			char ch = jumin.charAt(i);
			
			if(ch=='-') {
				continue;
			}

			if(num>9) {
				num=2;
			}

			System.out.println(ch*2);//18:114

			sum=sum+Integer.parseInt(String.valueOf(ch))*num;
			num++;
			System.out.println("Sum :"+sum);


//			String d = jumin.substring(i, i+1);
//			if(d.equals("-")) {
//				continue;
//			}

		}

		sum=sum%11;

		if(sum>9) {
			sum=sum%10;
		}

		int check=Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		if(sum==check) {
			System.out.println("올바른 번호");
		}else {
			System.out.println("잘못된 번호");
		}


//		char [] jumins=jumin.toCharArray();
//		for(int i=0;i<jumins.length;i++) {
//			System.out.println(jumins[i]);
//		}
		
		
	}
}
