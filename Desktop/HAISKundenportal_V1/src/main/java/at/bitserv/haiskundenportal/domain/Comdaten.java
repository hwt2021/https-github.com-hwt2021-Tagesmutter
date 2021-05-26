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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Manfred
 */
@Entity
@Table(name = "Comdaten",  schema = "hais")
@XmlRootElement
@XmlType (propOrder={"typ","nr","SortLevel"})
@NamedQueries({
    @NamedQuery(name = "Comdaten.findAll", query = "SELECT c FROM Comdaten c")})
public class Comdaten implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Size(max = 80)
    @Column(name = "nr")
    private String nr;
    @Size(max = 80)
    @Column(name = "typ")
    private String typ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partner_ID")
    private int partnerID;
    @NotNull
    @Column(name = "SortLevel")
    @XmlElement(name = "SortLevel")
    private Integer SortLevel;

    public Comdaten() {
    }
    
    @XmlTransient
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getTyp() {
        //Sonst NullPointerException bei Replace
        if (typ == null) {
            typ = "";
        }
        return typ.replace("EMail","Email");
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
    
    @XmlTransient
    public int getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(int partnerID) {
        this.partnerID = partnerID;
    }

    public Integer getSortLevel() {
        return SortLevel;
    }

    public void setSortLevel(int SortLevel) {
        this.SortLevel = SortLevel;
    }
    
}
