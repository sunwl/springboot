package com.springboot;


import com.springboot.util.RedisUtil;
import com.springboot.util.TestPublisher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Pipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class RedisTest {
    private static final Logger logger = LogManager.getLogger(RedisTest.class);

    @Test
    public void getRedis(){
        logger.info("测试人redis");
        Jedis jedis=new Jedis("192.168.99.100",6378);
        jedis.auth("footbar");
        jedis.select(0);
        jedis.set("name","9999");
        jedis.close();
        logger.info("测试人redis结束");
    }


    @Test
    public void getRedisPool(){
        JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxIdle(100);
        jedisPoolConfig.setMaxWaitMillis(1000);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "192.168.99.100", 6378,300,"footbar");
        Jedis jedis=jedisPool.getResource();
        jedis.select(2);
        Pipeline pipeline=jedis.pipelined();
        for (int i=0;i<=100000;i++){
            pipeline.set("pipNN2"+i,"pipNN2"+i);
        }
        int a =jedis.getDB();
        pipeline.close();
        logger.info("测试人redispool结束"+a);
    }
    @Test
   public void testList(){
       RedisUtil redisUtil=new RedisUtil();
       List<String > list=new ArrayList<String>();
       for(int i=0;i<=100;i++){
          //list.add((char)i) ;
           Integer a=i;
           list.add(a.toString());
       }
       redisUtil.setListString("list",list);
   }

    @Test
    public void testZZZ(){


    }

    @Test
    public void testThread() throws Exception{
            TestPublisher publisher = new TestPublisher();
            publisher.setDaemon(true);
            publisher.start();
            CountDownLatch countDownLatch=new CountDownLatch(100);
            countDownLatch.await(5, TimeUnit.MINUTES);
    }
}
