package com.ssm.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * @author hurong3
 * @date 2019-03-07 15:10
 */
@Component
public class TestListener implements MessageListener {


    @Override
    public void onMessage(Message message) {
        try {
            Thread.sleep(300);
            String messageBody = new String(message.getBody(), "utf-8");
            System.out.println("---->"+messageBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
