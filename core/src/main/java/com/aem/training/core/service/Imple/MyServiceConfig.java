package com.aem.training.core.service.Imple;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "MyService Config",description = "Config file")
public @interface MyServiceConfig {
    @AttributeDefinition(name="Id", type= AttributeType.INTEGER,description = "Id")
    int ID() default 1;

    @AttributeDefinition(name="Name", type= AttributeType.STRING,description = "Name")
    String NAME() default "name";

}
