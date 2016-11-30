package org.coderearth.rabbitmqkitchen.listener;

import com.rabbitmq.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class HelloConsumer {

    private static final String EXCHANGE_NAME = "helloexchange";
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloConsumer.class);

    private final ConnectionFactory connectionFactory;
    private final Connection connection;
    private final Channel channel;
    private final String queueName;

    public HelloConsumer() throws IOException, TimeoutException {
        connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");

        connection = connectionFactory.newConnection();
        channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

        queueName = channel.queueDeclare().getQueue();
        channel.queueBind(queueName, EXCHANGE_NAME, "");

        LOGGER.info("Waiting for messages. To exit press CTRL+C");
    }

    public void consume() throws IOException {
        final Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                LOGGER.info("Received '" + message + "'");
            }
        };
        channel.basicConsume(queueName, true, consumer);
    }

}
