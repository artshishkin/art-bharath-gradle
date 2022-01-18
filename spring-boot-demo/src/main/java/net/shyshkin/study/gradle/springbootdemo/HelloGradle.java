package net.shyshkin.study.gradle.springbootdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradle {

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return "Hello Gradle";
    }
}
