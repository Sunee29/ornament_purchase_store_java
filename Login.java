
package javaproject;

import java.io.*;
import java.sql.*;

public class Login {
      public static int login() throws IOException {
            DataInputStream ds=new DataInputStream(System.in);
     
     System.out.println("-----------------");
      System.out.println("Username :");
      String username= ds.readLine();
      System.out.println("Password :");
      String password=ds.readLine();
     
     
     try{
  
         Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858")){
              
         Statement stmt=con.createStatement();
         String q1=" select * from login ";
        ResultSet rs=stmt.executeQuery(q1);
        
       while(rs.next()){
         
        if(username.equals(rs.getString(1)) ){
            if(password.equals(rs.getString(2))){
                
             System.out.println("Login success");
             System.out.println("-----------------");
               return 1;
            
            }
            
          }
        System.out.println("-----------------");
       }
        
            }
     
     }catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
     }
          return 0;
 }
}
