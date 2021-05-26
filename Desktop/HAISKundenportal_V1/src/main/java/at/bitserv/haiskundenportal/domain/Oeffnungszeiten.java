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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "Oeffnungszeiten", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oeffnungszeiten.findAll", query = "SELECT o FROM Oeffnungszeiten o")})
public class Oeffnungszeiten implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pf_id")
    private int pfId;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tag")
    private String tag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "von")
    @Temporal(TemporalType.TIME)
    private Date von;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bis")
    @Temporal(TemporalType.TIME)
    private Date bis;
    @Column(name = "gueltig_von")
    @Temporal(TemporalType.DATE)
    private Date gueltigVon;
    @Column(name = "gueltig_bis")
    @Temporal(TemporalType.DATE)
    private Date gueltigBis;
    @Basic(optional = false)
    @NotNull
    
    @Column(name = "einrichtungen_gruppen_id")
    private int einrichtungenGruppenId;

    public Oeffnungszeiten() {
    }

    public int getPfId() {
        return pfId;
    }

    public void setPfId(int pfId) {
        this.pfId = pfId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public Date getGueltigVon() {
        return gueltigVon;
    }

    public void setGueltigVon(Date gueltigVon) {
        this.gueltigVon = gueltigVon;
    }

    public Date getGueltigBis() {
        return gueltigBis;
    }

    public void setGueltigBis(Date gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    public int getEinrichtungenGruppenId() {
        return einrichtungenGruppenId;
    }

    public void setEinrichtungenGruppenId(int einrichtungenGruppenId) {
        this.einrichtungenGruppenId = einrichtungenGruppenId;
    }
    
}
