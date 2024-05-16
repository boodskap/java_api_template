package twinned.digital.service.base.api;

import twinned.digital.service.base.api.model.*;
import twinned.digital.service.base.api.DashboardApiService;
import twinned.digital.service.base.api.factories.DashboardApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import twinned.digital.service.base.api.model.DashboardStatsRes;

import java.util.List;
import twinned.digital.service.base.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/Dashboard")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the Dashboard API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2024-05-16T10:24:39.789+05:30")
public class DashboardApi  {
   private final DashboardApiService delegate = DashboardApiServiceFactory.getDashboardApi();

    @GET
    @Path("/stats")
    @Consumes({ "*/*" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get dashboard statistics", notes = "dashboard statistics", response = DashboardStatsRes.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "Dashboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = DashboardStatsRes.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication error", response = DashboardStatsRes.class),
        
        @io.swagger.annotations.ApiResponse(code = 417, message = "Platform error", response = DashboardStatsRes.class) })
    public Response getDashboardStats()
    throws NotFoundException {
        return delegate.getDashboardStats();
    }
}
