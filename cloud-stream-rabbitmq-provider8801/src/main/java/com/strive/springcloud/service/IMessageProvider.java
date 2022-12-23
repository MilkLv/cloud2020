package com.strive.springcloud.service;

/**
 * @author l moonlight
 * @create 2022-12-23 17:38
 */

public interface IMessageProvider {

    /**
     * 发送消息
     * @return {@link String}
     */
    String send();
}
