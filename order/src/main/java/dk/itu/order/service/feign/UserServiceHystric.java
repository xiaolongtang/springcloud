package dk.itu.order.service.feign;

import org.springframework.stereotype.Component;

@Component
public class UserServiceHystric implements UserService{

    @Override
    public String getUserInfo(int id) {
        return "{\"message\":\"user interface is not available\"}";
    }
}
