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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "HaisDoc", catalog = "hais_doc", schema = "hais")
@XmlRootElement(name="HaisDoc")
@NamedQueries({
    @NamedQuery(name = "HaisDoc.findAll", query = "SELECT h FROM HaisDoc h"),
@NamedQuery(name = "HaisDoc.findPartner", query = "SELECT h FROM HaisDoc h WHERE h.periode between :periodeVon AND :periodeBis  AND h.typ IN ('KDN-LEISTG','KDN-RECHG') AND h.partnerIdKunde = :id_kunde order by h.periode")})
public class HaisDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "periode")
    private Integer periode;
    @Column(name = "partner_id_mitarbeiter")
    private Integer partnerIdMitarbeiter;
    @Size(max = 143)
    @Column(name = "Mitarbeiter")
    private String mitarbeiter;
    @Column(name = "partner_id_kunde")
    private Integer partnerIdKunde;
    @Size(max = 143)
    @Column(name = "Kunde")
    private String kunde;
    @Size(max = 10)
    @Column(name = "doctyp")
    private String doctyp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "typ")
    private String typ;
    @Transient
    private String periodeT;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "filename_original")
    private String filename_original;

    public HaisDoc() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @XmlElement(name="periodeT")
    public String getperiodeT(){
        String help;
        int help2;
        String monat;
        String jahr;
        String periode2;
        
        help=periode.toString();
        monat=help.substring(4);
        jahr=help.substring(0,4);
        help2=Integer.parseInt(monat);
        
        switch (help2) {
            case 1:  monat = "Jänner";
                     break;
            case 2:  monat = "Februar";
                     break;
            case 3:  monat = "März";
                     break;
            case 4:  monat = "April";
                     break;
            case 5:  monat = "Mai";
                     break;
            case 6:  monat = "Juni";
                     break;
            case 7:  monat = "Juli";
                     break;
            case 8:  monat = "August";
                     break;
            case 9:  monat = "September";
                     break;
            case 10: monat = "Oktober";
                     break;
            case 11: monat = "November";
                     break;
            case 12: monat = "Dezember";
                     break;
            default: monat = "Invalid month";
                     break;
        }
        periode2=monat + " " + jahr;
        
        return periode2;
    }

    public Integer getPeriode() {
        return periode;
    }

    public void setPeriode(Integer periode) {
        this.periode = periode;
    }

    public Integer getPartnerIdMitarbeiter() {
        return partnerIdMitarbeiter;
    }

    public void setPartnerIdMitarbeiter(Integer partnerIdMitarbeiter) {
        this.partnerIdMitarbeiter = partnerIdMitarbeiter;
    }

    public String getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(String mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public Integer getPartnerIdKunde() {
        return partnerIdKunde;
    }

    public void setPartnerIdKunde(Integer partnerIdKunde) {
        this.partnerIdKunde = partnerIdKunde;
    }

    public String getKunde() {
        return kunde;
    }

    public void setKunde(String kunde) {
        this.kunde = kunde;
    }

    public String getDoctyp() {
        return doctyp;
    }

    public void setDoctyp(String doctyp) {
        this.doctyp = doctyp;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getFilename_original() {
        return filename_original;
    }

    public void setFilename_original(String filename_original) {
        this.filename_original = filename_original;
    }
    
}
