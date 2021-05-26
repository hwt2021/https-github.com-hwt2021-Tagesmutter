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
import javax.persistence.Transient;
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
@Table(name = "Abrechnungsparameter", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abrechnungsparameter.findAll", query = "SELECT a FROM Abrechnungsparameter a")
    ,@NamedQuery(name = "Abrechnungsparameter.findBHNr", query = "SELECT a FROM Abrechnungsparameter a WHERE a.bh_nr = :bhnr")})
public class Abrechnungsparameter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "kundenID")
    private Integer kundenID;
    @Column(name = "gueltig_von")
    @Temporal(TemporalType.DATE)
    private Date gueltigVon;
    @Column(name = "gueltig_bis")
    @Temporal(TemporalType.DATE)
    private Date gueltigBis;
    @Size(max = 40)
    @Column(name = "aktenzahl")
    private String aktenzahl;
    @Column(name = "eingangsdatum")
    @Temporal(TemporalType.DATE)
    private Date eingangsdatum;
    @Size(max = 40)
    @Column(name = "bezirkshauptmannschaft")
    private String bezirkshauptmannschaft;
    @Column(name = "dienstleistung")
    private Integer dienstleistung;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stdsatzpg")
    private Double stdsatzpg;
    @Column(name = "minelek")
    private Double minelek;
    @Column(name = "maxelek")
    private Double maxelek;
    @Column(name = "stdsatzek")
    private Double stdsatzek;
    @Column(name = "maxelpg")
    private Double maxelpg;
    @Size(max = 10)
    @Column(name = "verrechnungsmodus")
    private String verrechnungsmodus;
    @Size(max = 10)
    @Column(name = "sozialhilfeempfaenger")
    private String sozialhilfeempfaenger;
    @Column(name = "betreuungseinheiten_wt")
    private Double betreuungseinheitenWt;
    @Column(name = "besuche_wt")
    private Short besucheWt;
    @Column(name = "betreuungseinheiten_sa")
    private Double betreuungseinheitenSa;
    @Column(name = "besuche_sa")
    private Short besucheSa;
    @Column(name = "betreuungseinheiten_so")
    private Double betreuungseinheitenSo;
    @Column(name = "besuche_so")
    private Short besucheSo;
    @Column(name = "GemeindeFoerderungvon")
    @Temporal(TemporalType.DATE)
    private Date gemeindeFoerderungvon;
    @Column(name = "GemeindeFoerderungbis")
    @Temporal(TemporalType.DATE)
    private Date gemeindeFoerderungbis;
    @Size(max = 80)
    @Column(name = "Kind")
    private String kind;
    @Column(name = "Wochenstunden")
    private Double wochenstunden;
    @Column(name = "EinrichtungsID")
    private Integer einrichtungsID;
    @Size(max = 255)
    @Column(name = "EinrichtungsName")
    private String einrichtungsname;
    @Size(max = 80)
    @Column(name = "GruppenID")
    private String gruppenID;
    @Size(max = 255)
    @Column(name = "Gruppenname")
    private String gruppenname;
    @Size(max = 250)
    @Column(name = "dl_langtext")
    private String dl_langtext;
    @Size(max = 250)
    @Column(name = "dl_bereich")
    private String dl_bereich;
    @Column(name = "person_id")
    private Integer person_id;
    @Column(name = "intervall_wt")
    private String intervall_wt;
    @Column(name = "intervall_sa")
    private String intervall_sa;
    @Column(name = "intervall_so")
    private String intervall_so;
    @Column(name = "betreuungseinheiten_privat_mf")
    private Double betreuungseinheitenprivatmf;
    @Column(name = "besuche_privat_mf")
    private Short besucheprivatmf;
    @Column(name = "betreuungseinheiten_privat_sa")
    private Double betreuungseinheitenprivatsa;
    @Column(name = "besuche_privat_sa")
    private Short besucheprivatsa;
    @Column(name = "betreuungseinheiten_privat_sofe")
    private Double betreuungseinheitenprivatsofe;
    @Column(name = "besuche_privat_sofe")
    private Short besucheprivatsofe;
    @Column(name = "intervall_privat_mf")
    private String intervall_privat_mf;
    @Column(name = "intervall_privat_sa")
    private String intervall_privat_sa;
    @Column(name = "intervall_privat_sofe")
    private String intervall_privat_sofe;
    @Size(max = 255)
    @Column(name = "mitarbeiter_rabatt")
    private String mitarbeiter_rabatt;
    @Size(max = 255)
    @Column(name = "gemeinde")
    private String gemeinde;
    @Column(name = "monatsbeitragkind")
    private Double monatsbeitragkind;
    @Size(max = 255)
    @Column(name = "verrechnungsstufe")
    private String verrechnungsstufe;
    @Size(max = 255)
    @Column(name = "einrichtungdl")
    private String einrichtungdl;
    @Column(name = "svnr_kind")
    private Long SVNrKind;
    @Column(name = "geburtsdatum_kind")
    @Temporal(TemporalType.DATE)
    private Date geburtsdatumKind;
    @Size(max = 255)
    @Column(name = "GeschwisterRabatt")
    private String GeschwisterRabatt;
    @Column(name = "besuchepwochewt")
    private Short besuche_pro_woche_wt;
    @Column(name = "besuchepwochesa")
    private Short besuche_pro_woche_sa;
    @Column(name = "besuchepwocheso")
    private Short besuche_pro_woche_so;
    @Column(name = "sis_betreuungseinheiten_wt")
    private Double sis_betreuungseinheiten_wt;
    @Column(name = "sis_betreuungseinheiten_sa")
    private Double sis_betreuungseinheiten_sa;
    @Column(name = "sis_betreuungseinheiten_so")
    private Double sis_betreuungseinheiten_so;
    @Column(name = "leimenge_wt")
    private Double leimenge_wt;
    @Column(name = "leimenge_sa")
    private Double leimenge_sa;
    @Column(name = "leimenge_so")
    private Double leimenge_so;
    @Column(name = "wz_wt")
    private Double wz_wt;
    @Column(name = "wz_sa")
    private Double wz_sa;
    @Column(name = "wz_so")
    private Double wz_so;
    @Column(name = "fahrten_wt")
    private Integer fahrten_wt;
    @Column(name = "fahrten_sa")
    private Integer fahrten_sa;
    @Column(name = "fahrten_so")
    private Integer fahrten_so;
    @Column(name = "zusatzstunden_wt")
    private Double zusatzstunden_wt;
    @Column(name = "zusatzstunden_sa")
    private Double zusatzstunden_sa;
    @Column(name = "zusatzstunden_so")
    private Double zusatzstunden_so;
    @Column(name = "bh_nr")
    private Integer bh_nr;    
    @Size(max = 241)
    @Column(name = "Zuname")
    private String zuname;
    @Size(max = 40)
    @Column(name = "Vorname")
    private String vorname;
    @Column(name = "SVNr")
    private Long sVNr;
    @Size(max = 241)
    @Column(name = "aktivflag")
    private String AktivFlag;
    @Size(max = 241)
    @Column(name = "EinrichtungStrasse")
    private String EinrichtungStrasse;
    @Column(name = "EinrichtungPLZ")
    private Integer EinrichtungPLZ;
    @Size(max = 241)
    @Column(name = "EinrichtungOrt")
    private String EinrichtungOrt;
    @Size(max = 241)
    @Column(name = "HandyNr")
    private String HandyNr;
    @Size(max = 241)
    @Column(name = "FestnetzNr")
    private String FestnetzNr;
    @Size(max = 241)
    @Column(name = "Email")
    private String Email;
    @Column(name = "elternbeitragszuschuss_von1")
    @Temporal(TemporalType.DATE)
    private Date elternbeitragszuschuss_von;
    @Column(name = "elternbeitragszuschuss_bis1")
    @Temporal(TemporalType.DATE)
    private Date elternbeitragszuschuss_bis;
    @Column(name = "fruehdienst")
    private String fruehdienst;
    @Column(name = "abenddienst")
    private String abenddienst;
    @Column(name = "mittagsdienst")
    private String mittagsdienst;
    
    
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "pfId",  fetch=FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Einrichtungen> EinrichtungenCollection;*/
    
//    @LazyCollection(LazyCollectionOption.FALSE)
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vt_id")
 //   @Fetch(value = FetchMode.SUBSELECT)
    @Transient
    private Collection<DL13Buchungen> DL13BuchungenCollection;
    
//    @LazyCollection(LazyCollectionOption.FALSE)
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vt_id")
 //   @Fetch(value = FetchMode.SUBSELECT)
    @Transient
    private Collection<DL46Buchungen> DL46BuchungenCollection;
    
//    @LazyCollection(LazyCollectionOption.FALSE)
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vt_id")
   // @Fetch(value = FetchMode.SUBSELECT)
    @Transient
    private Collection<DL46Preise> DL46PreiseCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vtId")
    //@Fetch(value = FetchMode.SUBSELECT)
    private Collection<BetreuungszeitenKinder> BetreuungszeitenKinderCollection;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    //@Fetch(value = FetchMode.SUBSELECT)
    private Collection<FruehSpaet> FruehSpaetCollection;
    
    public Abrechnungsparameter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getKundenID() {
        return kundenID;
    }

    public void setKundenID(Integer kundenID) {
        this.kundenID = kundenID;
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

    public String getAktenzahl() {
        return aktenzahl;
    }

    public void setAktenzahl(String aktenzahl) {
        this.aktenzahl = aktenzahl;
    }

    public Date getEingangsdatum() {
        return eingangsdatum;
    }

    public void setEingangsdatum(Date eingangsdatum) {
        this.eingangsdatum = eingangsdatum;
    }

    public String getBezirkshauptmannschaft() {
        return bezirkshauptmannschaft;
    }

    public void setBezirkshauptmannschaft(String bezirkshauptmannschaft) {
        this.bezirkshauptmannschaft = bezirkshauptmannschaft;
    }

    public Integer getDienstleistung() {
        return dienstleistung;
    }

    public void setDienstleistung(Integer dienstleistung) {
        this.dienstleistung = dienstleistung;
    }

    public Double getStdsatzpg() {
        return stdsatzpg;
    }

    public void setStdsatzpg(Double stdsatzpg) {
        this.stdsatzpg = stdsatzpg;
    }

    public Double getMinelek() {
        return minelek;
    }

    public void setMinelek(Double minelek) {
        this.minelek = minelek;
    }

    public Double getMaxelek() {
        return maxelek;
    }

    public void setMaxelek(Double maxelek) {
        this.maxelek = maxelek;
    }

    public Double getStdsatzek() {
        return stdsatzek;
    }

    public void setStdsatzek(Double stdsatzek) {
        this.stdsatzek = stdsatzek;
    }

    public Double getMaxelpg() {
        return maxelpg;
    }

    public void setMaxelpg(Double maxelpg) {
        this.maxelpg = maxelpg;
    }

    public String getVerrechnungsmodus() {
        return verrechnungsmodus;
    }

    public void setVerrechnungsmodus(String verrechnungsmodus) {
        this.verrechnungsmodus = verrechnungsmodus;
    }

    public String getSozialhilfeempfaenger() {
        return sozialhilfeempfaenger;
    }

    public void setSozialhilfeempfaenger(String sozialhilfeempfaenger) {
        this.sozialhilfeempfaenger = sozialhilfeempfaenger;
    }

    public Double getBetreuungseinheitenWt() {
        return betreuungseinheitenWt;
    }

    public void setBetreuungseinheitenWt(Double betreuungseinheitenWt) {
        this.betreuungseinheitenWt = betreuungseinheitenWt;
    }

    public Short getBesucheWt() {
        return besucheWt;
    }

    public void setBesucheWt(Short besucheWt) {
        this.besucheWt = besucheWt;
    }

    public Double getBetreuungseinheitenSa() {
        return betreuungseinheitenSa;
    }

    public void setBetreuungseinheitenSa(Double betreuungseinheitenSa) {
        this.betreuungseinheitenSa = betreuungseinheitenSa;
    }

    public Short getBesucheSa() {
        return besucheSa;
    }

    public void setBesucheSa(Short besucheSa) {
        this.besucheSa = besucheSa;
    }

    public Double getBetreuungseinheitenSo() {
        return betreuungseinheitenSo;
    }

    public void setBetreuungseinheitenSo(Double betreuungseinheitenSo) {
        this.betreuungseinheitenSo = betreuungseinheitenSo;
    }

    public Short getBesucheSo() {
        return besucheSo;
    }

    public void setBesucheSo(Short besucheSo) {
        this.besucheSo = besucheSo;
    }

    public Date getGemeindeFoerderungvon() {
        return gemeindeFoerderungvon;
    }

    public void setGemeindeFoerderungvon(Date gemeindeFoerderungvon) {
        this.gemeindeFoerderungvon = gemeindeFoerderungvon;
    }

    public Date getGemeindeFoerderungbis() {
        return gemeindeFoerderungbis;
    }

    public void setGemeindeFoerderungbis(Date gemeindeFoerderungbis) {
        this.gemeindeFoerderungbis = gemeindeFoerderungbis;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Double getWochenstunden() {
        return wochenstunden;
    }

    public void setWochenstunden(Double wochenstunden) {
        this.wochenstunden = wochenstunden;
    }

    public Integer getEinrichtungsID() {
        return einrichtungsID;
    }

    public void setEinrichtungsID(Integer einrichtungsID) {
        this.einrichtungsID = einrichtungsID;
    }

    public String getGruppenID() {
        return gruppenID;
    }

    public void setGruppenID(String gruppenID) {
        this.gruppenID = gruppenID;
    }

    public String getGruppenname() {
        return gruppenname;
    }

    public void setGruppenname(String gruppenname) {
        this.gruppenname = gruppenname;
    }

    public String getDl_langtext() {
        return dl_langtext;
    }

    public void setDl_langtext(String dl_langtext) {
        this.dl_langtext = dl_langtext;
    }

    public String getDl_bereich() {
        return dl_bereich;
    }

    public void setDl_bereich(String dl_bereich) {
        this.dl_bereich = dl_bereich;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getIntervall_wt() {
        return intervall_wt;
    }

    public void setIntervall_wt(String intervall_wt) {
        this.intervall_wt = intervall_wt;
    }

    public String getIntervall_sa() {
        return intervall_sa;
    }

    public void setIntervall_sa(String intervall_sa) {
        this.intervall_sa = intervall_sa;
    }

    public String getIntervall_so() {
        return intervall_so;
    }

    public void setIntervall_so(String intervall_so) {
        this.intervall_so = intervall_so;
    }
    
    public Double getBetreuungseinheitenprivatmf() {
        return betreuungseinheitenprivatmf;
    }

    public void setBetreuungseinheitenprivatmf(Double betreuungseinheitenprivatmf) {
        this.betreuungseinheitenprivatmf = betreuungseinheitenprivatmf;
    }

    public Short getBesucheprivatmf() {
        return besucheprivatmf;
    }

    public void setBesucheprivatmf(Short besucheprivatmf) {
        this.besucheprivatmf = besucheprivatmf;
    }

    public Double getBetreuungseinheitenprivatsa() {
        return betreuungseinheitenprivatsa;
    }

    public void setBetreuungseinheitenprivatsa(Double betreuungseinheitenprivatsa) {
        this.betreuungseinheitenprivatsa = betreuungseinheitenprivatsa;
    }

    public Short getBesucheprivatsa() {
        return besucheprivatsa;
    }

    public void setBesucheprivatsa(Short besucheprivatsa) {
        this.besucheprivatsa = besucheprivatsa;
    }

    public Double getBetreuungseinheitenprivatsofe() {
        return betreuungseinheitenprivatsofe;
    }

    public void setBetreuungseinheitenprivatsofe(Double betreuungseinheitenprivatsofe) {
        this.betreuungseinheitenprivatsofe = betreuungseinheitenprivatsofe;
    }

    public Short getBesucheprivatsofe() {
        return besucheprivatsofe;
    }

    public void setBesucheprivatsofe(Short besucheprivatsofe) {
        this.besucheprivatsofe = besucheprivatsofe;
    }

    public String getIntervall_privat_mf() {
        return intervall_privat_mf;
    }

    public void setIntervall_privat_mf(String intervall_privat_mf) {
        this.intervall_privat_mf = intervall_privat_mf;
    }

    public String getIntervall_privat_sa() {
        return intervall_privat_sa;
    }

    public void setIntervall_privat_sa(String intervall_privat_sa) {
        this.intervall_privat_sa = intervall_privat_sa;
    }

    public String getIntervall_privat_sofe() {
        return intervall_privat_sofe;
    }

    public void setIntervall_privat_sofe(String intervall_privat_sofe) {
        this.intervall_privat_sofe = intervall_privat_sofe;
    }
    
    public String getMitarbeiter_rabatt() {
        return mitarbeiter_rabatt;
    }

    public void setMitarbeiter_rabatt(String mitarbeiter_rabatt) {
        this.mitarbeiter_rabatt = mitarbeiter_rabatt;
    }
    
    /*@XmlElementWrapper(name="Einrichtungen")
    @XmlElement(name="Einrichtung")
    public Collection<Einrichtungen> getEinrichtungenCollection() {
        return EinrichtungenCollection;
    }

    public void setEinrichtungenCollection(Collection<Einrichtungen> EinrichtungenCollection) {
        this.EinrichtungenCollection = EinrichtungenCollection;
    }*/

    public String getEinrichtungsname() {
        return einrichtungsname;
    }

    public void setEinrichtungsname(String einrichtungsname) {
        this.einrichtungsname = einrichtungsname;
    }

    public String getGemeinde() {
        return gemeinde;
    }

    public void setGemeinde(String gemeinde) {
        this.gemeinde = gemeinde;
    }

    public Double getMonatsbeitragkind() {
        return monatsbeitragkind;
    }

    public void setMonatsbeitragkind(Double monatsbeitragkind) {
        this.monatsbeitragkind = monatsbeitragkind;
    }

    public String getVerrechnungsstufe() {
        return verrechnungsstufe;
    }

    public void setVerrechnungsstufe(String verrechnungsstufe) {
        this.verrechnungsstufe = verrechnungsstufe;
    }

    public String getEinrichtungdl() {
        return einrichtungdl;
    }

    public void setEinrichtungdl(String einrichtungdl) {
        this.einrichtungdl = einrichtungdl;
    }

    public Long getSVNrKind() {
        return SVNrKind;
    }

    public void setSVNrKind(Long SVNrKind) {
        this.SVNrKind = SVNrKind;
    }

    public Date getGeburtsdatumKind() {
        return geburtsdatumKind;
    }

    public void setGeburtsdatumKind(Date geburtsdatumKind) {
        this.geburtsdatumKind = geburtsdatumKind;
    }

    public String getGeschwisterRabatt() {
        return GeschwisterRabatt;
    }

    public void setGeschwisterRabatt(String GeschwisterRabatt) {
        this.GeschwisterRabatt = GeschwisterRabatt;
    }    

    public Short getBesuche_pro_woche_wt() {
        return besuche_pro_woche_wt;
    }

    public void setBesuche_pro_woche_wt(Short besuche_pro_woche_wt) {
        this.besuche_pro_woche_wt = besuche_pro_woche_wt;
    }

    public Short getBesuche_pro_woche_sa() {
        return besuche_pro_woche_sa;
    }

    public void setBesuche_pro_woche_sa(Short besuche_pro_woche_sa) {
        this.besuche_pro_woche_sa = besuche_pro_woche_sa;
    }

    public Short getBesuche_pro_woche_so() {
        return besuche_pro_woche_so;
    }

    public void setBesuche_pro_woche_so(Short besuche_pro_woche_so) {
        this.besuche_pro_woche_so = besuche_pro_woche_so;
    }

    public Double getSis_betreuungseinheiten_wt() {
        return sis_betreuungseinheiten_wt;
    }

    public void setSis_betreuungseinheiten_wt(Double sis_betreuungseinheiten_wt) {
        this.sis_betreuungseinheiten_wt = sis_betreuungseinheiten_wt;
    }

    public Double getSis_betreuungseinheiten_sa() {
        return sis_betreuungseinheiten_sa;
    }

    public void setSis_betreuungseinheiten_sa(Double sis_betreuungseinheiten_sa) {
        this.sis_betreuungseinheiten_sa = sis_betreuungseinheiten_sa;
    }

    public Double getSis_betreuungseinheiten_so() {
        return sis_betreuungseinheiten_so;
    }

    public void setSis_betreuungseinheiten_so(Double sis_betreuungseinheiten_so) {
        this.sis_betreuungseinheiten_so = sis_betreuungseinheiten_so;
    }

    public Double getLeimenge_wt() {
        return leimenge_wt;
    }

    public void setLeimenge_wt(Double leimenge_wt) {
        this.leimenge_wt = leimenge_wt;
    }

    public Double getLeimenge_sa() {
        return leimenge_sa;
    }

    public void setLeimenge_sa(Double leimenge_sa) {
        this.leimenge_sa = leimenge_sa;
    }

    public Double getLeimenge_so() {
        return leimenge_so;
    }

    public void setLeimenge_so(Double leimenge_so) {
        this.leimenge_so = leimenge_so;
    }

    public Double getWz_wt() {
        return wz_wt;
    }

    public void setWz_wt(Double wz_wt) {
        this.wz_wt = wz_wt;
    }

    public Double getWz_sa() {
        return wz_sa;
    }

    public void setWz_sa(Double wz_sa) {
        this.wz_sa = wz_sa;
    }

    public Double getWz_so() {
        return wz_so;
    }

    public void setWz_so(Double wz_so) {
        this.wz_so = wz_so;
    }

    public Integer getBh_nr() {
        return bh_nr;
    }

    public void setBh_nr(Integer bh_nr) {
        this.bh_nr = bh_nr;
    }    

    public Integer getFahrten_wt() {
        return fahrten_wt;
    }

    public void setFahrten_wt(Integer fahrten_wt) {
        this.fahrten_wt = fahrten_wt;
    }

    public Integer getFahrten_sa() {
        return fahrten_sa;
    }

    public void setFahrten_sa(Integer fahrten_sa) {
        this.fahrten_sa = fahrten_sa;
    }

    public Integer getFahrten_so() {
        return fahrten_so;
    }

    public void setFahrten_so(Integer fahrten_so) {
        this.fahrten_so = fahrten_so;
    }

    public Double getZusatzstunden_wt() {
        return zusatzstunden_wt;
    }

    public void setZusatzstunden_wt(Double zusatzstunden_wt) {
        this.zusatzstunden_wt = zusatzstunden_wt;
    }

    public Double getZusatzstunden_sa() {
        return zusatzstunden_sa;
    }

    public void setZusatzstunden_sa(Double zusatzstunden_sa) {
        this.zusatzstunden_sa = zusatzstunden_sa;
    }

    public Double getZusatzstunden_so() {
        return zusatzstunden_so;
    }

    public void setZusatzstunden_so(Double zusatzstunden_so) {
        this.zusatzstunden_so = zusatzstunden_so;
    }

    public String getZuname() {
        return zuname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Long getsVNr() {
        return sVNr;
    }

    public void setsVNr(Long sVNr) {
        this.sVNr = sVNr;
    }

    public String getAktivFlag() {
        return AktivFlag;
    }

    public void setAktivFlag(String AktivFlag) {
        this.AktivFlag = AktivFlag;
    }

    public String getEinrichtungStrasse() {
        return EinrichtungStrasse;
    }

    public void setEinrichtungStrasse(String EinrichtungStrasse) {
        this.EinrichtungStrasse = EinrichtungStrasse;
    }

    public Integer getEinrichtungPLZ() {
        return EinrichtungPLZ;
    }

    public void setEinrichtungPLZ(Integer EinrichtungPLZ) {
        this.EinrichtungPLZ = EinrichtungPLZ;
    }

    public String getEinrichtungOrt() {
        return EinrichtungOrt;
    }

    public void setEinrichtungOrt(String EinrichtungOrt) {
        this.EinrichtungOrt = EinrichtungOrt;
    }

    public String getHandyNr() {
        return HandyNr;
    }

    public void setHandyNr(String HandyNr) {
        this.HandyNr = HandyNr;
    }

    public String getFestnetzNr() {
        return FestnetzNr;
    }

    public void setFestnetzNr(String FestnetzNr) {
        this.FestnetzNr = FestnetzNr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getElternbeitragszuschuss_von() {
        return elternbeitragszuschuss_von;
    }

    public void setElternbeitragszuschuss_von(Date elternbeitragszuschuss_von) {
        this.elternbeitragszuschuss_von = elternbeitragszuschuss_von;
    }

    public Date getElternbeitragszuschuss_bis() {
        return elternbeitragszuschuss_bis;
    }

    public void setElternbeitragszuschuss_bis(Date elternbeitragszuschuss_bis) {
        this.elternbeitragszuschuss_bis = elternbeitragszuschuss_bis;
    }

    public String getFruehdienst() {
        return fruehdienst;
    }

    public void setFruehdienst(String fruehdienst) {
        this.fruehdienst = fruehdienst;
    }

    public String getAbenddienst() {
        return abenddienst;
    }

    public void setAbenddienst(String abenddienst) {
        this.abenddienst = abenddienst;
    }

    public String getMittagsdienst() {
        return mittagsdienst;
    }

    public void setMittagsdienst(String mittagsdienst) {
        this.mittagsdienst = mittagsdienst;
    }
        
    
    
    @XmlElementWrapper(name="DL13Buchungen")
    @XmlElement(name="DL13Buchung")
    public Collection<DL13Buchungen> getDL13BuchungenCollection() {
        return DL13BuchungenCollection;
    }

    public void setDL13BuchungenCollection(Collection<DL13Buchungen> DL13BuchungenCollection) {
        this.DL13BuchungenCollection = DL13BuchungenCollection;
    }
    
    @XmlElementWrapper(name="DL46Buchungen")
    @XmlElement(name="DL46Buchung")
    public Collection<DL46Buchungen> getDL46BuchungenCollection() {
        return DL46BuchungenCollection;
    }

    public void setDL46BuchungenCollection(Collection<DL46Buchungen> DL46BuchungenCollection) {
        this.DL46BuchungenCollection = DL46BuchungenCollection;
    }

    @XmlElementWrapper(name="DL46Preise")
    @XmlElement(name="DL46Preis")
    public Collection<DL46Preise> getDL46PreiseCollection() {
        return DL46PreiseCollection;
    }

    public void setDL46PreiseCollection(Collection<DL46Preise> DL46PreiseCollection) {
        this.DL46PreiseCollection = DL46PreiseCollection;
    }      

    @XmlElementWrapper(name="BetreuungszeitenKinder")
    @XmlElement(name="BetreuungszeitenKind")
    public Collection<BetreuungszeitenKinder> getBetreuungszeitenKinderCollection() {
        return BetreuungszeitenKinderCollection;
    }

    public void setBetreuungszeitenKinderCollection(Collection<BetreuungszeitenKinder> BetreuungszeitenKinderCollection) {
        this.BetreuungszeitenKinderCollection = BetreuungszeitenKinderCollection;
    }

    @XmlElementWrapper(name="FruehSpaetBetreuung")
    @XmlElement(name="FruehSpaet")
    public Collection<FruehSpaet> getFruehSpaetCollection() {
        return FruehSpaetCollection;
    }

    public void setFruehSpaetCollection(Collection<FruehSpaet> FruehSpaetCollection) {
        this.FruehSpaetCollection = FruehSpaetCollection;
    }   
}
