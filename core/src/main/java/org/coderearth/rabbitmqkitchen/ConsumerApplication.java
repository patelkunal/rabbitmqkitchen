package org.coderearth.rabbitmqkitchen;

import org.coderearth.rabbitmqkitchen.listener.HelloConsumer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class ConsumerApplication {

    public static void main(String[] args) throws IOException, TimeoutException {
        HelloConsumer consumer = new HelloConsumer();
        consumer.consume();
    }
}
