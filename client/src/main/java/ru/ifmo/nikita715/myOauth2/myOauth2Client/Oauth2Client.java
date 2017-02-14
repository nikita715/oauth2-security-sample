package ru.ifmo.nikita715.myOauth2.myOauth2Client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@Configuration
@EnableOAuth2Client
public class Oauth2Client {

    @Bean
    public OAuth2RestTemplate restTemplate(OAuth2ClientContext context) {
        return new OAuth2RestTemplate(resource(), context);
    }

    @Bean
    public OAuth2ClientContext restTemplate() {
        return new DefaultOAuth2ClientContext();
    }

    private OAuth2ProtectedResourceDetails resource() {
        AuthorizationCodeResourceDetails resource = new AuthorizationCodeResourceDetails();
        resource.setClientId("nikita");
        resource.setAccessTokenUri("localhost:8080/oauth/token");
        resource.setUserAuthorizationUri("localhost:8080/oauth/authorize");
        return resource;
    }
}
