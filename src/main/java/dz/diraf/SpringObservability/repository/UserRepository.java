package dz.diraf.SpringObservability.repository;

import dz.diraf.SpringObservability.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
