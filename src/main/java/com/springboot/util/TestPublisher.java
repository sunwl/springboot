package com.springboot.util;

import redis.clients.jedis.JedisPool;

public class TestPublisher extends Thread {

    @Override
    public void run() {
        System.out.println("子线程开始---------");

        for (int i = 0; i < 10000; i++) {
            long milliSecond = System.currentTimeMillis();
            System.out.println("i=" + i + "，milliSecond=" + milliSecond);// 输出循环次数和当前的系统时间
        }

    }
    public static void main(String[] args) {
        // 连接redis服务端
        RedisUtil redisUtil = new RedisUtil();
        JedisPool jedisPool = redisUtil.getJedisPool();

        System.out.println(String.format("redis pool is starting, redis ip %s, redis port %d", "192.168.99.100", 6378));

        SubThread subThread = new SubThread(jedisPool, "订阅者1");  //订阅者
        subThread.start();
        SubThread subThread2 = new SubThread(jedisPool, "订阅者2");  //订阅者
        subThread2.start();

        SubThread subThread3 = new SubThread(jedisPool, "订阅者3");  //订阅者
        subThread3.start();
        SubThread subThread4 = new SubThread(jedisPool, "订阅者4");  //订阅者
        subThread4.start();

        Publisher publisher = new Publisher(jedisPool);    //发布者
        publisher.start();

    }
}



