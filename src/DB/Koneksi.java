/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Agung
 */
public class Koneksi {
     private static Connection con;
    public Koneksi(){
    }
    public static Connection getConnection(){
         try{
    con=DriverManager.getConnection("jdbc:mysql://localhost/datainformationdb","root","");
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Gagal Koneksi");
    }
return con;
  }
}
