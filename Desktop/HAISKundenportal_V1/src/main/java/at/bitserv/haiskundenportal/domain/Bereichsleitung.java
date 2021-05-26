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
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "Bereichsleitung", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bereichsleitung.findAll", query = "SELECT b FROM Bereichsleitung b")})
public class Bereichsleitung implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "pf_id")
    private Integer pfId;
    @Size(max = 250)
    @Column(name = "name")
    private String name;
    @Size(max = 80)
    @Column(name = "BLFunktion")
    private String bLFunktion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 80)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 80)
    @Column(name = "HandyB")
    private String handyB;
    @Column(name = "sozialstation")
    private Integer sozialstation;
    @Column(name = "dl_bereich")
    private String dl_bereich;
    @Column(name = "dls")
    private String dls;
       
    public Bereichsleitung() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPfId() {
        return pfId;
    }

    public void setPfId(Integer pfId) {
        this.pfId = pfId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="blfunktion")
    public String getBLFunktion() {
        return bLFunktion;
    }

    public void setBLFunktion(String bLFunktion) {
        this.bLFunktion = bLFunktion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHandyB() {
        return handyB;
    }

    public void setHandyB(String handyB) {
        this.handyB = handyB;
    }

    public Integer getSozialstation() {
        return sozialstation;
    }

    public void setSozialstation(Integer sozialstation) {
        this.sozialstation = sozialstation;
    }

    public String getDl_bereich() {
        return dl_bereich;
    }

    public void setDl_bereich(String dl_bereich) {
        this.dl_bereich = dl_bereich;
    }

    public String getDls() {
        return dls;
    }

    public void setDls(String dls) {
        this.dls = dls;
    }


    
    
}
