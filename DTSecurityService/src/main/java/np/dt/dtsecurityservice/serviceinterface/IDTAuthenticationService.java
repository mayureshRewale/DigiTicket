package np.dt.dtsecurityservice.serviceinterface;

import java.util.Map;

public interface IDTAuthenticationService {

    Map<String, String> loginUser(String username);

}
