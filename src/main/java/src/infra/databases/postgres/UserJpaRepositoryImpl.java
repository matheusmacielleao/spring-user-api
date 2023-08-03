package src.infra.databases.postgres;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import src.domain.entities.Address;
import src.domain.entities.User;
import src.domain.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserJpaRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    @Autowired
    public UserJpaRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public User create(User user) {
        UserPersistence userPersistence = new UserPersistence();
        userPersistence.setName(user.getName());
        userPersistence.setBirthDate(user.getBirthDate());
        userPersistence.setEmail(user.getEmail());
        userPersistence.setPhoneNumber(user.getPhoneNumber());
        userPersistence.setPassword(user.getPassword());
        userPersistence.setStreet(user.getAddress().getStreetName());
        userPersistence.setCity(user.getAddress().getCity());
        userPersistence.setState(user.getAddress().getState());
        userPersistence.setCep(user.getAddress().getCep());

        entityManager.persist(userPersistence);
        return user; // or you can return a new User object with the persisted ID
    }


    @Override
    public List<User> getAll() {
        List<UserPersistence> userPersistenceList = entityManager
                .createQuery("SELECT u FROM UserPersistence u", UserPersistence.class)
                .getResultList();

        return userPersistenceList.stream()
                .map(this::mapToUser)
                .collect(Collectors.toList());
    }

    @Override
    public User getByCpf(String cpf) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    private User mapToUser(UserPersistence userPersistence) {
        User user = new User();
        user.setCpf(userPersistence.getCpf());
        user.setName(userPersistence.getName());
        user.setBirthDate(userPersistence.getBirthDate());
        user.setEmail(userPersistence.getEmail());
        user.setPhoneNumber(userPersistence.getPhoneNumber());
        user.setPassword(userPersistence.getPassword());

        Address address = new Address();
        address.setStreetName(userPersistence.getStreet());
        address.setCity(userPersistence.getCity());
        address.setState(userPersistence.getState());
        address.setCep(userPersistence.getCep());
        user.setAddress(address);

        return user;
    }
}
