package com.proxym;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.proxym")
@EntityScan(basePackages = "com.proxym")
@EnableJpaRepositories(basePackages = "com.proxym")
public class RoleConfiguration {

}
