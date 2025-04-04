package com.learn.test.first.configration;

import com.learn.test.first.DB;
import com.learn.test.first.DevDB;
import com.learn.test.first.ProdDB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode",havingValue = "development")
    public DB getDevDBBean(){
        // This will make singelton object by default
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode",havingValue = "production")
    public DB getProdDBBean(){
        // This will make singelton object by default
        return new ProdDB();
    }

}
