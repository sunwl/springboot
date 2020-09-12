package com.springboot.util;

import redis.clients.jedis.JedisPubSub;

public class Subscriber extends JedisPubSub {
    private  String name ;
    @Override
    public void onMessage(String channel, String message) {
        super.onMessage(channel, message);
        //收到消息会调用
        System.out.println("++++++++++++++"+name+"++++++开始+++++++++++++++");
        System.out.println(String.format("receive redis published message, channel %s, message %s", channel, message));
        System.out.println("++++++++++++++"+name+"++++++结束+++++++++++++++");
    }



    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        super.onSubscribe(channel, subscribedChannels);
        //订阅了频道会调用
        System.out.println(String.format("subscribe redis channel success, channel %s, subscribedChannels %d",
                channel, subscribedChannels));

    }

    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        super.onUnsubscribe(channel, subscribedChannels);
        //取消订阅 会调用
        System.out.println(String.format("unsubscribe redis channel, channel %s, subscribedChannels %d",
                channel, subscribedChannels));

    }

    public Subscriber(String name ) {
        this.name=name;
    }
}
