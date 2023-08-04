package src.application.repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import src.domain.entities.User;
import src.domain.repositories.UserRepository;
import src.infra.databases.repositories.JpaUserRepository;

import java.util.List;
@Primary
@Component
public class SQLUserRepository implements UserRepository {
    private final JpaUserRepository jpaRepo;
    public SQLUserRepository(JpaUserRepository jpaRepo){
        this.jpaRepo=jpaRepo;
    }
    @Override
    public User create(User user) {
        return this.jpaRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        return this.jpaRepo.findAll();
    }

    @Override
    public User getByCpf(String cpf) {
        return this.jpaRepo.getByCpf(cpf);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(String cpf) {
        this.jpaRepo.deleteById(cpf);
    }
}
