package senghout.github.com.atomizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import senghout.github.com.atomizer.model.TinyURL;
import senghout.github.com.atomizer.repo.TinyURLRepo;

@RestController
public class AtomizerController {

    @Autowired
    Environment environment;

    @Autowired
    TinyURLRepo repo;

    @RequestMapping(value = "/tst")
    public String tst() {
        return "Atomizer instance: " + environment.getProperty("local.server.port");
    }

    @GetMapping(value = "/{tinyUrl}")
    public String getURL(@PathVariable("tinyUrl")String tinyUrl) {
        return "http://google.com";
    }

    @PostMapping(value = "/", consumes = {"application/json"})
    public String addURL(@RequestBody TinyURL url) {
        String shortURL = url.getUrl().toUpperCase();
        url.setTinyUrl(shortURL + Math.random());
        repo.save(url);
        return shortURL;
    }
}
