package com.iu.main.api.lang.string;

import java.util.Scanner;

public class StringStudy {
	
	private Scanner sc;
	
	public StringStudy() {
		sc = new Scanner(System.in);
	}
	
	public void s1() {
		// 문자열
		// length()
		// indexOf()
		// lastIndexOf()
		String str = "Hello World";

		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		
		// int ch(char)
		// str에서 괄호 안의 문자가 몇번째에 있는지 출력
		// 없으면 -1이 출력된다.
		// '', "" 둘 다 가능
		int ch = str.indexOf("W"); 
		System.out.println("Ch : " + ch);
		
		// = 네번째부터 'H'가 있는지 찾아보아라
		ch = str.indexOf('H', 4);
		
		
		str = "iu.winter.suji.jpg";
		str.indexOf(".");	// 앞에서부터 몇번째인지 구하기	  ▼
		str.lastIndexOf(".");	// 뒤에서부터 몇번째인지 구하기 ▲
	}
	
	public void s2() {
		// is로 시작하는 메서드 => '~가 맞는가' 묻는 메서드
		// isEmpty() => 비어있는지 물어보는 메서드.
		// is로 시작하는 메서드들은 boolean으로 값을 받는다. (true of false)
		
		
		String data = "서울-비-대구-눈-광주-맑음-부산-우박-제주-안개";
		String [] datas = data.split("-");
		
		for(int i=0; i<datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		/*-----------------------------------------------------*/
		
		String data2 = "서울 비 대구 눈 광주 맑음,부산,우박,제주,안개";
		String [] datas2 = data2.split(" ");
		
		for(int i=0; i<datas2.length; i++) {
			System.out.println(datas2[i]);
		}
		
		/*-----------------------------------------------------*/
		// ▼▼▼▼▼▼
		// 위처럼 데이터가 하나의 문자열로 묶여있을 때 여러 종류의특정 구분 기호들을
		// 한 종류로 통일시키고 싶을때 => replace()
		
		String data3 = "서울 비 대구 눈-광주 맑음,부산,우박,제주,안개";
		
		// 수정 이전의 데이터는 필요없으니 덮어쓰기
		data3 = data3.replace(" ", ",");
		data3 = data3.replace("-", ",");
		
		
		// 구분 기호들을 콤마로 통일시켰으면 이제 콤마를 제외하고 나머지
		// 문자열들을 나눈 후에 배열로 묶어주기!
		// => 파싱, 전처리 => spilt()
		String [] datas3 = data.split(",");
		
	}
	
	public void s3() {
		String str = "iu.suji.winter.jpg";
		
		// begin 이상 end 미만까지 문자열 자르기.
		// end를 쓰지 않으면 끝은 잘리지 않고 그대로 나온다.
		str = str.substring(str.lastIndexOf(".")+1);
		System.out.println(str);
		
		str = String.valueOf(2);
		System.out.println(str);
	}
	
	public String ex1() {
		// 파일명.확장자		예)abc.gif
		// 확장자가 jpg면 이미지파일 출력
		// 확장자가 doc면 문서파일 출력
		// 확장자가 mp3면 오디오파일 출력
		// 그외		  알수없는 파일 형식 출력
		
		System.out.println("입력해주세요.");
		String file = sc.next();
		file = file.substring(file.lastIndexOf(".")+1);
		
		System.out.println("File : " + file);
		
		if(file.equals("jpg")) {
			System.out.println("이미지파일");
		} else if(file.equals("doc")) {
			System.out.println("문서파일");
		} else if(file.equals("mp3")) {
			System.out.println("오디오파일");
		} else {
			System.out.println("알 수 없는 파일형식");
		}
		
		return file;
		
	}
	
	public void ex2(String file) {
		// 파일명.확장자		예)abc.gif
		// 확장자가 jpg,jpeg,png,gif면 이미지파일 출력
		// 확장자가 doc,txt,hwp면 문서파일 출력
		// 확장자가 mp3,wav,midi,pcm이면 오디오파일 출력
		// 그외 알수없는 파일 형식 출력
		// return;
		
		this.ex1();
		
		
		String [] files1 = {"jpg","jpeg","png","gif"}; 
		String [] files2 = {"doc","txt","hwp"};
		String [] files3 = {"mp3","wav","midi","pcm"};

		

			for(int i=0; i<files1.length; i++) {
				if(file.equals(files1[i])) {
					System.out.println("이미지파일");
				}
			}
			
			for(int i=0; i<files2.length; i++) {
				if(file.equals(files2[i])) {
					System.out.println("문서파일");
				}
			}
			
			for(int i=0; i<files3.length; i++) {
				if(file.equals(files3[i])) {
					System.out.println("오디오파일");
				}
			}
			

	}
	
}
