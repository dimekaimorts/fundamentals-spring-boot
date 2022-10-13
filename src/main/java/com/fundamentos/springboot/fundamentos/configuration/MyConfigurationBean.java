package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean getBeanOperation() {
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation getBeanMyOperation() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency getBeanWithDependency(MyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
