package grupo3.fullstack.apuestas.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import grupo3.fullstack.apuestas.persistence.entities.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
