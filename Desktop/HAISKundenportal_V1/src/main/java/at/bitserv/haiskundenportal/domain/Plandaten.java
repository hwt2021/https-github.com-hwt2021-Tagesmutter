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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manfred
 */
@Entity
@Table(name = "Plandaten", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plandaten.findAll", query = "SELECT p FROM Plandaten p")})
public class Plandaten implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "Plandaten")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plandaten;
    @Column(name = "Dauer")
    private Integer dauer;
    @Column(name = "ISTSTARTZeit")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iSTSTARTZeit;
    @Column(name = "ISTENDZeit")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iSTENDZeit;
    @Size(max = 255)
    @Column(name = "KundenID")
    private String kundenID;
    @Size(max = 250)
    @Column(name = "Kunde")
    private String kunde;
    @Size(max = 255)
    @Column(name = "MitarbeiterID")
    private String mitarbeiterID;
    @Size(max = 250)
    @Column(name = "Mitarbeiter")
    private String mitarbeiter;
    @Size(max = 255)
    @Column(name = "Moccacode")
    private String moccacode;
    @Size(max = 200)
    @Column(name = "dienstleistung")
    private String dienstleistung;
    @Size(max = 80)
    @Column(name = "leistungsart")
    private String leistungsart;
    @Size(max = 250)
    @Column(name = "Ausbildunglang")
    private String Ausbildunglang;
    @Column(name = "Sortwert")
    private String Sortwert;

    public Plandaten() {
    }

    @XmlTransient
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPlandaten() {
        return plandaten;
    }

    public void setPlandaten(Date plandaten) {
        this.plandaten = plandaten;
    }

    public Integer getDauer() {
        return dauer;
    }

    public void setDauer(Integer dauer) {
        this.dauer = dauer;
    }
    
    @XmlElement(name ="startzeit")
    public Date getISTSTARTZeit() {
        return iSTSTARTZeit;
    }

    public void setISTSTARTZeit(Date iSTSTARTZeit) {
        this.iSTSTARTZeit = iSTSTARTZeit;
    }

    @XmlElement(name ="endzeit")
    public Date getISTENDZeit() {
        return iSTENDZeit;
    }

    public void setISTENDZeit(Date iSTENDZeit) {
        this.iSTENDZeit = iSTENDZeit;
    }

    @XmlTransient
    public String getKundenID() {
        return kundenID;
    }

    public void setKundenID(String kundenID) {
        this.kundenID = kundenID;
    }

    public String getKunde() {
        return kunde;
    }

    public void setKunde(String kunde) {
        this.kunde = kunde;
    }
    
    public String getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(String mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public String getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(String mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    @XmlTransient
    public String getMoccacode() {
        return moccacode;
    }

    public void setMoccacode(String moccacode) {
        this.moccacode = moccacode;
    }

    public String getDienstleistung() {
        return dienstleistung;
    }

    public void setDienstleistung(String dienstleistung) {
        this.dienstleistung = dienstleistung;
    }

    public String getLeistungsart() {
        return leistungsart;
    }

    public void setLeistungsart(String leistungsart) {
        this.leistungsart = leistungsart;
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
    
    
    
}
