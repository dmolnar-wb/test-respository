package com.spring.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringScopesApplication {

    public static void main(String[] args) {
        ApplicationContext scopesApplicationContext = new AnnotationConfigApplicationContext(ScopesConfig.class);

        singletonExample(scopesApplicationContext);
        System.out.println("------------------");

        prototypeExample(scopesApplicationContext);
        System.out.println("------------------");
    }

    private static void singletonExample(ApplicationContext applicationContext) {
        User userA = (User) applicationContext.getBean("userSingleton");
        User userB = (User) applicationContext.getBean("userSingleton");

        System.out.println(userA.getName());
        System.out.println(userB.getName());

        userA.setName("Webinar 2022 Participant 1");

        System.out.println(userA.getName());
        System.out.println(userB.getName());

        userB.setName("Webinar 2022 Participant 2");

        System.out.println(userA.getName());
        System.out.println(userB.getName());
    }

    private static void prototypeExample(ApplicationContext applicationContext) {
        User userA = (User) applicationContext.getBean("userPrototype");
        User userB = (User) applicationContext.getBean("userPrototype");

        System.out.println(userA.getName());
        System.out.println(userB.getName());

        userA.setName("Webinar 2022 Participant 1");

        System.out.println(userA.getName());
        System.out.println(userB.getName());

        userB.setName("Webinar 2022 Participant 2");

        System.out.println(userA.getName());
        System.out.println(userB.getName());
    }
}
