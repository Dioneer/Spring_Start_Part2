package Pegas.seminar6.exapmle6_2.repository;

import Pegas.seminar6.exapmle6_2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
