package theanh.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import theanh.springmvc.services.NotificationService;

@RestController
public class PageController {

    //notificationService
    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/")
    public String home() {
        return notificationService.toString();
    }

}
