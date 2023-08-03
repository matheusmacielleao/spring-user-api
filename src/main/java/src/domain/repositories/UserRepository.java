package src.domain.repositories;

import src.domain.dtos.UserDtos;
import src.domain.entities.User;

import java.util.List;

public interface UserRepository {
    public User create(UserDtos.Create createUserDto);
    public List<User> getAll();
    public User getByCpf(String cpf);
    public User update(UserDtos.Update updateUserDto);

}
