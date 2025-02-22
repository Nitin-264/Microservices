package in.pwskills.nitin.routing;

import java.util.UUID;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRoutingConfig {

	@Bean
	RouteLocator configRouter(RouteLocatorBuilder builder) {
		
		
		return builder
			  .routes()
			  .route("CARTDETAILS",
					       r->r.path("/v1/api/cart/**")
					       .filters(f->f.addRequestHeader("TOKENID", UUID.randomUUID().toString())
					    		        .addRequestHeader("SERVICESTATUS", "ACTIVE"))
			               .uri("lb://CART-SERVICE"))
			  .route("ORDERDETAILS",O->O.path("/v1/api/order/**").uri("lb://ORDER-SERVICE"))
			  .build();
	}
}
