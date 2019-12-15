package com.springframework.study;

import com.springframework.study.controllers.ConstructorInjectedController;
import com.springframework.study.controllers.MyController;
import com.springframework.study.controllers.PropertyInjectedController;
import com.springframework.study.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
