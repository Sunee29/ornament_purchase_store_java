
package javaproject;

import java.io.*;
import java.sql.*;
public class Display {
    public void Disp() throws IOException{
       
        
                 try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858");
                    Statement stmt = con.createStatement();
                    
                      
                    
                    for(int f=1;f<100;f++){
                    String q1 = "select * from products where id='"+f+"'";
                    ResultSet x = stmt.executeQuery(q1);
                    if(x.next()){
                        
                        System.out.println("Product ID    : " + x.getInt("id"));
                        System.out.println("Product Name  : " + x.getString("pname"));
                        
                        System.out.println("Price      : " + x.getFloat("price"));
                        System.out.println("Quantity     : " + x.getInt("qty"));
                                          
                    }
                    
                    }
                }
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
        
    }
    
    }

