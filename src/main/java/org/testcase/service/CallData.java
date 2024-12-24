package org.testcase.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey="sourcedata")
public interface CallData {
    @GET
    @Path("/getTest")
    public String getData();
}
