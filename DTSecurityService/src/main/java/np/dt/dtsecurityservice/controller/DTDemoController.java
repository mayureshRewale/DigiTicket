package np.dt.dtsecurityservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/security/demo")
public class DTDemoController {

    @GetMapping("/demo-1")
    public ResponseEntity<?> demoOne(){
        log.info("Demo-1 Tested");
        return ResponseEntity.ok("DD");
    }

}
