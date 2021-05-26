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

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "BetreuungsTeam", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BetreuungsTeam.findAll", query = "SELECT b FROM BetreuungsTeam b")})
public class BetreuungsTeam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "kurzbezeichnung")
    private String kurzbezeichnung;
    @Size(max = 80)
    @Column(name = "paraphe")
    private String paraphe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pf_id")
    private int pfId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "von")
    @Temporal(TemporalType.DATE)
    private Date von;
    @Column(name = "bis")
    @Temporal(TemporalType.DATE)
    private Date bis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KundenID")
    private int kundenID;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Ausbildung")
    private String ausbildung;
    @Size(max = 2147483647)
    @Column(name = "Ausbildunglang")
    private String ausbildunglang;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "id_dienstleistung")
    private Integer idDienstleistung;
    @Column(name = "Sortwert")
    private String sortwert;

    public BetreuungsTeam() {
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

    public int getKundenID() {
        return kundenID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
    }

    public String getAusbildung() {
        return ausbildung;
    }

    public void setAusbildung(String ausbildung) {
        this.ausbildung = ausbildung;
    }

    public String getAusbildunglang() {
        return ausbildunglang;
    }

    public void setAusbildunglang(String ausbildunglang) {
        this.ausbildunglang = ausbildunglang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdDienstleistung() {
        return idDienstleistung;
    }

    public void setIdDienstleistung(Integer idDienstleistung) {
        this.idDienstleistung = idDienstleistung;
    }

    public String getSortwert() {
        return sortwert;
    }

    public void setSortwert(String sortwert) {
        this.sortwert = sortwert;
    }
    
    
    
}
