/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "Kindergruppen", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kindergruppen.findAll", query = "SELECT k FROM Kindergruppen k")})
public class Kindergruppen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dienstleistung")
    private int dienstleistung;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "gruppe")
    private String gruppe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pf_id")
    private int pfId;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "von")
    @Temporal(TemporalType.DATE)
    private Date von;
    @Column(name = "bis")
    @Temporal(TemporalType.DATE)
    private Date bis;
    @Column(name = "id_comdaten")
    private Integer idComdaten;
    @Size(max = 80)
    @Column(name = "nr")
    private String nr;
    @Size(max = 20)
    @Column(name = "typ")
    private String typ;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "einrichtungenGruppenId",  fetch=FetchType.EAGER)
 //   @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Oeffnungszeiten> OeffnungszeitenCollection;

    public Kindergruppen() {
    }

    public int getDienstleistung() {
        return dienstleistung;
    }

    public void setDienstleistung(int dienstleistung) {
        this.dienstleistung = dienstleistung;
    }

    public String getGruppe() {
        return gruppe;
    }

    public void setGruppe(String gruppe) {
        this.gruppe = gruppe;
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

    public Integer getIdComdaten() {
        return idComdaten;
    }

    public void setIdComdaten(Integer idComdaten) {
        this.idComdaten = idComdaten;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @XmlElementWrapper(name="Oeffnungszeiten")
    @XmlElement(name="Offnungszeit")
    public Collection<Oeffnungszeiten> getOeffnungszeitenCollection() {
        return OeffnungszeitenCollection;
    }

    public void setOeffnungszeitenCollection(Collection<Oeffnungszeiten> OeffnungszeitenCollection) {
        this.OeffnungszeitenCollection = OeffnungszeitenCollection;
    }
    
}
