package com.iu.main.bankBook;

import java.util.Scanner;

public class BankBookInput {
	
	private Scanner sc;
	
	public BankBookInput() {
		this.sc = new Scanner(System.in);
	}
	
	public BankBookDTO bankBookAdd() {
		// 입력받은 데이터를 bankBookDTO에 보내는 역할.
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		System.out.println("상품명을 입력하세요.");
		bankBookDTO.setBookName(sc.next());;
		
		System.out.println("이자율을 입력하세요.");
		bankBookDTO.setBookRate(sc.nextDouble());
		
		System.out.println("판매여부 입력하세요.");
		bankBookDTO.setBookSale(sc.nextInt());
		
		// 입력받은 데이터를 하나하나 보내는 것은 번거롭기 때문에
		// bankBookDTO에 한번에 담아서 보냄!!
		return bankBookDTO;
		
	}
	
}
