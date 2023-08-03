package src.application.controllers.services_factories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import src.application.use_cases.ViaCepGetAddress;
import src.domain.services.UserService;
import src.infra.databases.postgres.UserJpaRepositoryImpl;

public  class UserServiceFactory {

    public static UserService generateService(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPersistence");
        EntityManager entityManager = emf.createEntityManager();
        UserJpaRepositoryImpl userRepo = new UserJpaRepositoryImpl(entityManager);

        ViaCepGetAddress getAddress = new ViaCepGetAddress();

        return  new UserService(userRepo,getAddress);

    }
}
