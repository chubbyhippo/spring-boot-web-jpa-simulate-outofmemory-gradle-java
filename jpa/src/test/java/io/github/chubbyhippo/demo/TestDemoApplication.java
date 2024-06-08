package io.github.chubbyhippo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;

@TestConfiguration(proxyBeanMethods = false)
@ImportTestcontainers(TestcontainersConfiguration.class)
public class TestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(DemoApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }

}
