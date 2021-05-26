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
 * @author Manfred
 */
@Entity
@Table(name = "DLStatus",   schema = "hais")
@XmlRootElement

public class DLStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KundenID")
    private int kundenID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dienstleistung")
    private int dienstleistung;
    @Size(max = 250)
    @Column(name = "Verantwortlicher")
    private String verantwortlicher;
    @Size(max = 250)
    @Column(name = "haupt_dl")
    private String hauptDl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "beginn")
    @Temporal(TemporalType.DATE)
    private Date beginn;
    @Column(name = "ende")
    @Temporal(TemporalType.DATE)
    private Date ende;
    @Column(name = "id_kostenstelle")
    private Integer idKostenstelle;
    @Size(max = 250)
    @Column(name = "dl_langtext")
    private String dl_langtext;
    @Size(max = 250)
    @Column(name = "dl_bereich")
    private String dl_bereich;

    public DLStatus() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKundenID() {
        return kundenID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
    }

    public int getDienstleistung() {
        return dienstleistung;
    }

    public void setDienstleistung(int dienstleistung) {
        this.dienstleistung = dienstleistung;
    }

    public String getVerantwortlicher() {
        return verantwortlicher;
    }

    public void setVerantwortlicher(String verantwortlicher) {
        this.verantwortlicher = verantwortlicher;
    }

    public String getHauptDl() {
        return hauptDl;
    }

    public void setHauptDl(String hauptDl) {
        this.hauptDl = hauptDl;
    }

    public Date getBeginn() {
        return beginn;
    }

    public void setBeginn(Date beginn) {
        this.beginn = beginn;
    }

    public Date getEnde() {
        return ende;
    }

    public void setEnde(Date ende) {
        this.ende = ende;
    }

    public Integer getIdKostenstelle() {
        return idKostenstelle;
    }

    public void setIdKostenstelle(Integer idKostenstelle) {
        this.idKostenstelle = idKostenstelle;
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
    
}
