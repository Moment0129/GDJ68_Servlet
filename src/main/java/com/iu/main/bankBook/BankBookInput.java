package com.iu.main.bankBook;

import java.util.Scanner;

public class BankBookInput {
	
	private Scanner sc;
	
	public BankBookInput() {
		this.sc = new Scanner(System.in);
	}
	
	BankBookDTO bankBookDTO = new BankBookDTO();
	BankBookDAO bankBookDAO = new BankBookDAO();
	
	// 상품 이름으로 조회
	public BankBookDTO bankBookSearch() throws Exception {
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		System.out.println("조회하실 상품의 이름을 입력해주세요.");
		bankBookDTO.setBookName(sc.next());
			
		return bankBookDTO;
	}
	
	// 상품 조회
	public BankBookDTO bankBookDetail() throws Exception {
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		System.out.println("조회하실 상품의 번호를 입력해주세요.");
		bankBookDTO.setBookNum(sc.nextInt());
		
		
		return bankBookDTO;
	}
	
	// 상품 추가
	public BankBookDTO bankBookAdd() throws Exception {
		// 입력받은 데이터를 bankBookDTO에 보내는 역할.
		
		
		System.out.println("상품명을 입력하세요.");
		bankBookDTO.setBookName(sc.next());;
		
		System.out.println("이자율을 입력하세요.");
		bankBookDTO.setBookRate(sc.nextDouble());
		
		System.out.println("판매여부 입력하세요.");
		bankBookDTO.setBookSale(sc.nextInt());
		
		// 입력받은 데이터를 하나하나 보내는 것은 번거롭기 때문에
		// bankBookDTO에 한번에 담아서 보냄!!
		
		bankBookDAO.bankBookAdd(bankBookDTO);
		
		
		return bankBookDTO;
		
	}
	
	// 상품 삭제
	public BankBookDTO bankBookDelete() throws Exception {
		

		System.out.println("삭제할 상품의 번호를 입력해주세요.");
		bankBookDTO.setBookNum(sc.nextInt());
		
		bankBookDAO.bankBookDelete(bankBookDTO);
		
		return bankBookDTO;
	}
	
}
