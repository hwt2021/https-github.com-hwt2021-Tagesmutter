/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.service.service;

import at.bitserv.haiskundenportal.domain.Protokoll;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author t.nofal
 */
@Stateless
@Path("customerActivity")
public class ProtokollFacadeREST extends AbstractFacade<Protokoll> {

    @PersistenceContext(unitName = "HAISPU")
    private EntityManager em;

    private final String protocolType = "Emma-Web";
    private final String protocolHint = "Inactive Customers Within The Last 3 Months";

    public ProtokollFacadeREST() {
        super(Protokoll.class);
    }

    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("/emma/{supervisorId}/{customerId}")
    public Response createUserActivity(@PathParam("supervisorId") int supervisorId, @PathParam("customerId") int customerId) {

        Response response = null;
        boolean result = isPairFound(supervisorId, customerId, protocolType);
        boolean EmployeeFound = isWorkerOrCustomerFound(supervisorId, "M");
        boolean cutomerFound = isWorkerOrCustomerFound(customerId, "K");

        if (!result && EmployeeFound && cutomerFound) {
            insertRecord(supervisorId, customerId, protocolType, protocolHint);
            response = Response.status(Status.CREATED).build();
        } else {
            response = Response.status(Status.BAD_REQUEST).build();
        }
        //System.out.println("XX " + supervisorId + " " + customerId + " Result " + result + " Hint " + protocolHint + " queryUpdated " + queryUpdated + " Worker " + EmployeeFound + " cust " + cutomerFound);
        return response;

    }

    public boolean isWorkerOrCustomerFound(Integer in_id, String type) {
        Query query = em.createNativeQuery("SELECT COUNT(*) from dba.Dienstleistung_Partner where PF_ID=:param1 AND TYP=:param2 ");
        int countValue = (int) query.setParameter("param1", in_id).setParameter("param2", type).getSingleResult();
        return countValue > 0 ? true : false;
    }

    public int insertRecord(Integer supervisorId, Integer customerId, String type, String hint) {
        Query query = em.createNativeQuery("insert into dba.Protokoll (Typ,Bemerkung, Zeitpunkt,pf_id_mitarbeiter,pf_id_kunde) values(:t,:b,:z,:m,:k);");
        return query.setParameter("t", type).setParameter("b", hint).setParameter("z", new Date()).setParameter("m", supervisorId).setParameter("k", customerId).executeUpdate();

    }

    public boolean isPairFound(Integer supervisorId, Integer customerId, String type) {
        Query query = em.createNativeQuery(" select count(*) from dba.Protokoll  where Typ=:typeParam and pf_id_mitarbeiter=:supervisorIdParam and pf_id_kunde=:customerIdParam ");
        int countValue = (int) query.setParameter("typeParam", type).setParameter("supervisorIdParam", supervisorId).setParameter("customerIdParam", customerId).getSingleResult();
        return countValue > 0 ? true : false;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
