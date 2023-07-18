package cloud.service4.controller;

import cloud.service4.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    DataService dataService;

    @RequestMapping("/")
    String home() {
        return "Quote from data service '" + dataService.getDefaultQuote();
    }
}
