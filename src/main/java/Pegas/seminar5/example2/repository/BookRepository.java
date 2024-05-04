package Pegas.seminar5.example2.repository;

import Pegas.seminar5.example2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
