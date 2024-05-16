package twinned.digital.service.base.api.impl;

import javax.ws.rs.core.Response;

import org.apache.commons.lang3.exception.ExceptionUtils;

import twinned.digital.service.base.api.DashboardApiService;
import twinned.digital.service.base.api.NotFoundException;
import twinned.digital.service.base.api.model.DashboardStatsRes;
import twinned.digital.service.base.dao.BaseDAO;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2024-05-16T10:24:39.789+05:30")
public class DashboardApiServiceImpl extends DashboardApiService {
	
    @Override
    public Response getDashboardStats() throws NotFoundException {
    	
    	DashboardStatsRes res = new DashboardStatsRes().ok(true);
    	
    	try {
    		
    		res.setTotalAssets(100L);
    		res.setReportedAssets(34L);
    		
    	}catch(Exception ex) {
    		res.ok(false);
    		res.msg(ex.getMessage());
    		res.trace(ExceptionUtils.getMessage(ex));
    	}
    	
    	return BaseDAO.build(res);
    }
}
