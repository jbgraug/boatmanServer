package com.graujuan.boatman.service.rest.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.graujuan.boatman.business.Boat;
import com.graujuan.boatman.business.Equipment;
import com.graujuan.boatman.business.User;

@Configuration
public class RepositoryRestConfig  extends RepositoryRestMvcConfiguration {
 
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Boat.class);
        config.exposeIdsFor(Equipment.class);
        config.exposeIdsFor(User.class);
        config.setReturnBodyOnCreate(true);
        config.setReturnBodyOnUpdate(true);
    }
}