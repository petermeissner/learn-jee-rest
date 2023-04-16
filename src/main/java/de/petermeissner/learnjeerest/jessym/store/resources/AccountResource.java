package de.petermeissner.learnjeerest.jessym.store.resources;

import de.petermeissner.learnjeerest.jessym.store.model.Account;
import de.petermeissner.learnjeerest.jessym.store.model.AccountRegisterRequest;
import de.petermeissner.learnjeerest.jessym.store.model.AccountResult;
import jakarta.validation.Valid;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/accounts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AccountResource {

    @GET
    @Path("/list")
    public List<Account> list() {
        Account account = new Account();
        account.setId(1L);
        account.setName("bob");
        account.setEmail("bob@example.com");
        return List.of(account);
    }

    @GET
    @Path("/findById/")
    public AccountResult findByIdMissing() {
        AccountResult account = new AccountResult();
        account.setResult("Error: No ID parameter provided.");
        return account;
    }
    @GET
    @Path("/findById/{id}")
    public AccountResult findById(@PathParam("id") Long id) {
        AccountResult account = new AccountResult();
        account.setId(id);
        account.setName("alice");
        account.setEmail("alice@example.com");
        account.setResult("Ok.");
        return account;
    }

    @POST
    public Account register(@Valid AccountRegisterRequest request) {
        Account account = new Account();
        account.setId(1L);
        account.setName(request.getName());
        account.setEmail(request.getEmail());
        return account;
    }
}
