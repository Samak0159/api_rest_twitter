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
public class Test {
    private int id;
    private String libelle;

    public Test(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Test() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Test{" + "id=" + id + ", libelle=" + libelle + '}';
    }
    
}
