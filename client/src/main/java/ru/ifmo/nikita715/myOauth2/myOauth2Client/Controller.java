package ru.ifmo.nikita715.myOauth2.myOauth2Client;

import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final OAuth2RestTemplate restTemplate;

    @Autowired
    public Controller(OAuth2RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/user")
    public ObjectNode home() {
        return restTemplate.getForObject("localhost:8080/user/1", ObjectNode.class);
    }
}
