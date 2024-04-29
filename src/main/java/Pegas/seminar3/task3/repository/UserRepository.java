package Pegas.seminar3.task3.repository;

import Pegas.seminar3.task3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
