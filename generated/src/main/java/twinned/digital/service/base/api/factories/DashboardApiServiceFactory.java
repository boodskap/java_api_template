package twinned.digital.service.base.api.factories;

import twinned.digital.service.base.api.DashboardApiService;
import twinned.digital.service.base.api.impl.DashboardApiServiceImpl;

public class DashboardApiServiceFactory {
    private final static DashboardApiService service = new DashboardApiServiceImpl();

    public static DashboardApiService getDashboardApi() {
        return service;
    }
}
