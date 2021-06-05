
package javaproject;
import java.io.*;
import java.sql.*;
public class Purchase {
    public void Buy() throws IOException{
        float total=0;
        int j=0, m=0;
        DataInputStream ds=new DataInputStream(System.in);
        System.out.println("would you like to: \n1.Display products in database\n2.exit ");
                  int b=Integer.parseInt(ds.readLine());
                    switch(b){
                        case 1:try {
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
                    do{
                    System.out.println("Enter the name of the product you want to purchase :");
                    String pname=ds.readLine();
                    System.out.println("Required Quantity :");
                    int cp=Integer.parseInt(ds.readLine());
                    Statement stmt1 = con.createStatement();
                    String q2 ="select * from products where pname='"+pname+"'";
                    ResultSet rs = stmt.executeQuery(q2);
                    if(rs.next()){
                        if(cp<=rs.getInt("qty")){
                            m=rs.getInt("qty")-cp;
                            float z=rs.getFloat("Price")*cp;
                            total=total+z;
                            
                          
                        
                        System.out.println("Would you like to purchase more Quantity :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            System.out.println("---------------------------------------");   
                            System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------");  
                            total=0;
                            String q=" update products set qty='"+m+"'where pname='"+pname+"'";
                        
                            int x=stmt.executeUpdate(q);
                        }
                        
                    }
                     }}while(j!=2);
                        }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                        break;
                       
                                }
    } 
}
                            
                    
    
    

