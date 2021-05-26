/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "FSZ", catalog = "hais_lgs", schema = "hais")
@XmlRootElement(name="FSZ")
@NamedQueries({
    @NamedQuery(name = "Fsz.findAll", query = "SELECT f FROM Fsz f")})
public class Fsz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 200)
    @Column(name = "firmenbezeichnung")
    private String firmenbezeichnung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pf_id")
    private int pfId;
    @Size(max = 60)
    @Column(name = "strasse")
    private String strasse;
    @Size(max = 10)
    @Column(name = "plz")
    private String plz;
    @Size(max = 40)
    @Column(name = "ort")
    private String ort;
    @Size(max = 255)
    @Column(name = "oeffnungszeiten")
    private String oeffnungszeiten;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "MitarbeiterID")
    private String mitarbeiterID;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Name")
    private String name;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "tel")
    private String tel;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Lob
    @Size(max = 2147483647)
    @Column(name = "e_mail")
    private String eMail;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Dienstleistungen")
    private String dienstleistungen;
    @Id
    @Column(name = "sozialstation")
    private Integer sozialstation;
    @Transient
    private String firmenbezeichnung2;
    
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sozialstation")
  //  @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Einrichtungen> EinrichtungenCollection;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sozialstation")
   // @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Bereichsleitung> BereichsleitungCollection;
    
    public Fsz() {
    }

    public String getFirmenbezeichnung() {
        firmenbezeichnung=firmenbezeichnung.replace(", ","<br/>");
        return firmenbezeichnung;
    }
    
    public void setFirmenbezeichnung(String firmenbezeichnung) {
        this.firmenbezeichnung = firmenbezeichnung;
    }
    
    @XmlElement(name="firmenbezeichnung2")
    public String getFirmenbezeichnung2() {
        firmenbezeichnung2=firmenbezeichnung.replace("<br/>"," ");
        return firmenbezeichnung2;
    }

    public int getPfId() {
        return pfId;
    }

    public void setPfId(int pfId) {
        this.pfId = pfId;
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

    public String getOeffnungszeiten() {
        oeffnungszeiten=oeffnungszeiten.replaceAll(System.getProperty("line.separator"), "<br/>");
        return oeffnungszeiten;
    }

    public void setOeffnungszeiten(String oeffnungszeiten) {
        this.oeffnungszeiten = oeffnungszeiten;
    }

    public String getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(String mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDienstleistungen() {
        return dienstleistungen;
    }

    public void setDienstleistungen(String dienstleistungen) {
        this.dienstleistungen = dienstleistungen;
    }

    public Integer getSozialstation() {
        return sozialstation;
    }

    public void setSozialstation(Integer sozialstation) {
        this.sozialstation = sozialstation;
    }

    @XmlElementWrapper(name="Einrichtungen")
    @XmlElement(name="Einrichtung")
    public Collection<Einrichtungen> getEinrichtungenCollection() {
        return EinrichtungenCollection;
    }

    public void setEinrichtungenCollection(Collection<Einrichtungen> EinrichtungenCollection) {
        this.EinrichtungenCollection = EinrichtungenCollection;
    }
    
    @XmlElementWrapper(name="Bereichsleitungen")
    @XmlElement(name="Bereichsleitung")
    public Collection<Bereichsleitung> getBereichsleitungCollection() {
        return BereichsleitungCollection;
    }

    public void setBereichsleitungCollection(Collection<Bereichsleitung> BereichsleitungCollection) {
        this.BereichsleitungCollection = BereichsleitungCollection;
    }
    
    
    
    
}
