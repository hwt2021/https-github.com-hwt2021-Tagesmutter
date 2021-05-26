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
 * @author h.singh
 */
@Entity
@Table(name = "DL46_Buchungen", catalog = "hais_lgs", schema = "hais")
@NamedQueries({
    @NamedQuery(name = "DL46Buchungen.findAll", query = "SELECT d FROM DL46Buchungen d")
    , @NamedQuery(name = "DL46Buchungen.findByVTid", query = "SELECT d FROM DL46Buchungen d where d.vt_id = :vt_id")})
@XmlRootElement(name="DL46Buchung")
public class DL46Buchungen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Id
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "vt_id")
    private Integer vt_id;
    @Column(name = "kundenID")
    private Integer kundenID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Size(max = 10)
    @Column(name = "frueh")
    private String frueh;
    @Size(max = 20)
    @Column(name = "frueh_spezial")
    private String fruehSpezial;
    @Size(max = 255)
    @Column(name = "frueh_notiz")
    private String fruehNotiz;
    @Size(max = 10)
    @Column(name = "mittag")
    private String mittag;
    @Size(max = 10)
    @Column(name = "mittag2")
    private String mittag2;
    @Size(max = 20)
    @Column(name = "mittag_spezial")
    private String mittagSpezial;
    @Size(max = 255)
    @Column(name = "mittag_notiz")
    private String mittagNotiz;
    @Size(max = 15)
    @Column(name = "portionsgroesse")
    private String portionsgroesse;
    @Size(max = 10)
    @Column(name = "abend")
    private String abend;
    @Size(max = 10)
    @Column(name = "abend2")
    private String abend2;
    @Size(max = 20)
    @Column(name = "abend_spezial")
    private String abendSpezial;
    @Size(max = 255)
    @Column(name = "abend_notiz")
    private String abendNotiz;

    public DL46Buchungen() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getVt_id() {
        return vt_id;
    }

    public void setVt_id(Integer vt_id) {
        this.vt_id = vt_id;
    }

    public Integer getKundenID() {
        return kundenID;
    }

    public void setKundenID(Integer kundenID) {
        this.kundenID = kundenID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getFrueh() {
        return frueh;
    }

    public void setFrueh(String frueh) {
        this.frueh = frueh;
    }

    public String getFruehSpezial() {
        return fruehSpezial;
    }

    public void setFruehSpezial(String fruehSpezial) {
        this.fruehSpezial = fruehSpezial;
    }

    public String getFruehNotiz() {
        return fruehNotiz;
    }

    public void setFruehNotiz(String fruehNotiz) {
        this.fruehNotiz = fruehNotiz;
    }

    public String getMittag() {
        return mittag;
    }

    public void setMittag(String mittag) {
        this.mittag = mittag;
    }

    public String getMittag2() {
        return mittag2;
    }

    public void setMittag2(String mittag2) {
        this.mittag2 = mittag2;
    }

    public String getMittagSpezial() {
        return mittagSpezial;
    }

    public void setMittagSpezial(String mittagSpezial) {
        this.mittagSpezial = mittagSpezial;
    }

    public String getMittagNotiz() {
        return mittagNotiz;
    }

    public void setMittagNotiz(String mittagNotiz) {
        this.mittagNotiz = mittagNotiz;
    }

    public String getPortionsgroesse() {
        return portionsgroesse;
    }

    public void setPortionsgroesse(String portionsgroesse) {
        this.portionsgroesse = portionsgroesse;
    }

    public String getAbend() {
        return abend;
    }

    public void setAbend(String abend) {
        this.abend = abend;
    }

    public String getAbend2() {
        return abend2;
    }

    public void setAbend2(String abend2) {
        this.abend2 = abend2;
    }

    public String getAbendSpezial() {
        return abendSpezial;
    }

    public void setAbendSpezial(String abendSpezial) {
        this.abendSpezial = abendSpezial;
    }

    public String getAbendNotiz() {
        return abendNotiz;
    }

    public void setAbendNotiz(String abendNotiz) {
        this.abendNotiz = abendNotiz;
    }
    
}
