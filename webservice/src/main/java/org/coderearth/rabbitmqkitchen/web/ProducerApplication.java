package org.coderearth.rabbitmqkitchen.web;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by kunal_patel on 11/28/16.
 */
@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProducerApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run(args);
    }

}
