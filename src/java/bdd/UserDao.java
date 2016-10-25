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
import metier.Twitter;
import metier.User;

/**
 *
 * @author sylvain
 */
public class UserDao {
    
    /**
     * Get All Users
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static List<User> getAll() throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<User>();

        String requete = "SELECT * FROM user";

        ResultSet resultSet = ConnectionBdd.request(requete);

        while (resultSet.next()) {
            users.add(new User(resultSet.getInt("id"), resultSet.getString("nom"), resultSet.getString("prenom"), resultSet.getString("email"), TwitterDao.getTwitterById(resultSet.getInt("id_twitter"))));
        }

        return users;
    }
    
    public static User getUserById(int id) throws SQLException, ClassNotFoundException {
        User user = new User();
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement;

        String requete = "SELECT * FROM user WHERE id= ?";

        // préparer la requête
        preparedStatement = ConnectionBdd.getInstance().prepareStatement(requete);
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            user.setId(resultSet.getInt("id"));
            user.setNom(resultSet.getString("nom"));
            user.setPrenom(resultSet.getString("prenom"));
            user.setEmail(resultSet.getString("email"));
            user.setTwitter(TwitterDao.getTwitterById(resultSet.getInt("id_twitter")));
        }

        return user;
    }
}
