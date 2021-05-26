/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.service;

import EntityDao.User;
import EntityDao.DL;
import EntityDao.DLGroup;
import EntityDao.ParseString;
import at.bitserv.haiskundenportal.domain.Benutzer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author h.singh
 */
@Stateless
@Path("Benutzer")
public class BenutzerFacadeREST extends AbstractFacade<Benutzer> {

    @PersistenceContext(unitName = "HAISPU")
    private EntityManager em;

    public BenutzerFacadeREST() {
        super(Benutzer.class);
    }

//    @POST
//    @Override
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public void create(Benutzer entity) {
//        super.create(entity);
//    }
//    @PUT
//    @Path("{id}")
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public void edit(@PathParam("id") String id, Benutzer entity) {
//        super.edit(entity);
//    }
//    @DELETE
//    @Path("{id}")
//    public void remove(@PathParam("id") String id) {
//        super.remove(super.find(id));
//    }
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Benutzer find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<User> getAllResults() {

        List<Benutzer> benutzerList = super.findAll();
        if (benutzerList == null || benutzerList.isEmpty()) {
            throw new WebApplicationException(404);
        }
        List<User> userList = new ArrayList<>();
        ParseString parseString = new ParseString();

        for (int i = 0; i < benutzerList.size(); i++) {
            try {
                User bentzerDao = new User();
                Benutzer benutzer = benutzerList.get(i);

                //get Data From Resource
                String anrede = benutzer.getAnrede();
                String dls = benutzer.getDLs();
                List<DL> dlList = parseString.parseDBString(dls);
                DLGroup dlg = new DLGroup();
                // Reqired for extra XML Level
                for (int j = 0; j < dlList.size(); j++) {
                    dlg.getDL().add(dlList.get(j));
                }

                String expression = benutzer.getExpression();
                Date birthdate = benutzer.getGeburtsdatum();
                int hdl = benutzer.getHDL();
                int id = benutzer.getId();
                int kundenId = benutzer.getKundenID();
                String password = benutzer.getPasswort();
                String firstName = benutzer.getVorname();
                String lastName = benutzer.getZuname();

                //Write To To Data Transfer Object
                bentzerDao.setAnrede(anrede);
                bentzerDao.setExpression(expression);
                bentzerDao.setDLs(dlg);
                bentzerDao.setGeburtsdatum(birthdate);
                bentzerDao.setHDL(hdl);
                bentzerDao.setId(id);
                bentzerDao.setKundenID(kundenId);
                bentzerDao.setPasswort(password);
                bentzerDao.setVorname(firstName);
                bentzerDao.setZuname(lastName);
                userList.add(bentzerDao);
            } catch (ParseException ex) {
                Logger.getLogger(BenutzerFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return userList;

    }

//    @GET
//    @Path("{from}/{to}")
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<Benutzer> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
//        return super.findRange(new int[]{from, to});
//    }
//    @GET
//    @Path("count")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String countREST() {
//        return String.valueOf(super.count());
//    }
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
