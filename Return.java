
package javaproject;

import java.io.*;
import java.sql.*;
public class Return {
    public void ret() throws IOException{
        DataInputStream ds=new DataInputStream(System.in);
        try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858");
                    System.out.println("Enter the name of the product  you want to return: ");
                String pn=ds.readLine();
                System.out.println("Enter the number of quantity you want to return:");
                int rc=Integer.parseInt(ds.readLine());
                    Statement stmt1 = con.createStatement();
                    Statement stmt = con.createStatement();
                    String q1 ="select * from products where pname='"+pn+"'";
                    ResultSet rs1=stmt.executeQuery(q1);
                    if(rs1.next()){
                        int z=rs1.getInt("qty")+rc;
                    String q2 =" update products set qty ='"+z+"'where pname='"+pn+"'";
                    int rs=stmt1.executeUpdate(q2);
                    if(rs>0){
                        
                     System.out.println("Product returned successfully");
                    }else{
                        System.out.println("Product return unsuccessful");
                    }
                     
                }
                }
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
    }
}
