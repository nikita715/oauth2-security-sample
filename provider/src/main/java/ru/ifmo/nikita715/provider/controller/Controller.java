package ru.ifmo.nikita715.provider.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ifmo.nikita715.provider.model.User;

@RestController
public class Controller {

    private static ObjectMapper mapper = new ObjectMapper();

    @RequestMapping(value = "/user/1", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getUser() throws JsonProcessingException {
        User user = new User();
        user.setId(1);
        user.setName("nikita");
        return mapper.writeValueAsString(user);
    }
}
