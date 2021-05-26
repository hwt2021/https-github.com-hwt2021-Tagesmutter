/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
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
import javax.persistence.OrderBy;
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
 * @author Manfred
 */
@Entity
@Table(name = "Partner", schema = "hais")
@XmlRootElement(name = "Partner")
@NamedQueries({
    @NamedQuery(name = "Partner.findAll", query = "SELECT p FROM Partner p")})
public class Partner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "PartnerId")
    private int partnerId;
    @Size(max = 241)
    @Column(name = "Zuname")
    private String zuname;
    @Size(max = 40)
    @Column(name = "Vorname")
    private String vorname;
    @Size(max = 200)
    @Column(name = "Firmenbezeichnung")
    private String firmenbezeichnung;
    @Size(max = 60)
    @Column(name = "Strasse")
    private String strasse;
    @Size(max = 10)
    @Column(name = "PLZ")
    private String plz;
    @Size(max = 40)
    @Column(name = "Ort")
    private String ort;
    @Column(name = "fsz")
    private Integer fsz;
    @Size(max = 20)
    @Column(name = "anrede")
    private String anrede;
    @Size(max = 40)
    @Column(name = "titel_vor_namen")
    private String titelVorNamen;
    @Size(max = 20)
    @Column(name = "titel_nach_namen")
    private String titelNachNamen;
    @Column(name = "SVNr")
    private Long sVNr;
    @Size(max = 40)
    @Column(name = "Sozialversicherung")
    private String sozialversicherung;
    @Column(name = "geburtsdatum")
    @Temporal(TemporalType.DATE)
    private Date geburtsdatum;
    @Column(name = "eintritt_Kunde")
    @Temporal(TemporalType.DATE)
    private Date eintrittKunde;
    @Column(name = "eintritt_Mitarbeiter")
    @Temporal(TemporalType.DATE)
    private Date eintrittMitarbeiter;
    @Size(max = 30)
    @Column(name = "Staatsbuergerschaft")
    private String staatsbuergerschaft;
    @Size(max = 10)
    @Column(name = "Familienstand")
    private String familienstand;
    @Size(max = 10)
    @Column(name = "Religion")
    private String religion;
    @Size(max = 200)
    @Column(name = "Gemeinde")
    private String gemeinde;
    @Size(max = 250)
    @Column(name = "Wohnungszugang_vertraulich")
    private String wohnungszugangvertraulich;
    @Column(name = "PGstufe")
    private Integer pgstufe;
    @Column(name = "PGgueltig_ab")
    @Temporal(TemporalType.DATE)
    private Date pggueltig_ab;
    @Column(name = "PGgueltig_bis")
    @Temporal(TemporalType.DATE)
    private Date pggueltig_bis;
    @Size(max = 200)
    @Column(name = "peradresse")
    private String peradresse;
   // @Column(name = "letzte_dl_beendigung_Kunde") // ToDo Delete
   // @Temporal(TemporalType.DATE)
   // private Date beendigung;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
//    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<SozialesNetz> SozialesNetzCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
    //  @Fetch(value = FetchMode.SUBSELECT)
    private Collection<BetreuungsTeam> BetreuungsTeamCollection;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
    //  @Fetch(value = FetchMode.SUBSELECT)
    private Collection<STVBetreuungsTeam> STVBetreuungsTeamCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
    //@Fetch(value = FetchMode.SUBSELECT)
    private Collection<DLStatus> DLStatusCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partnerID")
    //@Fetch(value = FetchMode.SUBSELECT)
    private Collection<Comdaten> ComdatenCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
    @OrderBy("jahr asc, monat asc, tag asc, zvon asc")
    //@Fetch(value = FetchMode.SUBSELECT)
    private Collection<BetreuungsZeitenkurz> BetreuungsZeitenkurzCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
    @OrderBy("plandaten asc")
//    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Plandaten> PlandatenCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
    //  @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Abrechnungsparameter> AbrechnungsparameterCollection;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
//    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<BereichsleitungK> BereichsleitungKCollection;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
//    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Kinder> KinderCollection;    
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
//    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<SozialesNetzKind> SozialesNetzKindCollection;
    

    public Partner() {
    }

    public int getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
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

    public String getFirmenbezeichnung() {
        return firmenbezeichnung;
    }

    public void setFirmenbezeichnung(String firmenbezeichnung) {
        this.firmenbezeichnung = firmenbezeichnung;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Integer getFsz() {
        return fsz;
    }

    public void setFsz(Integer fsz) {
        this.fsz = fsz;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getTitelVorNamen() {
        return titelVorNamen;
    }

    public void setTitelVorNamen(String titelVorNamen) {
        this.titelVorNamen = titelVorNamen;
    }

    public String getTitelNachNamen() {
        return titelNachNamen;
    }

    public void setTitelNachNamen(String titelNachNamen) {
        this.titelNachNamen = titelNachNamen;
    }

    @XmlElement(name = "svnr")
    public Long getSVNr() {
        return sVNr;
    }

    public void setSVNr(Long sVNr) {
        this.sVNr = sVNr;
    }

    public String getSozialversicherung() {
        return sozialversicherung;
    }

    public void setSozialversicherung(String sozialversicherung) {
        this.sozialversicherung = sozialversicherung;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Date getEintrittKunde() {
        return eintrittKunde;
    }

    public void setEintrittKunde(Date eintrittKunde) {
        this.eintrittKunde = eintrittKunde;
    }

    public Date getEintrittMitarbeiter() {
        return eintrittMitarbeiter;
    }

    public void setEintrittMitarbeiter(Date eintrittMitarbeiter) {
        this.eintrittMitarbeiter = eintrittMitarbeiter;
    }

    public String getStaatsbuergerschaft() {
        return staatsbuergerschaft;
    }

    public void setStaatsbuergerschaft(String staatsbuergerschaft) {
        this.staatsbuergerschaft = staatsbuergerschaft;
    }

    public String getGemeinde() {
        return gemeinde;
    }

    public void setGemeinde(String gemeinde) {
        this.gemeinde = gemeinde;
    }

    public Integer getPgstufe() {
        return pgstufe;
    }

    public void setPgstufe(Integer pgstufe) {
        this.pgstufe = pgstufe;
    }

    public Date getPggueltig_ab() {
        return pggueltig_ab;
    }

    public void setPggueltig_ab(Date pggueltig_ab) {
        this.pggueltig_ab = pggueltig_ab;
    }

    public Date getPggueltig_bis() {
        return pggueltig_bis;
    }

    public void setPggueltig_bis(Date pggueltig_bis) {
        this.pggueltig_bis = pggueltig_bis;
    }

    public String getPeradresse() {
        return peradresse;
    }

    public void setPeradresse(String peradresse) {
        this.peradresse = peradresse;
    }

   /* public Date getBeendigung() {
        return beendigung;
    }

    public void setBeendigung(Date beendigung) {
        this.beendigung = beendigung;
    }
   */
    @XmlElementWrapper(name = "SozialesNetz")
    @XmlElement(name = "SozialKontakt")
    public Collection<SozialesNetz> getSozialesNetzCollection() {
        return SozialesNetzCollection;
    }

    public void setSozialesNetzCollection(Collection<SozialesNetz> SozialesNetzCollection) {
        this.SozialesNetzCollection = SozialesNetzCollection;
    }

    @XmlElementWrapper(name = "ComDaten")
    @XmlElement(name = "ComKontakt")
    public Collection<Comdaten> getComdatenCollection() {
        return ComdatenCollection;
    }

    public void setComdatenCollection(Collection<Comdaten> ComdatenCollection) {
        this.ComdatenCollection = ComdatenCollection;
    }

    @XmlElementWrapper(name = "BetreuungsZeitenHAIS")
    @XmlElement(name = "Betreuung")
    public Collection<BetreuungsZeitenkurz> getBetreuungsZeitenkurzCollection() {
        return BetreuungsZeitenkurzCollection;
    }

    public void setBetreuungsZeitenkurzCollection(Collection<BetreuungsZeitenkurz> BetreuungsZeitenkurzCollection) {
        this.BetreuungsZeitenkurzCollection = BetreuungsZeitenkurzCollection;
    }

    @XmlElementWrapper(name = "GeplanteBetreuungenMocca")
    @XmlElement(name = "GeplanteBetreuung")
    public Collection<Plandaten> getPlandatenCollection() {
        return PlandatenCollection;
    }

    public void setPlandatenCollection(Collection<Plandaten> PlandatenCollection) {
        this.PlandatenCollection = PlandatenCollection;
    }

    @XmlElementWrapper(name = "DienstleistungsStati")
    @XmlElement(name = "DienstleistungsStatus")
    public Collection<DLStatus> getDLStatusCollection() {
        return DLStatusCollection;
    }

    public void setDLStatusCollection(Collection<DLStatus> DLStatusCollection) {
        this.DLStatusCollection = DLStatusCollection;
    }

    @XmlElementWrapper(name = "BetreuungsTeam")
    @XmlElement(name = "BetreuungsTeamKontakt")
    public Collection<BetreuungsTeam> getBetreuungsTeamCollection() {
        return BetreuungsTeamCollection;
    }

    public void setBetreuungsTeamCollection(Collection<BetreuungsTeam> BetreuungsTeamCollection) {
        this.BetreuungsTeamCollection = BetreuungsTeamCollection;
    }
    
    @XmlElementWrapper(name = "STVBetreuungsTeam")
    @XmlElement(name = "STVBetreuungsTeamKontakt")
    public Collection<STVBetreuungsTeam> getSTVBetreuungsTeamCollection() {
        return STVBetreuungsTeamCollection;
    }

    public void setSTVBetreuungsTeamCollection(Collection<STVBetreuungsTeam> STVBetreuungsTeamCollection) {
        this.STVBetreuungsTeamCollection = STVBetreuungsTeamCollection;
    }

    @XmlElementWrapper(name = "Abrechnungsparameter")
    @XmlElement(name = "AbrechnungsparameterDL")
    public Collection<Abrechnungsparameter> getAbrechnungsparameterCollection() {
        String DLs="";
        Collection<Abrechnungsparameter> ap2delete = new ArrayList();
        for(Abrechnungsparameter ap : AbrechnungsparameterCollection){
            if(ap.getGueltigVon().after(Calendar.getInstance().getTime())){
                ap2delete.add(ap);
            }else{
                if(DLs.contains(ap.getDienstleistung().toString())){
                    ap2delete.add(ap);
                }else{
                    DLs+=ap.getDienstleistung().toString();
                }
            }
        }
        AbrechnungsparameterCollection.removeAll(ap2delete);
        return AbrechnungsparameterCollection;
    }

    public void setAbrechnungsparameterCollection(Collection<Abrechnungsparameter> AbrechnungsparameterCollection) {
        this.AbrechnungsparameterCollection = AbrechnungsparameterCollection;
    }

    @XmlElementWrapper(name = "Bereichsleitung")
    @XmlElement(name = "BereichsleitungDL")
    public Collection<BereichsleitungK> getBereichsleitungKCollection() {
        return BereichsleitungKCollection;
    }

    public void setBereichsleitungKCollection(Collection<BereichsleitungK> BereichsleitungKCollection) {
        this.BereichsleitungKCollection = BereichsleitungKCollection;
    }
    
    @XmlElementWrapper(name = "Kinder")
    @XmlElement(name = "Kind")
    public Collection<Kinder> getKinderCollection() {
        return KinderCollection;
    }

    public void setKinderCollection(Collection<Kinder> KinderCollection) {
        this.KinderCollection = KinderCollection;
    }

    @XmlElementWrapper(name = "SozialesNetzKind")
    @XmlElement(name = "SozialKontaktKind")
    public Collection<SozialesNetzKind> getSozialesNetzKindCollection() {
        return SozialesNetzKindCollection;
    }

    public void setSozialesNetzKindCollection(Collection<SozialesNetzKind> SozialesNetzKindCollection) {
        this.SozialesNetzKindCollection = SozialesNetzKindCollection;
    }

}
