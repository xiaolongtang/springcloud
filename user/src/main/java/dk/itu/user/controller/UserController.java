package dk.itu.user.controller;

import dk.itu.user.entity.User;
import dk.itu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    UserService userService;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/user/id/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object putToManualCalendar(@PathVariable int id) {
        User user= userService.getUserById(id);
        return new HashMap<String,Object>(){{
            put("user",user);
            put("port",port);
        }};
    }
}
