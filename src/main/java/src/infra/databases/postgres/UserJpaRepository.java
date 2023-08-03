package src.infra.databases.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.domain.repositories.UserRepository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserPersistence, String>, UserRepository {
}

