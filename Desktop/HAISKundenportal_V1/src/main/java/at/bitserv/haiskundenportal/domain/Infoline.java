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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MANFRED
 */
@Entity
@Table(name = "infoline", catalog = "hais_lgs", schema = "DBA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Infoline.findAll", query = "SELECT i FROM Infoline i")
    , @NamedQuery(name = "Infoline.findById", query = "SELECT i FROM Infoline i WHERE i.id = :id")
    , @NamedQuery(name = "Infoline.findByPfIdErfassungDurch", query = "SELECT i FROM Infoline i WHERE i.pfIdErfassungDurch = :pfIdErfassungDurch")
    , @NamedQuery(name = "Infoline.findByPfIdKunde", query = "SELECT i FROM Infoline i WHERE i.pfIdKunde = :pfIdKunde")
    , @NamedQuery(name = "Infoline.findByBeschreibung", query = "SELECT i FROM Infoline i WHERE i.beschreibung = :beschreibung")
    , @NamedQuery(name = "Infoline.findByStatus", query = "SELECT i FROM Infoline i WHERE i.status = :status")
    , @NamedQuery(name = "Infoline.findByPfIdWeiterleitungAn", query = "SELECT i FROM Infoline i WHERE i.pfIdWeiterleitungAn = :pfIdWeiterleitungAn")
    , @NamedQuery(name = "Infoline.findByStartBeratung", query = "SELECT i FROM Infoline i WHERE i.startBeratung = :startBeratung")
    , @NamedQuery(name = "Infoline.findByEndeBeratung", query = "SELECT i FROM Infoline i WHERE i.endeBeratung = :endeBeratung")
    , @NamedQuery(name = "Infoline.findByTyp", query = "SELECT i FROM Infoline i WHERE i.typ = :typ")
    , @NamedQuery(name = "Infoline.findByDl", query = "SELECT i FROM Infoline i WHERE i.dl = :dl")
    , @NamedQuery(name = "Infoline.findByErledigungsvermerk", query = "SELECT i FROM Infoline i WHERE i.erledigungsvermerk = :erledigungsvermerk")
    , @NamedQuery(name = "Infoline.findByErledigtAm", query = "SELECT i FROM Infoline i WHERE i.erledigtAm = :erledigtAm")
    , @NamedQuery(name = "Infoline.findByErledigtDurchPfId", query = "SELECT i FROM Infoline i WHERE i.erledigtDurchPfId = :erledigtDurchPfId")})
public class Infoline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Transient
    @Column(name = "erfassungsdatum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date erfassungsdatum;
    @Column(name = "pf_id_erfassung_durch")
    private Integer pfIdErfassungDurch;
    @Column(name = "pf_id_kunde")
    private Integer pfIdKunde;
    @Size(max = 8000)
    @Column(name = "beschreibung")
    private String beschreibung;
    @Column(name = "status")
    private Character status;
    @Column(name = "pf_id_weiterleitung_an")
    private Integer pfIdWeiterleitungAn;
    @Column(name = "start_beratung")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startBeratung;
    @Column(name = "ende_beratung")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endeBeratung;
    @Size(max = 10)
    @Column(name = "typ")
    private String typ;
    @Column(name = "DL")
    private Integer dl;
    @Size(max = 2000)
    @Column(name = "erledigungsvermerk")
    private String erledigungsvermerk;
    @Column(name = "erledigt_am")
    @Temporal(TemporalType.TIMESTAMP)
    private Date erledigtAm;
    @Column(name = "erledigt_durch_pf_id")
    private Integer erledigtDurchPfId;
    @Size(max = 40)
    @Column(name = "quelle")
    private String quelle;
    @Column(name = "pf_id_ma_emma")
    private Integer pf_id_ma_emma;
    @Size(max = 255)
    @Column(name = "relatives")
    private String relatives;
    
    public Infoline() {
    }

    public Infoline(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getErfassungsdatum() {
        return erfassungsdatum;
    }


    public void setErfassungsdatum(Date erfassungsdatum) {
        this.erfassungsdatum = erfassungsdatum;
    }

    public Integer getPfIdErfassungDurch() {
        return pfIdErfassungDurch;
    }

    public void setPfIdErfassungDurch(Integer pfIdErfassungDurch) {
        this.pfIdErfassungDurch = pfIdErfassungDurch;
    }

    public Integer getPfIdKunde() {
        return pfIdKunde;
    }

    public void setPfIdKunde(Integer pfIdKunde) {
        this.pfIdKunde = pfIdKunde;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Integer getPfIdWeiterleitungAn() {
        return pfIdWeiterleitungAn;
    }

    public void setPfIdWeiterleitungAn(Integer pfIdWeiterleitungAn) {
        this.pfIdWeiterleitungAn = pfIdWeiterleitungAn;
    }

    public Date getStartBeratung() {
        return startBeratung;
    }

    public void setStartBeratung(Date startBeratung) {
        this.startBeratung = startBeratung;
    }

    public Date getEndeBeratung() {
        return endeBeratung;
    }

    public void setEndeBeratung(Date endeBeratung) {
        this.endeBeratung = endeBeratung;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Integer getDl() {
        return dl;
    }

    public void setDl(Integer dl) {
        this.dl = dl;
    }

    public String getErledigungsvermerk() {
        return erledigungsvermerk;
    }

    public void setErledigungsvermerk(String erledigungsvermerk) {
        this.erledigungsvermerk = erledigungsvermerk;
    }

    public Date getErledigtAm() {
        return erledigtAm;
    }

    public void setErledigtAm(Date erledigtAm) {
        this.erledigtAm = erledigtAm;
    }

    public Integer getErledigtDurchPfId() {
        return erledigtDurchPfId;
    }

    public void setErledigtDurchPfId(Integer erledigtDurchPfId) {
        this.erledigtDurchPfId = erledigtDurchPfId;
    }

    public String getQuelle() {
        return quelle;
    }

    public void setQuelle(String quelle) {
        this.quelle = quelle;
    }

    public Integer getPf_id_ma_emma() {
        return pf_id_ma_emma;
    }

    public void setPf_id_ma_emma(Integer pf_id_ma_emma) {
        this.pf_id_ma_emma = pf_id_ma_emma;
    }

    public String getRelatives() {
        return relatives;
    }

    public void setRelatives(String relatives) {
        this.relatives = relatives;
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
        if (!(object instanceof Infoline)) {
            return false;
        }
        Infoline other = (Infoline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Infoline[ id=" + id + " ]";
    }
    
}
