package com.springboot.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class SubThread extends Thread {
    private final JedisPool jedisPool;
    private Subscriber subscriber;

    private final String channel = Channel.channelStr;
    private String name;

    public SubThread(JedisPool jedisPool, String name) {
        super("SubThread");
        this.jedisPool = jedisPool;
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(String.format("subscribe redis, channel %s, thread will be blocked", channel));
        Jedis jedis = null;
        try {
            subscriber = new Subscriber(name);
            jedis = jedisPool.getResource();   //取出一个连接
            jedis.subscribe(subscriber, channel);    //通过subscribe 的api去订阅，入参是订阅者和频道名
        } catch (Exception e) {
            System.out.println(String.format("subsrcibe channel error, %s", e));
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }


}

