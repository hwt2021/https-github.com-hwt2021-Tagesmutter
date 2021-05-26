/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "SIS_User", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SISUser.findAll", query = "SELECT s FROM SISUser s")})
public class SISUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "benutzer_extern")
    private String benutzerExtern;
    @Size(max = 255)
    @Column(name = "loginid")
    private String loginid;
    @Size(max = 255)
    @Column(name = "passwort")
    private String passwort;
    @Size(max = 255)
    @Column(name = "bhnr")
    private String bhnr;
    @Size(max = 255)
    @Column(name = "email")
    private String email;

    public SISUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBenutzerExtern() {
        return benutzerExtern;
    }

    public void setBenutzerExtern(String benutzerExtern) {
        this.benutzerExtern = benutzerExtern;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getBhnr() {
        return bhnr;
    }

    public void setBhnr(String bhnr) {
        this.bhnr = bhnr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
