package org.coderearth.rabbitmqkitchen.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class HelloProducer {

    private static final String EXCHANGE_NAME = "helloexchange";
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloProducer.class);

    private final ConnectionFactory connectionFactory;
    private final Connection connection;
    private final Channel channel;

    public HelloProducer() throws IOException, TimeoutException {
        connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        connection = connectionFactory.newConnection();
        channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
    }

    public void sendMessage(final String name) throws IOException {
        LOGGER.info("Sending greeting to : {}", name);
        channel.basicPublish(EXCHANGE_NAME, "", null, name.getBytes());
        LOGGER.info("Sent greeting to : {}", name);
    }

    @PreDestroy
    protected void destroy() throws IOException, TimeoutException {
        channel.close();
        connection.close();
    }

}
