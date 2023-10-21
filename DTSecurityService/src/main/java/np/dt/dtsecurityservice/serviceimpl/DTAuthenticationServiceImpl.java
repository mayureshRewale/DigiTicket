package np.dt.dtsecurityservice.serviceimpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import np.dt.dtsecurityservice.security.DTSecurityJwtService;
import np.dt.dtsecurityservice.serviceinterface.IDTAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class DTAuthenticationServiceImpl implements IDTAuthenticationService {

    @Autowired
    private DTSecurityJwtService dtSecurityJwtService;

    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public Map<String, String> loginUser(String username) {
        Map<String, String> dataMap = new HashMap<>();
        try{

//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            username,
//                            "password"
//                    )
//            );

            String jwtToken = dtSecurityJwtService.generateToken(username);

            dataMap.put("access_token", jwtToken);

        }catch (Exception e){
            log.error("Exception in loginUser : {}", e.getMessage());
            dataMap.put("access_token", "ERROR");
        }

        return dataMap;
    }

}
