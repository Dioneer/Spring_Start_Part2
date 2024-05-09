package Pegas.seminar6.exapmle6_2.repository;

import Pegas.seminar6.exapmle6_2.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepo extends JpaRepository<Reader, Long> {
}
