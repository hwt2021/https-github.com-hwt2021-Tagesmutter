/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manfred
 */
@Entity
@Table(name = "SozialesNetz",  schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SozialesNetz.findAll", query = "SELECT s FROM SozialesNetz s")})
public class SozialesNetz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 80)
    @Column(name = "Funktion")
    private String funktion;
    @Size(max = 281)
    @Column(name = "juristische_person")
    private String juristischePerson;
    @Size(max = 40)
    @Column(name = "zuname")
    private String zuname;
    @Size(max = 40)
    @Column(name = "vorname")
    private String vorname;
    @Size(max = 20)
    @Column(name = "anrede")
    private String anrede;
    @Size(max = 40)
    @Column(name = "erworbener_titel")
    private String erworbenerTitel;
    @Size(max = 5000)
    @Column(name = "bemerkung")
    private String bemerkung;
    @Size(max = 60)
    @Column(name = "strasse")
    private String strasse;
    @Size(max = 10)
    @Column(name = "plz")
    private String plz;
    @Size(max = 40)
    @Column(name = "ort")
    private String ort;
    @Column(name = "wichtigste")
    private Character wichtigste;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "tel")
    private String tel;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Lob
    @Size(max = 2147483647)
    @Column(name = "e_mail")
    private String eMail;
    @Column(name = "abholberechitgt")
    private Character abholberechitgt;
    @Column(name = "kindid")
    private Integer kindid;
    @Size(max = 80)
    @Column(name = "Kind")
    private String kind;
    @Column(name = "dl64_kontaktperson")
    private Character dl64Kontaktperson;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PartnerID")
    private int partnerID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KundenID")
    private int kundenID;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;

    public SozialesNetz() {
    }

    public String getFunktion() {
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    public String getJuristischePerson() {
        return juristischePerson;
    }

    public void setJuristischePerson(String juristischePerson) {
        this.juristischePerson = juristischePerson;
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

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getErworbenerTitel() {
        return erworbenerTitel;
    }

    public void setErworbenerTitel(String erworbenerTitel) {
        this.erworbenerTitel = erworbenerTitel;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @XmlElement(name ="email")
    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Character getAbholberechitgt() {
        return abholberechitgt;
    }

    public void setAbholberechitgt(Character abholberechitgt) {
        this.abholberechitgt = abholberechitgt;
    }

    public Integer getKindid() {
        return kindid;
    }

    public void setKindid(Integer kindid) {
        this.kindid = kindid;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Character getDl64Kontaktperson() {
        return dl64Kontaktperson;
    }

    public void setDl64Kontaktperson(Character dl64Kontaktperson) {
        this.dl64Kontaktperson = dl64Kontaktperson;
    }

    public int getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(int partnerID) {
        this.partnerID = partnerID;
    }

    public int getKundenID() {
        return kundenID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
