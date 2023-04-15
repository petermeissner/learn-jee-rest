package de.petermeissner.learnjeerest.app;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/counter")
public class CountAccessResource {

    Gson gson = new Gson();


    private static class Counter {
        public int count;

        private Counter() {
            count = 0;
        }
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return gson.toJson(new Counter());
    }
}
