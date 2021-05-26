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
@Table(name = "Pflegeplan", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pflegeplan.findAll", query = "SELECT p FROM Pflegeplan p")
    , @NamedQuery(name = "Pflegeplan.findByKundenid", query = "SELECT p FROM Pflegeplan p WHERE p.kundenid = :kundenid")
    , @NamedQuery(name = "Pflegeplan.findByKundenidandvalid", query = "SELECT p FROM Pflegeplan p WHERE p.kundenid = :kundenid and p.valid = :valid")
    , @NamedQuery(name = "Pflegeplan.findByKundenidinDate", query = "SELECT p FROM Pflegeplan p WHERE p.kundenid = :kundenid and p.validfrom <= :datebis and (p.validto is null or p.validto >=:datevon)")})
public class Pflegeplan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Size(max = 255)
    @Column(name = "mocca_id")
    private String moccaId;
    @Column(name = "service")
    private String service;
    @Column(name = "TypeQualificationName")
    private String Qualification;    
    @Column(name = "service_problem")
    private String serviceProblem;
    @Column(name = "modifieddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifieddate;
    @Column(name = "kundenid")
    private Integer kundenid;
    @Column(name = "validfrom")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validfrom;
    @Column(name = "validto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validto;
    @Size(max = 8000)
    @Column(name = "details")
    private String details;
    @Size(max = 8000)
    @Column(name = "indications")
    private String indications;
    @Size(max = 8000)
    @Column(name = "causes")
    private String causes;
    @Size(max = 8000)
    @Column(name = "resources")
    private String resources;
    @Size(max = 8000)
    @Column(name = "goals")
    private String goals;
    @Column(name = "numberofexecutionsperday")
    private Integer numberofexecutionsperday;
    @Column(name = "validholiday")
    private Character validholiday;
    @Column(name = "optional")
    private Character optional;
    @Column(name = "valid")
    private String valid;

    public Pflegeplan() {
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

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public Integer getKundenid() {
        return kundenid;
    }

    public void setKundenid(Integer kundenid) {
        this.kundenid = kundenid;
    }

    public Date getValidfrom() {
        return validfrom;
    }

    public void setValidfrom(Date validfrom) {
        this.validfrom = validfrom;
    }

    public Date getValidto() {
        return validto;
    }

    public void setValidto(Date validto) {
        this.validto = validto;
    }

    public String getDetails() {
        //190624 Thurner: CR durch | ersetzen; 0,00 Minuten wegfiltern
        details = details.replace("\n", "|").replace("0,00 Minuten|","").replace("0,00 Minuten","");
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public String getCauses() {
        return causes;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public Integer getNumberofexecutionsperday() {
        return numberofexecutionsperday;
    }

    public void setNumberofexecutionsperday(Integer numberofexecutionsperday) {
        this.numberofexecutionsperday = numberofexecutionsperday;
    }

    public Character getValidholiday() {
        return validholiday;
    }

    public void setValidholiday(Character validholiday) {
        this.validholiday = validholiday;
    }

    public Character getOptional() {
        return optional;
    }

    public void setOptional(Character optional) {
        this.optional = optional;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceProblem() {
        return serviceProblem;
    }

    public void setServiceProblem(String serviceProblem) {
        this.serviceProblem = serviceProblem;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

        
}
