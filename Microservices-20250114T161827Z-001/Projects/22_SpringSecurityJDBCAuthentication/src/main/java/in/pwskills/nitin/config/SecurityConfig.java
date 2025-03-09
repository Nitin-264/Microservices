package in.pwskills.nitin.config;

import java.net.http.HttpRequest;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	//1. Authorization
	@Bean
	SecurityFilterChain configurePath(HttpSecurity http) throws Exception{
		
		return http.authorizeHttpRequests(
				    request->request.requestMatchers("home","/").permitAll()
				                    .requestMatchers("/admin").hasAuthority("ADMIN")
				                    .requestMatchers("/customer").hasAuthority("CUSTOMER")
				                    .requestMatchers("/hello").authenticated()
				                    .anyRequest().permitAll()
				                    
				 ).formLogin(form->form.loginPage("/login").permitAll())
				  .logout(logout->logout.permitAll()).build();
					 
	}
	
	//2. Authentication
	@Bean
	UserDetailsService userDetailsService(DataSource datasource) {
		System.out.println("ADDED DATA TO DATABASE BY SPRINGSECURITY...");
		//JDBC Storage and Authentication using "PreDefined Filter"
		
		UserDetails user1 = User.withUsername("Nitin")
				                .password(
                                          passwordEncoder.encode("Mahlan")
                                          ).authorities("ADMIN")
				                .build();
		UserDetails user2 = User.withUsername("Rohit")
                .password(
                          passwordEncoder.encode("Sharma")
                          ).authorities("Customer")
                .build();
	   
	   JdbcUserDetailsManager userdetailsManager = new JdbcUserDetailsManager(datasource)	;
	   userdetailsManager.createUser(user1);
	   userdetailsManager.createUser(user2);
	   
	   return userdetailsManager;
	}
}
