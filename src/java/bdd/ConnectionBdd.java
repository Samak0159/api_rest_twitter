/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sylvain
 */
public class ConnectionBdd {

    private static Connection _instance;

    private ConnectionBdd() {

    }

    public static Connection getInstance() throws ClassNotFoundException, SQLException {
        if (_instance == null) {
            //Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "btssio", "btssio");
            Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql://", "localhost/", "api_rest_twitter", "rest", "epsi");
            Jdbc.getInstance().connecter();

            _instance = Jdbc.getInstance().getConnexion();
        }

        return _instance;
    }

    /**
     * Execute the query
     * @param query
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static ResultSet request(String query) throws ClassNotFoundException, SQLException {
        return ConnectionBdd.getInstance().prepareStatement(query).executeQuery();
    }
}
