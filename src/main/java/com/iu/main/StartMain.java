package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		
//		System.out.println("Start Main");
		
		try {
			// 실행, Test
			BankBookDAO bankBookDAO = new BankBookDAO();
			// 참조변수명.멤버들 (참조변수 - 객체의 주소를 담고있는 변수)
			bankBookDAO.bankBookAdd();
			
			DBConnector db = new DBConnector();
			db.getConnection();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
