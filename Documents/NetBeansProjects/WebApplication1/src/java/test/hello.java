/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import javax.ws.rs.GET;
import test.patient;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Madhav Gupta
 */
@Path("/hello")
public class hello {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello(){
        String resource="<h1>Madhav</h1>";
        return resource;
        
    }
    
}
