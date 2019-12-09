package at.htl;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@RequestScoped
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed({"defaultUsers"})
    public String hello() {
        return "hello";
    }
}