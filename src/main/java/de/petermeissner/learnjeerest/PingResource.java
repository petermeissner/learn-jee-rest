package de.petermeissner.learnjeerest;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
public class PingResource {

    Gson gson = new Gson();


    private static class Ping {
        public String response;

        private Ping() {
            response = "pong";
        }
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return gson.toJson(new Ping());
    }
}
