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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "Kundenaktiv", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kundenaktiv.findAll", query = "SELECT k FROM Kundenaktiv k")
    , @NamedQuery(name = "Kundenaktiv.findByKundenID", query = "SELECT k FROM Kundenaktiv k WHERE k.kundenID = :kundenID")
    , @NamedQuery(name = "Kundenaktiv.findByZuname", query = "SELECT k FROM Kundenaktiv k WHERE k.zuname = :zuname")
    , @NamedQuery(name = "Kundenaktiv.findByVorname", query = "SELECT k FROM Kundenaktiv k WHERE k.vorname = :vorname")
    , @NamedQuery(name = "Kundenaktiv.findBySvnr", query = "SELECT k FROM Kundenaktiv k WHERE k.svnr = :svnr")
    , @NamedQuery(name = "Kundenaktiv.findByBHNr", query = "SELECT k FROM Kundenaktiv k WHERE k.bhnr IN :bhnr")
    , @NamedQuery(name = "Kundenaktiv.findByaktenzahl", query = "SELECT k FROM Kundenaktiv k WHERE k.aktenzahl = :aktenzahl")
    , @NamedQuery(name = "Kundenaktiv.findBypersonen_id", query = "SELECT k FROM Kundenaktiv k WHERE k.personen_id = :personen_id")})
public class Kundenaktiv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "kundenID")
    private int kundenID;
    @Size(max = 40)
    @Column(name = "zuname")
    private String zuname;
    @Size(max = 40)
    @Column(name = "vorname")
    private String vorname;
    @Size(max = 19)
    @Column(name = "svnr_")
    private String svnr;
    @Column(name = "bhnr_")
    private Integer bhnr;
    @Column(name = "aktenzahl_")
    private String aktenzahl;
    @Column(name = "personen_id_")
    private String personen_id;
    @Column(name = "dienstleistungen_")
    private String dienstleistungen;

    public Kundenaktiv() {
    }

    public int getKundenID() {
        return kundenID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
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

    public String getSvnr() {
        return svnr;
    }

    public void setSvnr(String svnr) {
        this.svnr = svnr;
    }

    public Integer getBhnr() {
        return bhnr;
    }

    public void setBhnr(Integer bhnr) {
        this.bhnr = bhnr;
    }

    public String getAktenzahl() {
        return aktenzahl;
    }

    public void setAktenzahl(String aktenzahl) {
        this.aktenzahl = aktenzahl;
    }

    public String getPersonen_id() {
        return personen_id;
    }

    public void setPersonen_id(String personen_id) {
        this.personen_id = personen_id;
    }

    public String getDienstleistungen() {
        return dienstleistungen;
    }

    public void setDienstleistungen(String dienstleistungen) {
        this.dienstleistungen = dienstleistungen;
    }
    
    
    
}
