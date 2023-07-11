package com.iu.main.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {	// 도구들을 모아놓는 클래스
	
	public static Connection getConnection() throws Exception {
		// static을 붙임으로서 객체생성없이 모든 클래스가 getConnector를 사용할 수 있다.
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@54.180.144.148:1521:xe";
		//								      ec2 public IP:SID
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		
		// 1.드라이버를 메모리에 로딩하는 작업
		Class.forName(driver);
		// 오류가 뜰 수도 있어서 메서드 선언부에 throws Exception을 써서
		// 예외처리를 해준다.
		
		// 2.DB 연결
		Connection con = DriverManager.getConnection(url, user, password); 
		// Connection은 Interface라서 객체를 선언할 수 없다.
		// DriverManager 클래스의 getConnection 클래스 메소드
		
		System.out.println(con);
		
		// ignore에 등록
		
		return con;
	}
}
