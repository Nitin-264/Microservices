package in.pwskills.nitin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	//1. Authorization
	
	@Bean
	SecurityFilterChain configerPath(HttpSecurity http) throws Exception{
		return http.authorizeHttpRequests(
				          request->request.requestMatchers("/home","/").permitAll()
				                          .requestMatchers("/hello").authenticated()
				                          .anyRequest().permitAll()
				                          )
				   .formLogin(form->form.loginPage("/login").permitAll())
				   .logout(logout->logout.permitAll()).build();
	}
	
	
	// 2. Authentication
	@Bean
	@SuppressWarnings("deprecation")
	UserDetailsService userDetailsService() {
		
		System.out.println("SecurityConfig.userDetailsService()::InMemory Data");
		
		UserDetails user1 =User.withDefaultPasswordEncoder()
				               .username("Sachin")
				               .password("tendulkar")
				               .build();
	   UserDetails user2 = User.withDefaultPasswordEncoder()
			                   .username("Rohit")
			                   .password("Sharma")
			                   .build();
	   return new InMemoryUserDetailsManager(user1,user2);
	}
}
