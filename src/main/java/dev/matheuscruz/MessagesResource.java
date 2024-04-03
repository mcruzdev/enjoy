package dev.matheuscruz;

import java.util.List;
import java.util.Map;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/messages")
public class MessagesResource {

    @Inject
    @RestClient
    MessagesRestClient restClient;

    @GET
    public List<Map<String, Object>> messages() {

        return restClient.messages();
    }

}
