package com.springframework.study;

import com.springframework.study.controllers.ConstructorInjectedController;
import com.springframework.study.controllers.MyController;
import com.springframework.study.controllers.PropertyInjectedController;
import com.springframework.study.controllers.SetterInjectedController;
import com.springframework.study.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//By adding @ComponentScan(basePackages =...) we overide the default behavior of spring boot
@ComponentScan(basePackages = {"com.springframework.study.services","com.springframework.study"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        
        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource =(FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }

}
