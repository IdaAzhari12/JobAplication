/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.api;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import model.dao.CompanyDAO;
import model.pojo.Company;

/**
 * REST Web Service
 *
 * @author acer
 */
@Path("generic")
public class CompanyAPI {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CompanyAPI
     */
    public CompanyAPI() {
    }

    /**
     * Retrieves representation of an instance of company.api.CompanyAPI
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
      String html = "<body><h1>Company List</h1>"
              + "<table>" +
                    "<tr>" +
                        "<td>" +
                            "ID" +
                        "</td>" +
                        "<td>" +
                            "Name" +
                        "</td>" +
                        "<td>" +
                            "Address" +
                        "</td>" +   
                    "</tr>";
      
      List<Company> list = CompanyDAO.layDS();
      
      StringBuilder sb = new StringBuilder();
        for (Company c : list) {
            String table = "<tr>" +
                                "<td>" + c.getId() + "</td>" +
                                "<td>" + c.getName() + "</td>" +
                                "<td>" + c.getAdress() + "</td>" +
                            "</tr>";
            sb.append(table);
        }
      
      
      return html + sb.toString() + "</table></body>";
    }

    /**
     * PUT method for updating or creating an instance of CompanyAPI
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
