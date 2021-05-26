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
@Table(name = "Einrichtungen", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Einrichtungen.findAll", query = "SELECT e FROM Einrichtungen e")})
public class Einrichtungen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "pf_id")
    private int pfId;
    @Size(max = 200)
    @Column(name = "firmenbezeichnung")
    private String firmenbezeichnung;
    @Size(max = 60)
    @Column(name = "strasse")
    private String strasse;
    @Size(max = 10)
    @Column(name = "plz")
    private String plz;
    @Size(max = 40)
    @Column(name = "ort")
    private String ort;
    @Column(name = "sozialstation")
    private Integer sozialstation;
    @Size(max = 255)
    @Column(name = "Oeffnungszeiten")
    private String oeffnungszeiten;
    @Column(name = "Oeffnungszeitenvon")
    @Temporal(TemporalType.DATE)
    private Date oeffnungszeitenvon;
    @Column(name = "Oeffnungszeitenbis")
    @Temporal(TemporalType.DATE)
    private Date oeffnungszeitenbis;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kundenID")
//    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<DLStatus> DLStatusCollection;
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partnerID")
  //  @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Comdaten> ComdatenCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pfId")
   // @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Kindergruppen> KindergruppenCollection;
    
    public Einrichtungen() {
    }

    public int getPfId() {
        return pfId;
    }

    public void setPfId(int pfId) {
        this.pfId = pfId;
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

    public Integer getSozialstation() {
        return sozialstation;
    }

    public void setSozialstation(Integer sozialstation) {
        this.sozialstation = sozialstation;
    }

    public String getOeffnungszeiten() {
        /*if(oeffnungszeiten.contains(System.getProperty("line.separator"))){
            oeffnungszeiten=oeffnungszeiten.replaceAll(System.getProperty("line.separator"), "<br/>");
        }else{
            oeffnungszeiten=oeffnungszeiten;
        }
        if(oeffnungszeiten.length()>1){
            oeffnungszeiten=oeffnungszeiten.replace("\r\n", "<br/>");
        }*/
        return oeffnungszeiten;
    }

    public void setOeffnungszeiten(String oeffnungszeiten) {
        this.oeffnungszeiten = oeffnungszeiten;
    }

    public Date getOeffnungszeitenvon() {
        return oeffnungszeitenvon;
    }

    public void setOeffnungszeitenvon(Date oeffnungszeitenvon) {
        this.oeffnungszeitenvon = oeffnungszeitenvon;
    }

    public Date getOeffnungszeitenbis() {
        return oeffnungszeitenbis;
    }

    public void setOeffnungszeitenbis(Date oeffnungszeitenbis) {
        this.oeffnungszeitenbis = oeffnungszeitenbis;
    }

    @XmlElementWrapper(name="DienstleistungsStati")
    @XmlElement(name="DienstleistungsStatus") 
    public Collection<DLStatus> getDLStatusCollection() {
        return DLStatusCollection;
    }

    public void setDLStatusCollection(Collection<DLStatus> DLStatusCollection) {
        this.DLStatusCollection = DLStatusCollection;
    }
    
    @XmlElementWrapper(name="ComDaten")
    @XmlElement(name="ComKontakt")     
    public Collection<Comdaten> getComdatenCollection() {
        return ComdatenCollection;
    }

    public void setComdatenCollection(Collection<Comdaten> ComdatenCollection) {
        this.ComdatenCollection = ComdatenCollection;
    }

    @XmlElementWrapper(name="Kindergruppen")
    @XmlElement(name="Kindergruppe")
    public Collection<Kindergruppen> getKindergruppenCollection() {
        return KindergruppenCollection;
    }

    public void setKindergruppenCollection(Collection<Kindergruppen> KindergruppenCollection) {
        this.KindergruppenCollection = KindergruppenCollection;
    }
    
    
    
}
