package JPA.course.repositories;

import JPA.course.entities.Category;
import JPA.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
