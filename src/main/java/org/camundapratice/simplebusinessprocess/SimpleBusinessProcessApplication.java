package org.camundapratice.simplebusinessprocess;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableProcessApplication("process-variable")
public class SimpleBusinessProcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBusinessProcessApplication.class, args);
    }

}
