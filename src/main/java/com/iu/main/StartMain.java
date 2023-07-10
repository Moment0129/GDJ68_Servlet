package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.bankBook.BankBookInput;
import com.iu.main.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		
//		System.out.println("Start Main");
		
		try {	// try {에러가 발생할 수도 있는 코드}
			// 실행, Test
			BankBookDAO bankBookDAO = new BankBookDAO();
			BankBookInput bankBookInput = new BankBookInput();
			
			BankBookDTO bankBookDTO = bankBookInput.bankBookAdd();
			
//			BankBookDTO bankBookDTO = new BankBookDTO();
//			bankBookDTO.setBookName("자유입출금");
//			bankBookDTO.setBookRate(5.9);
//			bankBookDTO.setBookSale(1);
			
			// 참조변수명.멤버들 (참조변수 - 객체의 주소를 담고있는 변수)
			int result = bankBookDAO.bankBookAdd(bankBookDTO);
			
			if(result>=1) {
				System.out.println("INSERT 성공");
			} else {
				System.out.println("INSERT 실패");
			}
			
//			DBConnector db = new DBConnector();
//			db.getConnection();			
		} catch (Exception e) {	// catch {에러발생 시 실행할 예외코드}
			e.printStackTrace();
		}
		
	}

}
