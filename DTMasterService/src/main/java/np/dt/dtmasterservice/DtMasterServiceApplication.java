package np.dt.dtmasterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DtMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtMasterServiceApplication.class, args);
	}

}
