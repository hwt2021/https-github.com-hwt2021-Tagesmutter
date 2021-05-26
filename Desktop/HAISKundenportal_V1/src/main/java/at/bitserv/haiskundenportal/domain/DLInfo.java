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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "DLInfo", catalog = "hais_lgs", schema = "hais")
@XmlRootElement(name="DLInfo")
@NamedQueries({
    @NamedQuery(name = "DLInfo.findAll", query = "SELECT d FROM DLInfo d")})
public class DLInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id_dienstleistung")
    private int idDienstleistung;
    @Size(max = 200)
    @Column(name = "dl_bezeichnung_lang")
    private String dlBezeichnungLang;
    @Size(max = 200)
    @Column(name = "dl_bereich")
    private String dlBereich;
    @Column(name = "bereich")
    private String bereich;
    
    public DLInfo() {
    }

    public int getIdDienstleistung() {
        return idDienstleistung;
    }

    public void setIdDienstleistung(int idDienstleistung) {
        this.idDienstleistung = idDienstleistung;
    }

    public String getDlBezeichnungLang() {
        return dlBezeichnungLang;
    }

    public void setDlBezeichnungLang(String dlBezeichnungLang) {
        this.dlBezeichnungLang = dlBezeichnungLang;
    }

    public String getDlBereich() {
        return dlBereich;
    }

    public void setDlBereich(String dlBereich) {
        this.dlBereich = dlBereich;
    }

    public String getBereich() {
        return bereich;
    }

    public void setBereich(String bereich) {
        this.bereich = bereich;
    }  
}

