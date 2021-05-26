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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "FruehSpaet", catalog = "hais_lgs", schema = "hais")
@NamedQueries({
    @NamedQuery(name = "FruehSpaet.findAll", query = "SELECT f FROM FruehSpaet f")})
public class FruehSpaet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 150)
    @Column(name = "auswahl")
    private String auswahl;
    @Column(name = "von")
    @Temporal(TemporalType.DATE)
    private Date von;
    @Column(name = "bis")
    @Temporal(TemporalType.DATE)
    private Date bis;
    @Basic(optional = false)
    @Id
    @NotNull
    @Column(name = "id")
    private int id;

    public FruehSpaet() {
    }

    public String getAuswahl() {
        return auswahl;
    }

    public void setAuswahl(String Auswahl) {
        this.auswahl = auswahl;
    }

    public Date getVon() {
        return von;
    }

    public void setVon(Date von) {
        this.von = von;
    }

    public Date getBis() {
        return bis;
    }

    public void setBis(Date bis) {
        this.bis = bis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
