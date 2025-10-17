package Notification.Services.Notification.Services.Services;

import Notification.Services.Notification.Services.Entity.Product;
import Notification.Services.Notification.Services.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class  Orderservice{

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private EmailService emailService;

    public void createOrder(Product product){
        orderRepo.save(product);
        String to = product.getEmail();
        String subject = "Your order for "+product.getProductname()+" has been placed";
        String text = "Order details => "+product.getProductname()+" | Quantity "+product.getQuanity()+" | Price " + product.getPrice();
        emailService.sendEmail(to,subject,text);
    }
}
