package com.atlassian.flock.rest;

import com.atlassian.flock.components.MYComponentImpl;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.plugins.rest.common.security.AnonymousAllowed;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * A resource of message.
 */
@Path("/flock")
public class MyRestResource {
    private final MYComponentImpl myComponent;
    private final PluginSettingsFactory pluginSettingsFactory;

    @Autowired
    public MyRestResource(MYComponentImpl myComponent, @ComponentImport PluginSettingsFactory pluginSettingsFactory) {
        this.myComponent = myComponent;
        this.pluginSettingsFactory = pluginSettingsFactory;
    }

    @GET
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getMessage()
    {
       return Response.ok(new MyRestResourceModel(this.myComponent.hello())).build();
    }

    @POST
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/addData")
    public Response addData(String data) {
        return Response.ok(data).build();
    }
    private String getMessageFromKey(String key) {
        return key;
    }
}