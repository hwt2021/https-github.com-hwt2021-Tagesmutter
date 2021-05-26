/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manfred
 */
@Entity
@Table(name = "BetreuungsZeiten_kurz",  schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BetreuungsZeitenkurz.findAll", query = "SELECT b FROM BetreuungsZeitenkurz b")})
public class BetreuungsZeitenkurz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 51)
    @Id
    @Column(name = "id")
    private String id;
    @Size(max = 250)
    @Column(name = "Betreuer")
    private String betreuer;
    @Column(name = "KundenID")
    private Integer kundenID;
    @Column(name = "jahr")
    private Short jahr;
    @Column(name = "monat")
    private Short monat;
    @Column(name = "tag")
    private Short tag;
    @Column(name = "zvon")
    @Temporal(TemporalType.TIME)
    private Date zvon;
    @Column(name = "zbis")
    @Temporal(TemporalType.TIME)
    private Date zbis;
    @Column(name = "dauer")
    private Integer dauer;
    @Column(name = "dienstleistung")
    private Integer dienstleistung;
    @Size(max = 250)
    @Column(name = "dienstleistunglang")
    private String dienstleistunglang;
    @Column(name = "leistungsart")
    private Integer leistungsart;
    @Size(max = 250)
    @Column(name = "leistungsartlang")
    private String leistungsartlang;
    @Size(max = 250)
    @Column(name = "Ausbildunglang")
    private String Ausbildunglang;
    @Column(name = "Sortwert")
    private String Sortwert;
    @Column(name = "BetreuerNr")
    private Integer BetreuerNr;

    public BetreuungsZeitenkurz() {
    }

    @XmlTransient
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(String betreuer) {
        this.betreuer = betreuer;
    }

    //@XmlTransient
    public Integer getKundenID() {
        return kundenID;
    }

    public void setKundenID(Integer kundenID) {
        this.kundenID = kundenID;
    }

    public Short getJahr() {
        return jahr;
    }

    public void setJahr(Short jahr) {
        this.jahr = jahr;
    }

    public Short getMonat() {
        return monat;
    }

    public void setMonat(Short monat) {
        this.monat = monat;
    }

    public Short getTag() {
        return tag;
    }

    public void setTag(Short tag) {
        this.tag = tag;
    }

    public Date getZvon() {
        return zvon;
    }

    public void setZvon(Date zvon) {
        this.zvon = zvon;
    }

    public Date getZbis() {
        return zbis;
    }

    public void setZbis(Date zbis) {
        this.zbis = zbis;
    }

    public Integer getDauer() {
        return dauer;
    }

    public void setDauer(Integer dauer) {
        this.dauer = dauer;
    }

    public Integer getDienstleistung() {
        return dienstleistung;
    }

    public void setDienstleistung(Integer dienstleistung) {
        this.dienstleistung = dienstleistung;
    }

    public String getDienstleistunglang() {
        return dienstleistunglang;
    }

    public void setDienstleistunglang(String dienstleistunglang) {
        this.dienstleistunglang = dienstleistunglang;
    }

    public Integer getLeistungsart() {
        return leistungsart;
    }

    public void setLeistungsart(Integer leistungsart) {
        this.leistungsart = leistungsart;
    }

    public String getLeistungsartlang() {
        return leistungsartlang;
    }

    public void setLeistungsartlang(String leistungsartlang) {
        this.leistungsartlang = leistungsartlang;
    }    

    public String getAusbildunglang() {
        return Ausbildunglang;
    }

    public void setAusbildunglang(String Ausbildunglang) {
        this.Ausbildunglang = Ausbildunglang;
    }

    public String getSortwert() {
        return Sortwert;
    }

    public void setSortwert(String Sortwert) {
        this.Sortwert = Sortwert;
    }    

    public Integer getBetreuerNr() {
        return BetreuerNr;
    }

    public void setBetreuerNr(Integer BetreuerNr) {
        this.BetreuerNr = BetreuerNr;
    }
    
}
