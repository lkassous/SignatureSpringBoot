package com.leith.emails;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.leith.emails.entities.Role;
import com.leith.emails.entities.Signature;
import com.leith.emails.entities.User;
import com.leith.emails.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class StageApplication {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	 @Autowired
		UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(StageApplication.class, args);
	}
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Signature.class);
	}

	@Bean
	public ModelMapper modelMapper()
	{
	return new ModelMapper();
	}
	/* @PostConstruct
		void init_users() {
			//ajouter les rôles
			userService.addRole(new Role(null,"ADMIN"));
			userService.addRole(new Role(null,"USER"));
			
			//ajouter les users
			userService.saveUser(new User(null,"admin","123",true,null));
			userService.saveUser(new User(null,"nadhem","123",true,null));
			userService.saveUser(new User(null,"yassine","123",true,null));
			
			//ajouter les rôles aux users
			userService.addRoleToUser("admin", "ADMIN");
			userService.addRoleToUser("admin", "USER");
			
			userService.addRoleToUser("nadhem", "USER");
			userService.addRoleToUser("yassine", "USER");		
		} */
	    
	


}
