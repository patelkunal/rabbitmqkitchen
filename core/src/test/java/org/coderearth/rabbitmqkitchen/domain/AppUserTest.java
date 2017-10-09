package org.coderearth.rabbitmqkitchen.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class AppUserTest {

    @Test
    public void testToString() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        AppUser appUser = new AppUser(1, "kunal", "kunal@kp.com");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(appUser));
        System.out.println(appUser);
    }
}