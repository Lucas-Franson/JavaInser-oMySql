package br.edu.uniso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDados {

    public static void main(String args[]){



        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://34.225.155.37:3306/lucas_franson?useSSL=false",
                    "lucas_franson", "XXXXX");



            PreparedStatement ps = c.prepareStatement("insert into vendedor(cpf, nome, idade) values " +
                    "(?, ?, ?)");

            ps.setString(1, "48977200873");
            ps.setString(2, "Silva");
            ps.setInt(3, 42);

            ps.executeUpdate();

            ps.close();
            c.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

}
