package np.dt.dtmasterservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/master")
public class DTMasterController {

    @GetMapping("/master")
    public String masterTest(){
        return "DD";
    }

}
