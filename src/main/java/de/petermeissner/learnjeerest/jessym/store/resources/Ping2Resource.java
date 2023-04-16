package de.petermeissner.learnjeerest.jessym.store.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/ping2")
public class Ping2Resource {

    @GET
    public Response ping2() {
        return Response.ok(hashCode()).build();
    }

}
