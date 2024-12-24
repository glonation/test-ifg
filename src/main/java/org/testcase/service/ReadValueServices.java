package org.testcase.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.testcase.entity.Data;

import org.testcase.repository.Repo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

@ApplicationScoped
public class ReadValueServices {
    @Inject
    Repo repo;

    @Inject
    @RestClient
    CallData call;

    public void saveData(){
        String resp = call.getData();
        ObjectMapper mapper= new ObjectMapper();
        ArrayList<Data> data = mapper.convertValue(resp,ArrayList.class);
        CompletableFuture.runAsync(() ->
                repo.storeData(data));
    }

}
