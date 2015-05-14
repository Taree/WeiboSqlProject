package com.baifendian.taree;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Operate {
    public static void main(String[] args) {
    	  //连接MySql数据库，用户名和密码都是root   
        String url = "jdbc:mysql://localhost:3306/test" ;    
        String username = "root" ;   
        String password = "root" ;  
        Connection con;
        try{   
            con =DriverManager.getConnection(url,username,password) ; 
            Statement stmt = con.createStatement() ;
//            PreparedStatement pstmt = con.prepareStatement(sql) ;   
//            CallableStatement cstmt =    
//                                 con.prepareCall("{CALL demoSp(? , ?)}") ;   
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM ...") ;   
            int rows = stmt.executeUpdate("INSERT INTO ...") ;   
//            boolean flag = stmt.execute(String sql) ;   
        }catch(SQLException se){   
       System.out.println("数据库连接失败！");   
       se.printStackTrace() ;   
        }   
        
	}
}
