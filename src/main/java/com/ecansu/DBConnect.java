package com.ecansu;

import java.sql.*;

public class DBConnect {

    public static void main(String[] args) {

        Connection connect = null;

        //jdbc:postgresql://<database_host>:<port>/<database_name>
        String url = "jdbc:postgresql://localhost:5432/test";
        String user = "postgres";
        String password = "edacansuroot";
        Statement st= null;


        String sql1 = "Select * from book";
        String sql2 = "INSERT INTO book (title, page_number, author_id) VALUES ('Edoşka', 1020, 8)";
        String sql3 = "INSERT INTO book (title, page_number, author_id) VALUES ('Edoşka2', 1020, 8)";
        String sql4 = "INSERT INTO book (title, page_number, author_id) VALUES (?,?,?)";

        try {
            connect = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            //st = connect.createStatement();

            /*ResultSet data = st.executeQuery(sql1);
            while(data.next()){
                System.out.println("Title:" + data.getString("title"));
            }*/

            //st.executeUpdate(sql3);

            PreparedStatement prSt = connect.prepareStatement(sql4);
            prSt.setString(1, "Edoşkaaaaaa");
            prSt.setInt(2, 415);
            prSt.setInt(3, 8);

            prSt.executeUpdate();




        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
