package katagroup.pre_project;

import katagroup.pre_project.config.DBConfig;
import katagroup.pre_project.model.User;
import katagroup.pre_project.service.UserService;
import katagroup.pre_project.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        UserService userService = context.getBean(UserService.class);


        userService.addUser(new User("rick", "dalton", 26, "1111"));
        userService.addUser(new User("Nick", "Tusday", 26, "1111"));
        userService.addUser(new User("rick", "dalton", 26, "1111"));


        userService.getAllUsers();

    }
}

