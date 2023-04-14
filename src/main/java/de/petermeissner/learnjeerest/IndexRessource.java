package de.petermeissner.learnjeerest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexRessource {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String index() {
        Indexer idx = new Indexer();

        idx.add("ping");
        idx.add("counter");

        return idx.toString();
    }
}
