package dev.matheuscruz;

import java.util.List;
import java.util.Map;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RegisterRestClient(configKey = "messages")
public interface MessagesRestClient {

    @GET
    @Path("/messages")
    public List<Map<String, Object>> messages();

}
