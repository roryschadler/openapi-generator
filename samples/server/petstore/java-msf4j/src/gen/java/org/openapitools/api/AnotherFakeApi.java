package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AnotherFakeApiService;
import org.openapitools.api.factories.AnotherFakeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Client;
import java.util.UUID;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/another-fake/dummy")


@io.swagger.annotations.Api(description = "the another-fake API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class AnotherFakeApi  {
   private final AnotherFakeApiService delegate = AnotherFakeApiServiceFactory.getAnotherFakeApi();

    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "To test special tags", notes = "To test special tags and operation ID starting with number", response = Client.class, tags={ "$another-fake?", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    public Response call123testSpecialTags(@ApiParam(value = "to test uuid example value" ,required=true)@HeaderParam("uuid_test") UUID uuidTest
,@ApiParam(value = "client model" ,required=true) Client body
)
    throws NotFoundException {
        return delegate.call123testSpecialTags(uuidTest,body);
    }
}
