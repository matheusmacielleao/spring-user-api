package src.domain.dtos;

import src.domain.entities.User;

import java.util.Date;

public class UserDtos {
    public class Create{
        String name;
        Date birthDate;
        String email;
        String phoneNumber;
        String password;

        String cep;

    }

    public class Update extends User {


    }

}
