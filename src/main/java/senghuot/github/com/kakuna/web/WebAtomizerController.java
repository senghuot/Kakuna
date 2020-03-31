package senghuot.github.com.kakuna.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAtomizerController {

    @Autowired
    protected WebAtomizerService service;

    public WebAtomizerController(WebAtomizerService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", headers = "Accept=application/json")
    public String homepage() {
        return service.homepage();
    }

}
