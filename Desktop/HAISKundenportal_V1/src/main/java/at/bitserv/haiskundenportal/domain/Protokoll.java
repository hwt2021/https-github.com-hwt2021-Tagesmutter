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
 * @author t.nofal
 */
@Entity
@Table(name = "Protokoll")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Protokoll.findAll", query = "SELECT p FROM Protokoll p"),
    @NamedQuery(name = "Protokoll.findById", query = "SELECT p FROM Protokoll p WHERE p.id = :id"),
    @NamedQuery(name = "Protokoll.findByTyp", query = "SELECT p FROM Protokoll p WHERE p.typ = :typ"),
    @NamedQuery(name = "Protokoll.findByAbrechnungsperiode", query = "SELECT p FROM Protokoll p WHERE p.abrechnungsperiode = :abrechnungsperiode"),
    @NamedQuery(name = "Protokoll.findByBemerkung", query = "SELECT p FROM Protokoll p WHERE p.bemerkung = :bemerkung"),
    @NamedQuery(name = "Protokoll.findByZeitpunkt", query = "SELECT p FROM Protokoll p WHERE p.zeitpunkt = :zeitpunkt"),
    @NamedQuery(name = "Protokoll.findByJahr", query = "SELECT p FROM Protokoll p WHERE p.jahr = :jahr"),
    @NamedQuery(name = "Protokoll.findByMonat", query = "SELECT p FROM Protokoll p WHERE p.monat = :monat"),
    @NamedQuery(name = "Protokoll.findBySst", query = "SELECT p FROM Protokoll p WHERE p.sst = :sst"),
    @NamedQuery(name = "Protokoll.findByBereich", query = "SELECT p FROM Protokoll p WHERE p.bereich = :bereich"),
    @NamedQuery(name = "Protokoll.findByProzess", query = "SELECT p FROM Protokoll p WHERE p.prozess = :prozess"),
    @NamedQuery(name = "Protokoll.findByProtokollNr", query = "SELECT p FROM Protokoll p WHERE p.protokollNr = :protokollNr"),
    @NamedQuery(name = "Protokoll.findByZeitpunkt2", query = "SELECT p FROM Protokoll p WHERE p.zeitpunkt2 = :zeitpunkt2"),
    @NamedQuery(name = "Protokoll.findByUid", query = "SELECT p FROM Protokoll p WHERE p.uid = :uid"),
    @NamedQuery(name = "Protokoll.findBySysinfo", query = "SELECT p FROM Protokoll p WHERE p.sysinfo = :sysinfo"),
    @NamedQuery(name = "Protokoll.findByPfIdErfassung", query = "SELECT p FROM Protokoll p WHERE p.pfIdErfassung = :pfIdErfassung"),
    @NamedQuery(name = "Protokoll.findByPfIdMitarbeiter", query = "SELECT p FROM Protokoll p WHERE p.pfIdMitarbeiter = :pfIdMitarbeiter"),
    @NamedQuery(name = "Protokoll.findByPfIdKunde", query = "SELECT p FROM Protokoll p WHERE p.pfIdKunde = :pfIdKunde"),
    @NamedQuery(name = "Protokoll.findByPfIdEinrichtung", query = "SELECT p FROM Protokoll p WHERE p.pfIdEinrichtung = :pfIdEinrichtung"),
    @NamedQuery(name = "Protokoll.findByVerbindungsid", query = "SELECT p FROM Protokoll p WHERE p.verbindungsid = :verbindungsid")})
public class Protokoll implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "Typ")
    private String typ;
    @Size(max = 10)
    @Column(name = "Abrechnungsperiode")
    private String abrechnungsperiode;
    @Size(max = 200)
    @Column(name = "Bemerkung")
    private String bemerkung;
    @Column(name = "Zeitpunkt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zeitpunkt;
    @Column(name = "Jahr")
    private Short jahr;
    @Column(name = "Monat")
    private Short monat;
    @Column(name = "SST")
    private Integer sst;
    @Column(name = "Bereich")
    private Integer bereich;
    @Size(max = 50)
    @Column(name = "Prozess")
    private String prozess;
    @Column(name = "ProtokollNr")
    private Integer protokollNr;
    @Column(name = "Zeitpunkt2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zeitpunkt2;
    @Size(max = 20)
    @Column(name = "UID")
    private String uid;
    @Size(max = 200)
    @Column(name = "sysinfo")
    private String sysinfo;
    @Column(name = "pf_id_erfassung")
    private Integer pfIdErfassung;
    @Column(name = "pf_id_mitarbeiter")
    private Integer pfIdMitarbeiter;
    @Column(name = "pf_id_kunde")
    private Integer pfIdKunde;
    @Column(name = "pf_id_einrichtung")
    private Integer pfIdEinrichtung;
    @Size(max = 20)
    @Column(name = "verbindungsid")
    private String verbindungsid;

    public Protokoll() {
    }

    public Protokoll(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getAbrechnungsperiode() {
        return abrechnungsperiode;
    }

    public void setAbrechnungsperiode(String abrechnungsperiode) {
        this.abrechnungsperiode = abrechnungsperiode;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public Date getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(Date zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
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

    public Integer getSst() {
        return sst;
    }

    public void setSst(Integer sst) {
        this.sst = sst;
    }

    public Integer getBereich() {
        return bereich;
    }

    public void setBereich(Integer bereich) {
        this.bereich = bereich;
    }

    public String getProzess() {
        return prozess;
    }

    public void setProzess(String prozess) {
        this.prozess = prozess;
    }

    public Integer getProtokollNr() {
        return protokollNr;
    }

    public void setProtokollNr(Integer protokollNr) {
        this.protokollNr = protokollNr;
    }

    public Date getZeitpunkt2() {
        return zeitpunkt2;
    }

    public void setZeitpunkt2(Date zeitpunkt2) {
        this.zeitpunkt2 = zeitpunkt2;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSysinfo() {
        return sysinfo;
    }

    public void setSysinfo(String sysinfo) {
        this.sysinfo = sysinfo;
    }

    public Integer getPfIdErfassung() {
        return pfIdErfassung;
    }

    public void setPfIdErfassung(Integer pfIdErfassung) {
        this.pfIdErfassung = pfIdErfassung;
    }

    public Integer getPfIdMitarbeiter() {
        return pfIdMitarbeiter;
    }

    public void setPfIdMitarbeiter(Integer pfIdMitarbeiter) {
        this.pfIdMitarbeiter = pfIdMitarbeiter;
    }

    public Integer getPfIdKunde() {
        return pfIdKunde;
    }

    public void setPfIdKunde(Integer pfIdKunde) {
        this.pfIdKunde = pfIdKunde;
    }

    public Integer getPfIdEinrichtung() {
        return pfIdEinrichtung;
    }

    public void setPfIdEinrichtung(Integer pfIdEinrichtung) {
        this.pfIdEinrichtung = pfIdEinrichtung;
    }

    public String getVerbindungsid() {
        return verbindungsid;
    }

    public void setVerbindungsid(String verbindungsid) {
        this.verbindungsid = verbindungsid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Protokoll)) {
            return false;
        }
        Protokoll other = (Protokoll) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "at.bitserv.haiskundenportal.domain.Protokoll[ id=" + id + " ]";
    }
    
}
