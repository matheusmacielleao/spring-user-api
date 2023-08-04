package src.domain.dtos;

import src.domain.entities.Address;
import src.domain.entities.User;

import java.util.Date;

public class UserDtos {
    public static class Create{
        public  String cpf;

        public  String name;
        public Date birthDate;
        public String email;
        public String phoneNumber;
        public String password;
        public String cep;
        public Integer streetNumber;

        public Create(String cpf, String name, Date birthDate, String email, String phoneNumber, String password, String cep, Integer streetNumber) {
            this.cpf = cpf;
            this.name = name;
            this.birthDate = birthDate;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.password = password;
            this.cep = cep;
            this.streetNumber = streetNumber;
        }
    }

    public abstract class Update extends User {

        public Update(String cpf, String name, Date birthDate, String email, String phoneNumber, String password, Address address) {
            super(cpf, name, birthDate, email, phoneNumber, password, address);
        }
    }

}
