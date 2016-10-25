/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.Twitter;
import metier.User;

/**
 *
 * @author sylvain
 */
public class TwitterDao {

    /**
     * Get all Twitter connection
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static List<Twitter> getAll() throws SQLException, ClassNotFoundException {
        List<Twitter> twitters = new ArrayList<Twitter>();

        String requete = "SELECT * FROM twitter";

        ResultSet resultSet = ConnectionBdd.request(requete);

        while (resultSet.next()) {
            twitters.add(new Twitter(resultSet.getInt("id"), resultSet.getString("oauth_token"), resultSet.getString("oauth_verifier")));
        }

        return twitters;
    }

    /**
     * Get the Twitter related to the id
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static Twitter getTwitterById(int id) throws SQLException, ClassNotFoundException {
        Twitter twitter = new Twitter();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement;

        String requete = "SELECT * FROM twitter WHERE id= ?";

        // préparer la requête
        preparedStatement = ConnectionBdd.getInstance().prepareStatement(requete);
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            twitter.setId(resultSet.getInt("id"));
            twitter.setOauth_token(resultSet.getString("oauth_token"));
            twitter.setOauth_verifier(resultSet.getString("oauth_verifier"));
        }

        return twitter;
    }
}
