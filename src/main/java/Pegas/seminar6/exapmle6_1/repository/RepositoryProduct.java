package Pegas.seminar6.exapmle6_1.repository;

import Pegas.seminar6.exapmle6_1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduct extends JpaRepository<Product,Long> {

}
