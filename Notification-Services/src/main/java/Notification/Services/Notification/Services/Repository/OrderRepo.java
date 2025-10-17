package Notification.Services.Notification.Services.Repository;


import Notification.Services.Notification.Services.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Product, Long> {
}
