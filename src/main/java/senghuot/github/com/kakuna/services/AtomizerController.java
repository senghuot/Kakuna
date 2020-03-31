package senghuot.github.com.kakuna.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtomizerController {

    @Autowired
    Environment environment;

    @RequestMapping(value = "/tst")
    public String tst() {
        return "Atomizer instance: " + environment.getProperty("local.server.port");
    }

}
