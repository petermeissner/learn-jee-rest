package de.petermeissner.learnjeerest.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {
    @GET
    public Response index() {
        Ping p = new Ping();
        p.setResponse("pong");
        return Response.ok(p).build();
    }
}
