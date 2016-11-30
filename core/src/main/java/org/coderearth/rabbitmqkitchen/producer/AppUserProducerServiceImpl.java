package org.coderearth.rabbitmqkitchen.producer;

import org.coderearth.rabbitmqkitchen.domain.AppUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class AppUserProducerServiceImpl implements AppUserProducerService {
    private static final String EXCHANGE_NAME = "coderexchange";

    private static final Logger LOGGER = LoggerFactory.getLogger(AppUserProducerService.class);

    @Override
    public void pushAppUser(AppUser user) throws IOException, TimeoutException {
    }

}
