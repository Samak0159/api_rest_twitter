/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.Test;

/**
 *
 * @author sylvain
 */
public class TestDao {

    public static List<Test> getAll() throws SQLException, ClassNotFoundException {
        List<Test> tests = new ArrayList<Test>();

        String requete = "SELECT * FROM test";

        ResultSet resultSet = ConnectionBdd.request(requete);

        while (resultSet.next()) {
            tests.add(new Test(resultSet.getInt("id"), resultSet.getString("libelle")));
        }

        return tests;
    }
}
