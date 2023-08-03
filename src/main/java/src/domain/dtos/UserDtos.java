package src.domain.dtos;

import src.domain.entities.Address;
import src.domain.entities.User;

import java.util.Date;

public class UserDtos {
    public class Create{
        public  String cpf;

        public  String name;
        public Date birthDate;
        public String email;
        public String phoneNumber;
        public String password;
        public String cep;
        public Integer streetNumber;

    }

    public abstract class Update extends User {

        public Update(String cpf, String name, Date birthDate, String email, String phoneNumber, String password, Address address) {
            super(cpf, name, birthDate, email, phoneNumber, password, address);
        }
    }

}
