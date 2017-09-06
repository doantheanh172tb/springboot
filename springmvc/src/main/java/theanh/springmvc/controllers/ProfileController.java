package theanh.springmvc.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Value("${spring.profiles.active}")
    private String enviroment;

    @Value("${msg}")
    private String msg;

    @RequestMapping("/profile")
    public String profile() {
        System.out.println("ProfileController--profile::enviroment::" + enviroment);
        return enviroment + "---" + msg;
    }
}
