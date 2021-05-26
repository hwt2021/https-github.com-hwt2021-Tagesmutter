/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Immutable;

/**
 *
 * @author h.singh
 */
@Entity
@Immutable
@Table(name = "Benutzer", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Benutzer.findAll", query = "SELECT b FROM Benutzer b")})
public class Benutzer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KundenID")
    private int kundenID;
    @Size(max = 250)
    @Column(name = "expression")
    private String expression;
    @Size(max = 250)
    @Column(name = "Vorname")
    private String Vorname;
    @Size(max = 250)
    @Column(name = "Zuname")
    private String Zuname;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "DLs")
    private String dLs;

    /*     
    @Size(min = 1, max = 2147483647)
    @Column(name = "DLs_Ende")
    private String DLs_Ende;
    */
    
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 80)
    @Column(name = "email")
    private String email;
    @Size(max = 80)
    @Column(name = "passwort")
    private String passwort;
    @Column(name = "geburtsdatum")
    @Temporal(TemporalType.DATE)
    private Date geburtsdatum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HDL")
    private int HDL;
    @Size(max = 80)
    @Column(name = "Anrede")
    private String Anrede;

    public Benutzer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getKundenID() {
        return kundenID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getDLs() {
        return dLs;
    }

    public void setDLs(String dLs) {
        this.dLs = dLs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getZuname() {
        return Zuname;
    }

    public void setZuname(String Zuname) {
        this.Zuname = Zuname;
    }

    public int getHDL() {
        return HDL;
    }

    public void setHDL(int HDL) {
        this.HDL = HDL;
    }

    public String getAnrede() {
        return Anrede;
    }

    public void setAnrede(String Anrede) {
        this.Anrede = Anrede;
    }
    /*
    public String getDLs_Ende() {
        return DLs_Ende;
    }
    public void setDLs_Ende(String DLs_Ende) {
        this.DLs_Ende = DLs_Ende;
    }
      */  
}
