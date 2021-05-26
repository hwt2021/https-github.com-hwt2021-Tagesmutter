/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "DL46_Preise", catalog = "hais_lgs", schema = "hais")
@NamedQueries({
    @NamedQuery(name = "DL46Preise.findAll", query = "SELECT d FROM DL46Preise d")
    , @NamedQuery(name = "DL46Preise.findByVTid", query = "SELECT d FROM DL46Preise d where d.vt_id = :vt_id")})
@XmlRootElement(name="DL46Preis")
public class DL46Preise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Id
    @NotNull
    @Column(name = "id")
    private long id;
    @Column(name = "kundenID")
    private Integer kundenID;
    @Column(name = "vt_id")
    private Integer vt_id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "art_id")
    private int artId;
    @Size(max = 200)
    @Column(name = "langbezeichnung")
    private String langbezeichnung;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "wert4")
    private BigDecimal wert4;
    @Column(name = "pf_id_gemeinde")
    private Integer pfIdGemeinde;
    @Size(max = 10)
    @Column(name = "stufe")
    private String stufe;
    @Size(max = 40)
    @Column(name = "artikel_1")
    private String artikel1;
    @Size(max = 40)
    @Column(name = "gmd")
    private String gmd;

    public DL46Preise() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getKundenID() {
        return kundenID;
    }

    public void setKundenID(Integer kundenID) {
        this.kundenID = kundenID;
    }

    public Integer getVt_id() {
        return vt_id;
    }

    public void setVt_id(Integer vt_id) {
        this.vt_id = vt_id;
    }

    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public String getLangbezeichnung() {
        return langbezeichnung;
    }

    public void setLangbezeichnung(String langbezeichnung) {
        this.langbezeichnung = langbezeichnung;
    }

    public BigDecimal getWert4() {
        return this.wert4;
    }
    
    public void setWert4(BigDecimal wert4) {
        this.wert4 = wert4;
    }

    public Integer getPfIdGemeinde() {
        return pfIdGemeinde;
    }

    public void setPfIdGemeinde(Integer pfIdGemeinde) {
        this.pfIdGemeinde = pfIdGemeinde;
    }

    public String getStufe() {
        return stufe;
    }

    public void setStufe(String stufe) {
        this.stufe = stufe;
    }

    public String getArtikel1() {
        return artikel1;
    }

    public void setArtikel1(String artikel1) {
        this.artikel1 = artikel1;
    }

    public String getGmd() {
        return gmd;
    }

    public void setGmd(String gmd) {
        this.gmd = gmd;
    }
    
}
