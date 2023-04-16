package de.petermeissner.learnjeerest.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/counter")
public class CountAccessResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response index() {
        Counter c = new Counter();
        return Response.ok(c).build();
    }
}
