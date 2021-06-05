
package javaproject;

import java.io.*;
import java.sql.*;



public class Remove {
    public void delection(){
        DataInputStream ds=new DataInputStream(System.in);
        try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858")) {
                System.out.println("Enter the name of the product");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " delete from products where pname='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("deleted successfully");
                }
                else
                {
                    System.out.println("couldn't delete");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
    }
    
}
