
package javaproject;

import java.io.*;
import java.sql.*;
import java.util.*;


public class Insert {
    public void insertion() throws IOException{
    DataInputStream ds=new DataInputStream(System.in);
    System.out.println("Product id :");
                        String id=ds.readLine();
                        System.out.println("Enter product name:");
                        String pname=ds.readLine();
                       
                        System.out.println("Enter price:");
                        float price=Float.parseFloat(ds.readLine());
                        System.out.println("Enter quantity:");
                        int Qty=Integer.parseInt(ds.readLine());
                    try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858")) {
                Statement stmt=con.createStatement();
                String q1=
                        "insert into products values('"+id+"','"+pname+"','"+price+"','"+Qty+"')";
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Insert success");
                }
                else
                {
                    System.out.println("Insert unsuccess");
}           }
}
catch(  ClassNotFoundException | SQLException e)
{
System.out.println(e);
}
    }
}
