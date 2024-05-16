package twinned.digital.service.base.api;

import twinned.digital.service.base.api.*;
import twinned.digital.service.base.api.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import twinned.digital.service.base.api.model.DashboardStatsRes;

import java.util.List;
import twinned.digital.service.base.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2024-05-16T10:24:39.789+05:30")
public abstract class DashboardApiService {
    public abstract Response getDashboardStats() throws NotFoundException;
}
