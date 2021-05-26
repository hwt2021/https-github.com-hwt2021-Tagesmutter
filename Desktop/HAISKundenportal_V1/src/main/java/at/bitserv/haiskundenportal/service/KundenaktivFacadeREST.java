/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.service;

import at.bitserv.haiskundenportal.domain.Kundenaktiv;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author h.singh
 */
@Stateless
@Path("BHKunden")
public class KundenaktivFacadeREST extends AbstractFacade<Kundenaktiv> {

    @PersistenceContext(unitName = "HAISPU")
    private EntityManager em;

    public KundenaktivFacadeREST() {
        super(Kundenaktiv.class);
    }

//    @POST
//    @Override
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public void create(Kundenaktiv entity) {
//        super.create(entity);
//    }
//
//    @PUT
//    @Path("{id}")
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public void edit(@PathParam("id") Integer id, Kundenaktiv entity) {
//        super.edit(entity);
//    }
//
//    @DELETE
//    @Path("{id}")
//    public void remove(@PathParam("id") Integer id) {
//        super.remove(super.find(id));
//    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Kundenaktiv find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("bhnr/{bhnr}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Kundenaktiv> findAllBHNr(@PathParam("bhnr") String bhnr) {
        List<Integer> bhnrs  = new ArrayList<>();
        String[] bhnrList = bhnr.split(",");
       for (int i = 0; i < bhnrList.length; i++){
        bhnrs.add(Integer.parseInt(bhnrList[i])); 
       }
       return em.createNamedQuery("Kundenaktiv.findByBHNr").setParameter("bhnr", bhnrs).getResultList();
    }
    
    @GET
    @Path("aktenzahl/{aktenzahl}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Kundenaktiv> findAllaktenzahl(@PathParam("aktenzahl") String aktenzahl) {
        return em.createNamedQuery("Kundenaktiv.findByaktenzahl").setParameter("aktenzahl", aktenzahl).getResultList();
    }
    
    @GET
    @Path("personen_id/{personen_id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Kundenaktiv> findAllpersonen_id(@PathParam("personen_id") String personen_id) {
        return em.createNamedQuery("Kundenaktiv.findBypersonen_id").setParameter("personen_id", personen_id).getResultList();
    }

//    @GET
//    @Override
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<Kundenaktiv> findAll() {
//        return super.findAll();
//    }

//    @GET
//    @Path("{from}/{to}")
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<Kundenaktiv> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
