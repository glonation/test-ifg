package org.testcase.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.testcase.service.CallData;
import org.testcase.service.ReadValueServices;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/data")
@ApplicationScoped
public class ReadValueController {
    @Inject
    ReadValueServices services;

    @GET
    public String ambilData() {
        services.saveData();
        return "slslkfja;lnglsb";
    }
}
