package SpringBoot.helloworld.src.main.java.com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringApplication;

import com.example.helloworld.HelloworldApplication;

@SpringBootApplication

public class HelloController {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
