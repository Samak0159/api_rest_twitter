/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author sylvain
 */
public class Twitter {

    private int id;
    private String oauth_token;
    private String oauth_verifier;

    public Twitter(int id, String oauth_token, String oauth_verifier) {
        this.id = id;
        this.oauth_token = oauth_token;
        this.oauth_verifier = oauth_verifier;
    }

    public Twitter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOauth_token() {
        return oauth_token;
    }

    public void setOauth_token(String oauth_token) {
        this.oauth_token = oauth_token;
    }

    public String getOauth_verifier() {
        return oauth_verifier;
    }

    public void setOauth_verifier(String oauth_verifier) {
        this.oauth_verifier = oauth_verifier;
    }

    @Override
    public String toString() {
        return "Twitter{" + "id=" + id + ", oauth_token=" + oauth_token + ", oauth_verifier=" + oauth_verifier + '}';
    }

}
