package de.petermeissner.learnjeerest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
public class PingResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "pong";
    }
}
