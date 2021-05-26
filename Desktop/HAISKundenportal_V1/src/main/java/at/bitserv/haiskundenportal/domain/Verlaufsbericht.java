/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import at.bitserv.haiskundenportal.service.AdapterCDATA;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "Verlaufsbericht", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Verlaufsbericht.findAll", query = "SELECT v FROM Verlaufsbericht v")
    , @NamedQuery(name = "Verlaufsbericht.findByKundenid", query = "SELECT v FROM Verlaufsbericht v WHERE v.kundenid = :kundenid")
    , @NamedQuery(name = "Verlaufsbericht.findByKundenidinDate", query = "SELECT v FROM Verlaufsbericht v WHERE v.kundenid = :kundenid and v.modifieddate between :datevon and :datebis")})
public class Verlaufsbericht implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Size(max = 255)
    @Column(name = "mocca_id")
    private String moccaId;
    @Column(name = "modifieddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifieddate;
    @Column(name = "betreuerid")
    private Integer betreuerid;
    @Column(name = "kundenid")
    private Integer kundenid;
    @Size(max = 255)
    @Column(name = "typejournal")
    private String typejournal;
    @Size(max = 8000)
    @Column(name = "text")
    private String text;
    @Size(max = 255)
    @Column(name = "kurzbezeichnung")
    private String kurzbezeichnung;
    @Size(max = 2147483647)
    @Column(name = "Ausbildung")
    private String ausbildung;
    @Size(max = 2147483647)
    @Column(name = "Ausbildunglang")
    private String ausbildunglang;

    public Verlaufsbericht() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoccaId() {
        return moccaId;
    }

    public void setMoccaId(String moccaId) {
        this.moccaId = moccaId;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public Integer getBetreuerid() {
        return betreuerid;
    }

    public void setBetreuerid(Integer betreuerid) {
        this.betreuerid = betreuerid;
    }

    public Integer getKundenid() {
        return kundenid;
    }

    public void setKundenid(Integer kundenid) {
        this.kundenid = kundenid;
    }

    public String getTypejournal() {
        return typejournal;
    }

    public void setTypejournal(String typejournal) {
        this.typejournal = typejournal;
    }

        public String getText() {
       // removes non-printable characters from Unicode
        text = text.replaceAll("\\p{C}", " ");
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKurzbezeichnung() {
        return kurzbezeichnung;
    }

    public void setKurzbezeichnung(String kurzbezeichnung) {
        this.kurzbezeichnung = kurzbezeichnung;
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
    
    
}
