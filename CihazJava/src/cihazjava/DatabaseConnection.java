/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cihazjava;
import java.sql.*;

/**
 *
 * @author Melike Göncü
 */
public class DatabaseConnection {
    
       public static DatabaseConnection data;
    
    public static DatabaseConnection DatabaseOl()
    {
        if(data==null)
            data=new DatabaseConnection();
        return data;
    }
    
    
    private boolean dbCon(String Isim,String Sifre)
    {
        boolean x=false;
        Connection connection =null;
        try {
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5433/Cihaz", "postgres", "123456");
            if(connection!=null)
            System.out.println("tamamdır");
            else
            System.out.println("nope");
            String sql = "SELECT *  FROM \"User\" WHERE \"UserName\"='"+Isim+"'AND \"UserPin\"='"+Sifre+"'";

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()) {
                System.out.println("doğrulandı");
                x=true;
            }
            else
            {
                System.out.println("doğrulanamadı");
            }
            
            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return x;
    }
        public boolean getdbCon(String Isim,String Sifre){
            return dbCon(Isim,Sifre);
        }

    
}
