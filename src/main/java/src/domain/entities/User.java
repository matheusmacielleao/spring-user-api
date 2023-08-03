package src.domain.entities;

import java.util.Date;

public class User {
    String cpf;
    String name;
    Date birthDate;
    String email;
    String phoneNumber;
    String password;
    Address address;
    public User(String cpf, String name, Date birthDate, String email, String phoneNumber, String password, Address address) {
        this.cpf = cpf;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.address = address;
    }



}
