package src.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.domain.dtos.UserDtos;
import src.domain.entities.Address;
import src.domain.entities.User;
import src.domain.repositories.UserRepository;
import src.domain.use_cases.GetAddress;
import src.infra.databases.repositories.JpaUserRepository;

import java.util.List;
@Service
public class UserService {
    UserRepository userRepo;
    GetAddress getAddress;
    @Autowired
    public UserService(UserRepository userRepo, GetAddress getAddress) {
        this.userRepo = userRepo;
        this.getAddress = getAddress;
    }

    public User create(UserDtos.Create createUserDto){
        Address userAddress =  this.getAddress.byCep(createUserDto.cep,createUserDto.streetNumber);
        User newUser = new User(createUserDto.cpf,createUserDto.name,createUserDto.birthDate,createUserDto.email,createUserDto.phoneNumber,createUserDto.password,userAddress);
        return this.userRepo.create(newUser);
    }

    public List<User> getAll(){
        return this.userRepo.getAll();
    }

    public void delete(String cpf){
        this.userRepo.delete(cpf);
    }

    public User getByCpf(String cpf){
        return this.userRepo.getByCpf(cpf);
    }

}
