package com.iu.main.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.main.util.DBConnector;

public class BankBookDAO {
	
	// 상품 N개 조회
	// bankBookSearch
	public ArrayList<BankBookDTO> bankBookSearch() throws Exception {
		
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
				
		// 1.DB 연결
		Connection con = DBConnector.getConnection();
				
		// 2.쿼리문 작성
		String sql = "SELECT * FROM BACKBOOK WHERE BOOKNAME LIKE ? ORDER BY BOOKNUM DESC";
			
		// 3.쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		// 4. ?세팅
		st.setString (1, "%"+ rs.next() +"%");
		
		// 5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNum(rs.getInt("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
			ar.add(bankBookDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
		
		
	}
	
	// 상품 N개 조회
	public ArrayList<BankBookDTO> bankBookList() throws Exception {
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
				
		// 1.DB 연결
		Connection con = DBConnector.getConnection();
				
		// 2.쿼리문 작성
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM DESC";
			
		// 3.쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		// 4. ?세팅
		
		// 5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			
			bankBookDTO.setBookNum(rs.getInt("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
			ar.add(bankBookDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
	}
	
	// 상품 1개 조회
	public BankBookDTO bankBookDetail(BankBookDTO bankBookDTO) throws Exception {
		// 1.DB 연결
		Connection con = DBConnector.getConnection();
		
		// 2.쿼리문 작성
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUM = ?";
		
		// 3.쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		// 4.?값 셋팅
		st.setInt(1, bankBookDTO.getBookNum());
		
		// 5.최종 전송 및 결과처리 
		ResultSet rs = st.executeQuery();
		// cursor 한줄읽기 -> rs.next() : "한 줄 읽고오세요"
//		BankBookDTO bankBookDTO2 = null;
		// ▲ 이렇게 선언해서 사용하거나 매개변수에 있는거 가져와서 ▼ 밑에서 사용
		if(rs.next()) {
			// return은 한개밖에 못하기 때문에 bankBookDTO에 담아준다.
			bankBookDTO.setBookNum(rs.getInt("BOOKNUM"));
			bankBookDTO.setBookName(rs.getString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
		} else {
			// bankBookDTO가 null이면 조회된 것이 없다는 뜻
			bankBookDTO = null;
		}
		
		return bankBookDTO;
		
		
	}
	
	// insert
	// backBookAdd 추가 메소드
	public int bankBookAdd(BankBookDTO bankBookDTO) throws Exception {
		
		
		// 1.DB 연결
		Connection con = DBConnector.getConnection();
		
		// 2.쿼리문 작성
		String sql = "INSERT INTO BANKBOOK VALUES (BANK_SEQ.NEXTVAL,?,?,?)";
		
		// 3.쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		// 4.?값 셋팅
		st.setString(1, bankBookDTO.getBookName());
		st.setDouble(2, bankBookDTO.getBookRate());
		st.setInt(3, bankBookDTO.getBookSale());
		
		// 5.최종 전송 및 결과 처리
		int result = st.executeUpdate();
		System.out.println("DB에 Insert");
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
	
	// 삭제 메소드 
	public int bankBookDelete(BankBookDTO bankBookDTO) throws Exception{
		// 1.DB 연동
		Connection con = DBConnector.getConnection();

		// 2.쿼리문 작성
		String sql = "DELETE BANKBOOK WHERE BOOKNUM = ?";
				
		// 3.쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
				
		// 4.?값 셋팅
		st.setInt(1, bankBookDTO.getBookNum());
		
		// 5.최종 전송 및 결과처리 
		int result = st.executeUpdate();
		System.out.println("Db Delete");
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
}
