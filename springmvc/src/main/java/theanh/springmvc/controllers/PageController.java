package theanh.springmvc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import theanh.springmvc.services.NotificationService;

@RestController
public class PageController {
//    private NotificationService notificationService;
//
//    public PageController(){
//        notificationService = new NotificationService();
//    }

    @RequestMapping("/")
    public String home(){
        return "hello Home page controller...";
    }

}
