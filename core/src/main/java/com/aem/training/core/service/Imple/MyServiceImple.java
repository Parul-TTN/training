package com.aem.training.core.service.Imple;

import com.aem.training.core.service.MyService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = MyService.class)
@Designate(ocd = MyServiceConfig.class)
public class MyServiceImple implements MyService {
   @Activate
    private MyServiceConfig myServiceConfig;
}
