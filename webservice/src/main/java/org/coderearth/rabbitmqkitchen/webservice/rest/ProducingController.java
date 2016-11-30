package org.coderearth.rabbitmqkitchen.webservice.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import org.coderearth.rabbitmqkitchen.webservice.domain.AppUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by kunal_patel on 11/30/16.
 */
@RestController
public class ProducingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducingController.class);

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping(
            value = "/user", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
    )
    protected ResponseEntity<Map<String, String>> addUser(@RequestBody final AppUser user) throws JsonProcessingException {
        LOGGER.debug("=================== INCOMING REQUEST FOR user.id = {} ========================", user.getId());
        LOGGER.debug(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
        ImmutableMap<String, String> respMap = ImmutableMap.of("message", "user addition is accepted !!");
        LOGGER.debug("=================== SERVED INCOMING REQUEST FOR user.id = {} ========================", user.getId());
        return new ResponseEntity<>(respMap, HttpStatus.ACCEPTED);
    }

}
