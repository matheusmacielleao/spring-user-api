package src;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import src.application.repositories.SQLUserRepository;
import src.application.use_cases.ViaCepGetAddress;
import src.domain.repositories.UserRepository;
import src.domain.use_cases.GetAddress;
import src.infra.databases.repositories.JpaUserRepository;

@Configuration
public class AppConfig {
    @Bean
    public GetAddress getAddress(){
        return new ViaCepGetAddress();
    }

}
