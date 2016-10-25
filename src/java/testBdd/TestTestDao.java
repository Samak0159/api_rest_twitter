/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testBdd;

import bdd.Jdbc;
import bdd.TestDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import metier.Test;

/**
 *
 * @author sylvain
 */
public class TestTestDao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("Begin test");

        List<Test> tests = TestDao.getAll();

        System.out.println("tests : " + tests);
    }
}
