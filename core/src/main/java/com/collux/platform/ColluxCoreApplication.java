package com.collux.platform;

import com.collux.platform.project.ProjectProperties;
import com.collux.platform.swagger.SwaggerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
        ProjectProperties.class,
        SwaggerProperties.class
})
@SpringBootApplication
public class ColluxCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColluxCoreApplication.class, args);

    }

}
