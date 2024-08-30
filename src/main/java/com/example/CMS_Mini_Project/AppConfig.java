package com.example.CMS_Mini_Project;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    // No explicit bean definitions needed as we are using @Component and @Service annotations
}
