/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ajocme_sd2082
 */
public class SQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        
        for (int i = 0; i < 1001; i++) {
            try {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kitty", "root", "");
                stmt = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
                String sql = "INSERT INTO `sql_test`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + (i) + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";

                stmt.executeUpdate(sql);
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error!");

            }
        }
        DateTimeFormatter falala = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime later = LocalDateTime.now();
        System.out.println(falala.format(later));
    }
    
}
