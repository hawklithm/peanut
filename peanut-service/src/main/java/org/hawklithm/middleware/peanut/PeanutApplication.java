package org.hawklithm.middleware.peanut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by hawky on 16/9/10.
 */
@SpringBootApplication
@EnableScheduling
public class PeanutApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeanutApplication.class, args);
    }

}
