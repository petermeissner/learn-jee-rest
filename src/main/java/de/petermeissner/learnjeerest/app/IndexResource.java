package de.petermeissner.learnjeerest.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexResource {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String index() {
        Indexer idx = new Indexer();

        idx.add("ping");
        idx.add("counter");
        idx.add("accounts/list");
        idx.add("accounts/findById/");

        return idx.toString();
    }
}
