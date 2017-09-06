package theanh.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import theanh.springmvc.services.NotificationService;

@RestController
public class PageController {

    //notificationService
    private NotificationService notificationService;

    @Autowired
    public PageController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Value("${my.secret}")
    public String mySecret;

    @RequestMapping("/")
    public String home() {
        System.out.println("PageController::mySecret------" + mySecret);
        return notificationService.toString();
    }

}
