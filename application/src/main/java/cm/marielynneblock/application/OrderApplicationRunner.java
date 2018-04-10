package cm.marielynneblock.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cm.marielynneblock"})
public class OrderApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationRunner.class, args);
    }

}
