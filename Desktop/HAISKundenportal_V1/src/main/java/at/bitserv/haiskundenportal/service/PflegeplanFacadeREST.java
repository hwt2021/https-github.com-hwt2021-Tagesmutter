/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.service;

import at.bitserv.haiskundenportal.domain.Pflegeplan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author h.singh
 */
@Stateless
@Path("Pflegeplan")
public class PflegeplanFacadeREST extends AbstractFacade<Pflegeplan> {

    @PersistenceContext(unitName = "HAISPU")
    private EntityManager em;

    public PflegeplanFacadeREST() {
        super(Pflegeplan.class);
    }

//    @POST
//    @Override
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public void create(Pflegeplan entity) {
//        super.create(entity);
//    }
//
//    @PUT
//    @Path("{id}")
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public void edit(@PathParam("id") Integer id, Pflegeplan entity) {
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
    public Pflegeplan find(@PathParam("id") Integer id) {
        return super.find(id);
    }

//    @GET
//    @Override
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<Pflegeplan> findAll() {
//        return super.findAll();
//    }

//    @GET
//    @Path("{from}/{to}")
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<Pflegeplan> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
//        return super.findRange(new int[]{from, to});
//    }
    
    @GET
    @Path("{id}/{datevon}/{datebis}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Pflegeplan> findByKundenidinDate(@PathParam("id") Integer id,@PathParam("datevon") String datevon,@PathParam("datebis") String datebis) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-d HH:mm", Locale.GERMAN);
        Date dvon = formatter.parse(datevon+" 00:00");
        Date dbis = formatter.parse(datebis+" 24:00");
        
        return em.createNamedQuery("Pflegeplan.findByKundenidinDate").setParameter("kundenid", id)
            .setParameter("datevon", dvon)
            .setParameter("datebis", dbis)
            .getResultList();
    }
    
    @GET
    @Path("{id}/{valid}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Pflegeplan> findByKundenidandvalid(@PathParam("id") Integer id,@PathParam("valid") String valid){        
        return em.createNamedQuery("Pflegeplan.findByKundenidandvalid").setParameter("kundenid", id)
            .setParameter("valid", valid)
            .getResultList();
    }

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
