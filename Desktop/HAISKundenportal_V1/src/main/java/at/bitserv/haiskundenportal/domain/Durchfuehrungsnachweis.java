/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import at.bitserv.haiskundenportal.service.AdapterCDATA;
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "Durchfuehrungsnachweis", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Durchfuehrungsnachweis.findAll", query = "SELECT d FROM Durchfuehrungsnachweis d")
    , @NamedQuery(name = "Durchfuehrungsnachweis.findByKundenid", query = "SELECT d FROM Durchfuehrungsnachweis d WHERE d.kundenid = :kundenid")
    , @NamedQuery(name = "Durchfuehrungsnachweis.findByKundenidinDate", query = "SELECT d FROM Durchfuehrungsnachweis d WHERE d.kundenid = :kundenid and date(d.actualexecutiontime) between :datevon and :datebis")})
public class Durchfuehrungsnachweis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Size(max = 255)
    @Column(name = "mocca_id")
    private String moccaId;
    @Column(name = "service")       //service
    private String service;
    @Size(max = 255)
    @Column(name = "extgeneratedfromcustomer2serviceid")
    private String extgeneratedfromcustomer2serviceid;
    @Size(max = 255)
    @Column(name = "extmissionid")
    private String extmissionid;
    @Size(max = 8000)
    @Column(name = "details")
    private String details;
    @Column(name = "modifieddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifieddate;
    @Column(name = "betreuerid")
    private Integer betreuerid;
    @Column(name = "kundenid")
    private Integer kundenid;
    @Column(name = "actualexecutiontime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualexecutiontime;
    @Size(max = 4000)
    @Column(name = "valuetext")
    private String valuetext;
    @Size(max = 255)
    @Column(name = "kurzbezeichnung")
    private String kurzbezeichnung;
    @Size(max = 2147483647)
    @Column(name = "Ausbildung")
    private String ausbildung;
    @Size(max = 2147483647)
    @Column(name = "Ausbildunglang")
    private String ausbildunglang;
    @Column(name = "executionstatus")
    private Integer executionstatus;
    @Size(max = 2147483647)
    @Column(name = "executionremark")
    private String executionremark;
    @Column(name = "exttypeservicenotdonereason")
    private String exttypeservicenotdonereason;

    public Durchfuehrungsnachweis() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoccaId() {
        return moccaId;
    }

    public void setMoccaId(String moccaId) {
        this.moccaId = moccaId;
    }

    public String getExtgeneratedfromcustomer2serviceid() {
        return extgeneratedfromcustomer2serviceid;
    }

    public void setExtgeneratedfromcustomer2serviceid(String extgeneratedfromcustomer2serviceid) {
        this.extgeneratedfromcustomer2serviceid = extgeneratedfromcustomer2serviceid;
    }

    public String getExtmissionid() {
        return extmissionid;
    }

    public void setExtmissionid(String extmissionid) {
        this.extmissionid = extmissionid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public Integer getBetreuerid() {
        return betreuerid;
    }

    public void setBetreuerid(Integer betreuerid) {
        this.betreuerid = betreuerid;
    }

    public Integer getKundenid() {
        return kundenid;
    }

    public void setKundenid(Integer kundenid) {
        this.kundenid = kundenid;
    }

    public Date getActualexecutiontime() {
        return actualexecutiontime;
    }

    public void setActualexecutiontime(Date actualexecutiontime) {
        this.actualexecutiontime = actualexecutiontime;
    }

       @XmlJavaTypeAdapter(AdapterCDATA.class) 
    public String getValuetext() {
        return valuetext;
    }

    public void setValuetext(String valuetext) {
        this.valuetext = valuetext;
    }

    public String getKurzbezeichnung() {
        return kurzbezeichnung;
    }

    public void setKurzbezeichnung(String kurzbezeichnung) {
        this.kurzbezeichnung = kurzbezeichnung;
    }

    public String getAusbildung() {
        return ausbildung;
    }

    public void setAusbildung(String ausbildung) {
        this.ausbildung = ausbildung;
    }

    public String getAusbildunglang() {
        return ausbildunglang;
    }

    public void setAusbildunglang(String ausbildunglang) {
        this.ausbildunglang = ausbildunglang;
    }

    public Integer getExecutionstatus() {
        return executionstatus;
    }

    public void setExecutionstatus(Integer executionstatus) {
        this.executionstatus = executionstatus;
    }

    public String getExecutionremark() {
        return executionremark;
    }

    public void setExecutionremark(String executionremark) {
        this.executionremark = executionremark;
    }

    public String getExttypeservicenotdonereason() {
        return exttypeservicenotdonereason;
    }

    public void setExttypeservicenotdonereason(String exttypeservicenotdonereason) {
        this.exttypeservicenotdonereason = exttypeservicenotdonereason;
    }

    

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    
    
}
