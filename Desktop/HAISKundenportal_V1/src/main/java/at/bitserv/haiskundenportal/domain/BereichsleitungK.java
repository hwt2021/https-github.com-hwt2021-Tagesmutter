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
import javax.persistence.Lob;
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
@Table(name = "BereichsleitungK", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BereichsleitungK.findAll", query = "SELECT b FROM BereichsleitungK b")})
public class BereichsleitungK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Size(max = 255)
    @Column(name = "kurzbezeichnung")
    private String kurzbezeichnung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pf_id")
    private int pfId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dl")
    private int dl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kundenID")
    private int kundenID;
    @Size(max = 122)
    @Column(name = "name_gesamt")
    private String nameGesamt;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "funktion")
    private String funktion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 80)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 80)
    @Column(name = "handyb")
    private String handyb;

    public BereichsleitungK() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKurzbezeichnung() {
        return kurzbezeichnung;
    }

    public void setKurzbezeichnung(String kurzbezeichnung) {
        this.kurzbezeichnung = kurzbezeichnung;
    }

    public int getPfId() {
        return pfId;
    }

    public void setPfId(int pfId) {
        this.pfId = pfId;
    }

    public int getKundenID() {
        return kundenID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
    }

    public String getNameGesamt() {
        return nameGesamt;
    }

    public void setNameGesamt(String nameGesamt) {
        this.nameGesamt = nameGesamt;
    }

    public String getFunktion() {
        funktion=funktion.replaceAll(System.getProperty("line.separator"), "<br/>");
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHandyb() {
        return handyb;
    }

    public void setHandyb(String handyb) {
        this.handyb = handyb;
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }
    
    
    
}
