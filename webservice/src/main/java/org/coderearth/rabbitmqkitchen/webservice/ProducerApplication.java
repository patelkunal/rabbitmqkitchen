package org.coderearth.rabbitmqkitchen.webservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

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

    @Bean
    protected ObjectMapper createObjectMapper() {
        return new ObjectMapper();
    }

}
