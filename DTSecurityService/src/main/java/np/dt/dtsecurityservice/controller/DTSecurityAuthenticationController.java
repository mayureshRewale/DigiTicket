package np.dt.dtsecurityservice.controller;

import np.dt.dtsecurityservice.serviceinterface.IDTAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/auth")
public class DTSecurityAuthenticationController {

    @Autowired
    IDTAuthenticationService idtAuthenticationService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam("username") String username){
        return ResponseEntity.ok(idtAuthenticationService.loginUser(username));
    }

}
