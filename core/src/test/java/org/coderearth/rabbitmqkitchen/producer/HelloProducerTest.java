package org.coderearth.rabbitmqkitchen.producer;

import org.junit.Test;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class HelloProducerTest {

    @Test
    public void testSendMessage() throws Exception {
        final HelloProducer producer = new HelloProducer();
        producer.sendMessage("rabbitmq");
        producer.sendMessage("java");

        producer.destroy();
    }
}