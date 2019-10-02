///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package DB_MYSQL;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
///**
// *
// * @author ajocme_sd2082
// */
//public class CRUD {
//    public boolean add(String sqlString)
//    try
//        {  
//            Class.forName("com.mysql.jdbc.Driver");  
//            Connection con=DriverManager.getConnection(  
//            "jdbc:mysql://localhost:3306/kt","root","");  
//            //here sonoo is database name, root is username and password  
//            String sqlString =con.createStatement();  
////            ResultSet rs=stmt.executeQuery("select * from emp");  
////            while(rs.next())  
////            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//              con.close();  
//        }
//        catch(Exception e)
//        { 
//            System.out.println(e);} 
//        // TODO code application logic here
//    }
//}
