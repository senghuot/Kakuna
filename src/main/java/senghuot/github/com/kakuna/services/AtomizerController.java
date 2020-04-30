package senghuot.github.com.kakuna.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import senghuot.github.com.kakuna.Repo.TinyUrlRepo;
import senghuot.github.com.kakuna.model.TinyURL;

@RestController
public class AtomizerController {

    @Autowired
    Environment environment;

    @Autowired
    TinyUrlRepo repo;

    @RequestMapping(value = "/tst")
    public String tst() {
        return "Atomizer instance: " + environment.getProperty("local.server.port");
    }

    @GetMapping(value = "/{tinyUrl}")
    public String getURL(@PathVariable("tinyUrl")String tinyUrl) {
        return "http://google.com";
    }

    @PostMapping(value = "/", consumes = {"application/json"})
    public String addURL(@RequestBody String url) {
        String shortURL = url.toUpperCase();
        TinyURL tinyURL = new TinyURL(shortURL, url);
        repo.save(tinyURL);
        return shortURL;
    }
}
