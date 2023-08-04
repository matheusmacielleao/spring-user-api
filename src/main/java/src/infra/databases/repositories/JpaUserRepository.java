package src.infra.databases.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.domain.entities.User;
@Repository
public interface JpaUserRepository extends JpaRepository<User, String> {
    public User getByCpf(String cpf);
}