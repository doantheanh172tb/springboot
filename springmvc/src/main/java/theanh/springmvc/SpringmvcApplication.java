package theanh.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import theanh.springmvc.configs.GlobalConfig;
import theanh.springmvc.configs.MyAppConfig;
import theanh.springmvc.entities.User;

import java.util.Arrays;

@SpringBootApplication
//@ComponentScan({"theanh.springmvc.controllers", "theanh.springmvc.services"})
public class SpringmvcApplication {

    @Bean
    public User user() {
        return new User("Doan", "The Anh");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringmvcApplication.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        for (String name : beanNames) {
            System.out.println(name);
        }

        System.out.println(ctx.getBean("user").toString());
        System.out.println(ctx.getBean("userNotificationService").toString());

        MyAppConfig myAppConfig = (MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println(myAppConfig.toString());

        GlobalConfig globalConfig = (GlobalConfig) ctx.getBean("globalConfig");
        System.out.println(globalConfig.getTimestamp());
        System.out.println(globalConfig.getTimestamp());
    }
}
