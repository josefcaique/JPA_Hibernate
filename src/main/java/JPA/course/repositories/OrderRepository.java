package JPA.course.repositories;

import JPA.course.entities.Order;
import JPA.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
