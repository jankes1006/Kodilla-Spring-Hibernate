package com.kodilla.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    public BeanMonitor beanMonitor(){
        return new BeanMonitor();
    }

    @Bean
    public PostProcessor postProcessor(){
        return new PostProcessor();
    }
}
