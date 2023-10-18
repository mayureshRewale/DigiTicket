package np.dt.dtdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DtDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtDiscoveryServiceApplication.class, args);
	}

}
