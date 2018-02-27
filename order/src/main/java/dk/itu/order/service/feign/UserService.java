package dk.itu.order.service.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-user")
public interface UserService {

    @RequestMapping(value = "/api/v1/user/id/{id}",method = RequestMethod.GET)
    String getUserInfo(@PathVariable("id") int id);
}
