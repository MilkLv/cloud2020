package com.strive.springcloud.service.impl;

import com.strive.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;


/**
 * @author l moonlight
 * @create 2022-12-23 17:40
 * EnableBinding(Source.class):定义消息的推送管道
 */
@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements IMessageProvider {
    /**
     *消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("serial:{}",serial);
        return null;
    }
}
