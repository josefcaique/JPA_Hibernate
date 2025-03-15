package JPA.course.repositories;

import JPA.course.entities.OrderItem;
import JPA.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
