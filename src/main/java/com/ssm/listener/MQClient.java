package com.ssm.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hurong3
 * @date 2019-03-07 15:12
 */
@Component
public class MQClient {
    private static final Logger log = LoggerFactory.getLogger(MQClient.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(Object o){
        try {
            amqpTemplate.convertAndSend("rabbit_test", o);
            log.info("成功加入ipsCompleteCorrectionKey.speiyou队列");
        } catch (Throwable e) {
            log.error("推送ipsCompleteCorrectionKey.speiyou队列失败", e);
        }
    }
}
