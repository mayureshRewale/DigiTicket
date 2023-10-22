package np.dt.dtapigateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("DT-SECURITY-SERVICE", r -> r.path("/security/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://DT-SECURITY-SERVICE"))

                .route("DT-MASTER-SERVICE", r -> r.path("/api/v1/master/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://DT-MASTER-SERVICE"))

                .build();
    }

}
