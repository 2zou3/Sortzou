package com.java1234.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static String dburl="jdbc:mysql:///111test?useSSL=false&serverTimezone=UTC&user=root&password=1234";
    private static String dbuser = "root";
    private static String dbpassword = "1234";
    private static String driver = "com.mysql.jdbc.Driver";
    /*
     * ��ȡ���ݿ�����
     */
    public static Connection getCon() throws Exception{
    	Class.forName(driver);
    	Connection con = DriverManager.getConnection(dburl,dbuser,dbpassword);
		return con;
    }
   /*
     * �ر����ݿ�����
     */
   public void closeCon(Connection con) throws Exception{
    	if(con != null) {
    		con.close();
    	}
   }
   }
  
   /*
    public static void main(String[] args) {
    	DbUtil dbUtil = new DbUtil();
    	try {
    		dbUtil.getCon();
    		System.out.println("���ݿ����ӳɹ���");
    	}catch (Exception e) {
    		e.printStackTrace();
    		System.out.println("���ݿ�����ʧ��");
    	}
    }
}
    */