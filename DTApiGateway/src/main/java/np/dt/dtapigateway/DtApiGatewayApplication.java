package np.dt.dtapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DtApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtApiGatewayApplication.class, args);
	}

}
