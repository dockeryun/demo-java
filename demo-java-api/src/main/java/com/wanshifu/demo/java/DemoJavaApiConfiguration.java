package com.wanshifu.demo.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.Collections;

@Configuration
public class DemoJavaApiConfiguration implements PropertySourceLocator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoJavaApiConfiguration.class);

    @Override
    public PropertySource<?> locate(Environment environment) {
        String urlPropertyName = "wanshifu.demo-java.url";
        ConfigurableEnvironment configurableEnvironment = (ConfigurableEnvironment) environment;
        for (PropertySource<?> propertySource : configurableEnvironment.getPropertySources()) {
            Object o = propertySource.getProperty(urlPropertyName);
            if (o != null) {
                LOGGER.info("locate property {} in {} value is {} so skip set default", urlPropertyName, propertySource.getName(), o);
                return null;
            }
        }
        String url;
        String[] environments = environment.getActiveProfiles();
        String hostPrefix;
        if (environments.length > 0) {
            switch (environments[0]) {
                case "test":
                    hostPrefix = "test-";
                    break;
                case "prod":
                    hostPrefix = "";
                    break;
                case "dev":
                    hostPrefix = "dev-";
                    break;
                case "local":
                    hostPrefix = "dev-";
                    break;
                default:
                    hostPrefix = "dev-";

            }
            url = "http://" + hostPrefix + "demo-java.wanshifu.com";
        } else {
            throw new IllegalArgumentException("environment error! active profiles is empty");
        }
        LOGGER.info("can not locate property {} so set default value : {}", urlPropertyName, url);
        return new MapPropertySource("demo-java-property",
                Collections.singletonMap(urlPropertyName, url));
    }
}