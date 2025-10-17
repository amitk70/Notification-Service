package Notification.Services.Notification.Services.Controller;

import Notification.Services.Notification.Services.Entity.Product;
import Notification.Services.Notification.Services.Services.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private Orderservice orderservice;

    @PostMapping("/create")
    public String createOrder(@RequestBody Product product){
        orderservice.createOrder(product);
        return "Order placed successfully";
    }
}
