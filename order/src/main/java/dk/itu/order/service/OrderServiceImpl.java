package dk.itu.order.service;

import dk.itu.order.entity.Order;
import dk.itu.order.repository.OrderRepo;
import dk.itu.order.service.feign.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    UserService userService;

    @Value("${server.port}")
    String port;

    @Override
    public Map getOrderInformation(int orderID) {
        Order order= orderRepo.findOne(orderID);
        String userStr=userService.getUserInfo(order.getUserID());
        return new HashMap<String,Object>(){{
            put("User", JSONObject.fromObject(userStr));
            put("Order",order);
            put("port",port);
        }};
    }
}
