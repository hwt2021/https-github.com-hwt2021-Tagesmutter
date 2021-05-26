/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author MANFRED
 */
@javax.ws.rs.ApplicationPath("")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(at.bitserv.haiskundenportal.service.AbrechnungsparameterFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.BenutzerFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.DL13BuchungenFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.DL46BuchungenFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.DL46PreiseFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.DLInfoFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.DienstleistungenFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.DurchfuehrungsnachweisFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.EinrichtungenFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.FszFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.HaisDocFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.HaisDocFileFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.InfolineFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.KundenaktivFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.PartnerFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.PflegeplanFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.PreistabelleFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.SISUserFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.VerlaufsberichtFacadeREST.class);
        resources.add(at.bitserv.haiskundenportal.service.service.ProtokollFacadeREST.class);
    }
    
}
