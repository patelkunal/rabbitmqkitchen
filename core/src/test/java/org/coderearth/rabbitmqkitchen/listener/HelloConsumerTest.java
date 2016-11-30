package org.coderearth.rabbitmqkitchen.listener;

import org.junit.Test;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class HelloConsumerTest {

    @Test
    public void testConsume() throws Exception {
        HelloConsumer helloConsumer = new HelloConsumer();

        helloConsumer.consume();
    }
}