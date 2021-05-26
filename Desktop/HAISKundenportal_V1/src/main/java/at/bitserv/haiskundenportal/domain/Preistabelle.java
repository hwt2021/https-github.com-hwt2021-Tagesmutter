/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author Manfred
 */
@Entity
@Table(name = "preistabelle", catalog = "hais", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Preistabelle.findAll", query = "SELECT p FROM Preistabelle p")
        , @NamedQuery(name = "Preistabelle.findByArtikelNr", query = "SELECT p FROM Preistabelle p WHERE p.artikelNr = :artikelNr")
    , @NamedQuery(name = "Preistabelle.findByKurzbezeichnung", query = "SELECT p FROM Preistabelle p WHERE p.kurzbezeichnung = :kurzbezeichnung")
    , @NamedQuery(name = "Preistabelle.findByLangbezeichnung", query = "SELECT p FROM Preistabelle p WHERE p.langbezeichnung = :langbezeichnung")
    , @NamedQuery(name = "Preistabelle.findBySlrgKat", query = "SELECT p FROM Preistabelle p WHERE p.slrgKat = :slrgKat")
    , @NamedQuery(name = "Preistabelle.findBySlrgTag", query = "SELECT p FROM Preistabelle p WHERE p.slrgTag = :slrgTag")
    , @NamedQuery(name = "Preistabelle.findByTyp", query = "SELECT p FROM Preistabelle p WHERE p.typ = :typ")
    , @NamedQuery(name = "Preistabelle.findByGueltigVon", query = "SELECT p FROM Preistabelle p WHERE p.gueltigVon = :gueltigVon")
    , @NamedQuery(name = "Preistabelle.findByGueltigBis", query = "SELECT p FROM Preistabelle p WHERE p.gueltigBis = :gueltigBis")
    , @NamedQuery(name = "Preistabelle.findByWert1", query = "SELECT p FROM Preistabelle p WHERE p.wert1 = :wert1")
    , @NamedQuery(name = "Preistabelle.findByWert2", query = "SELECT p FROM Preistabelle p WHERE p.wert2 = :wert2")
    , @NamedQuery(name = "Preistabelle.findByWert3", query = "SELECT p FROM Preistabelle p WHERE p.wert3 = :wert3")
    , @NamedQuery(name = "Preistabelle.findByWert4", query = "SELECT p FROM Preistabelle p WHERE p.wert4 = :wert4")
    , @NamedQuery(name = "Preistabelle.findByKstNr", query = "SELECT p FROM Preistabelle p WHERE p.kstNr = :kstNr")
    , @NamedQuery(name = "Preistabelle.findByEinrichtungNr", query = "SELECT p FROM Preistabelle p WHERE p.einrichtungNr = :einrichtungNr")
    , @NamedQuery(name = "Preistabelle.findByGemeindeNr", query = "SELECT p FROM Preistabelle p WHERE p.gemeindeNr = :gemeindeNr")})
public class Preistabelle implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "artikel_nr")
    private int artikelNr;

    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "kurzbezeichnung")
    private String kurzbezeichnung;
    @Size(max = 200)
    @Column(name = "langbezeichnung")
    private String langbezeichnung;
    @Size(max = 10)
    @Column(name = "slrg_kat")
    private String slrgKat;
    @Size(max = 10)
    @Column(name = "slrg_tag")
    private String slrgTag;
    @Size(max = 10)
    @Column(name = "typ")
    private String typ;
    @Column(name = "gueltig_von")
    @Temporal(TemporalType.DATE)
    private Date gueltigVon;
    @Column(name = "gueltig_bis")
    @Temporal(TemporalType.DATE)
    private Date gueltigBis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "wert1")
    private BigDecimal wert1;
    @Column(name = "wert2")
    private BigDecimal wert2;
    @Column(name = "wert3")
    private BigDecimal wert3;
    @Column(name = "wert4")
    private BigDecimal wert4;
    @Column(name = "kst_nr")
    private Integer kstNr;
    @Column(name = "einrichtung_nr")
    private Integer einrichtungNr;
    @Column(name = "gemeinde_nr")
    private Integer gemeindeNr;

    public Preistabelle() {
    }

    public String getKurzbezeichnung() {
        return kurzbezeichnung;
    }

    public void setKurzbezeichnung(String kurzbezeichnung) {
        this.kurzbezeichnung = kurzbezeichnung;
    }

    public String getLangbezeichnung() {
        return langbezeichnung;
    }

    public void setLangbezeichnung(String langbezeichnung) {
        this.langbezeichnung = langbezeichnung;
    }

    public String getSlrgKat() {
        return slrgKat;
    }

    public void setSlrgKat(String slrgKat) {
        this.slrgKat = slrgKat;
    }

    public String getSlrgTag() {
        return slrgTag;
    }

    public void setSlrgTag(String slrgTag) {
        this.slrgTag = slrgTag;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
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

    public BigDecimal getWert1() {
        return wert1;
    }

    public void setWert1(BigDecimal wert1) {
        this.wert1 = wert1;
    }

    public BigDecimal getWert2() {
        return wert2;
    }

    public void setWert2(BigDecimal wert2) {
        this.wert2 = wert2;
    }

    public BigDecimal getWert3() {
        return wert3;
    }

    public void setWert3(BigDecimal wert3) {
        this.wert3 = wert3;
    }

    public BigDecimal getWert4() {
        return wert4;
    }

    public void setWert4(BigDecimal wert4) {
        this.wert4 = wert4;
    }

    public Integer getKstNr() {
        return kstNr;
    }

    public void setKstNr(Integer kstNr) {
        this.kstNr = kstNr;
    }

    public Integer getEinrichtungNr() {
        return einrichtungNr;
    }

    public void setEinrichtungNr(Integer einrichtungNr) {
        this.einrichtungNr = einrichtungNr;
    }

    public Integer getGemeindeNr() {
        return gemeindeNr;
    }

    public void setGemeindeNr(Integer gemeindeNr) {
        this.gemeindeNr = gemeindeNr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArtikelNr() {
        return artikelNr;
    }

    public void setArtikelNr(int artikelNr) {
        this.artikelNr = artikelNr;
    }
    
}
