package careapp.projectbackendcareapp;

import careapp.projectbackendcareapp.repository.JpaUserRepository;
import careapp.projectbackendcareapp.repository.UserRepository;
import careapp.projectbackendcareapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final UserRepository userRepository;
    @Autowired
    public SpringConfig(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Bean
    public UserService userService(){ return new UserService(userRepository);}

//    @Bean
//    public UserRepository userRepository(){
//        return new JpaUserRepository(em);
//    }
}
