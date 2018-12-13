package com.git.poan.simple.inject;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.util.Properties;

/**
 * @Author: panbenxing
 * @Date: 2018/12/13
 * @Description:
 */
@Configuration
public class ConfigProperties {

    @Bean
    public static PropertiesFactoryBean applicationPropertiesFactoryBean() {

        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocations(new Resource[] {
                new FileSystemResource("classpath*:application.*")
        });
        return propertiesFactoryBean;
    }

    public static Properties applicationProperties() throws Exception {
        return applicationPropertiesFactoryBean().getObject();
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() throws Exception {
        PropertySourcesPlaceholderConfigurer ppc = new PropertySourcesPlaceholderConfigurer();
        ppc.setProperties(applicationProperties());

        ppc.setIgnoreResourceNotFound(true);
        ppc.setIgnoreUnresolvablePlaceholders(false);
        return ppc;
    }
}
