package ru.ifmo.nikita715.myOauth2.myOauth2Client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ru.ifmo.nikita715.myOauth2.myOauth2Client")
public class MainConfig {}