package com.lmig.config;

import org.hibernate.dialect.H2Dialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomH2Dialect extends H2Dialect {
    public CustomH2Dialect() {
        super();
        registerFunction("mod", new SQLFunctionTemplate(StandardBasicTypes.INTEGER, "mod(?1,?2)"));
    }
}
