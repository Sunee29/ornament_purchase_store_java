
package javaproject;
import java.io.*;
import java.sql.*;

public class Update {
    
    public void Updation() throws IOException{
        int w=0;
         DataInputStream ds=new DataInputStream(System.in);
                 do{
                     System.out.println("What do you want to update :\n1.ProductID\n2.Product name\n3.Price\n4.Quantity\n5.Quit");
                 w=Integer.parseInt(ds.readLine());
                 switch(w){
                     case 1:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858")) {
                System.out.println("Updated ProductID");
                int id=Integer.parseInt(ds.readLine());
                
                System.out.println("Enter the name of the product");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update products set id ='"+id+"'where pname='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 2:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858")) {
                System.out.println("Enter the ID of the ornament");
                int id=Integer.parseInt(ds.readLine());
                System.out.println("updated Product Name");
                String dbname=ds.readLine();
                
            
                
                Statement stmt=con.createStatement();
                String q1=
                       " update products set pname ='"+dbname+"' where id='"+id+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                     break;
                     
                     case 3:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858")) {
                System.out.println("updated Price");
                float p=Float.parseFloat(ds.readLine());
                
                System.out.println("Enter the name of the product");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update products set price ='"+p+"'where pname='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 4:
                         try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","6303158858")) {
                System.out.println("updated Quantity");
                int Qt=Integer.parseInt(ds.readLine());
                
                System.out.println("Enter the name of the product");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update products set qty='"+Qt+"'where pname='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;                
                         
                 }
                 }while(w!=5);
                    
    }
    
}
