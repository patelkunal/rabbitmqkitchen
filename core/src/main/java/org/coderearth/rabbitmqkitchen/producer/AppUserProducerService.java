package org.coderearth.rabbitmqkitchen.producer;

import org.coderearth.rabbitmqkitchen.domain.AppUser;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by kunal_patel on 11/30/16.
 */
public interface AppUserProducerService {

    void pushAppUser(AppUser user) throws IOException, TimeoutException;

}
