package com.springboot.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Pipeline;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedisUtil {
    public Pipeline getPipeline(){
        JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxIdle(100);
        jedisPoolConfig.setMaxWaitMillis(1000);
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPoolConfig.setTestOnReturn(true);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "192.168.99.100", 6378,300,"footbar");
        Jedis jedis=jedisPool.getResource();
        jedis.select(0);
        return jedis.pipelined();
    }

    public JedisPool getJedisPool(){
        JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxIdle(100);
        jedisPoolConfig.setMaxWaitMillis(1000);
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPoolConfig.setTestOnReturn(true);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "192.168.99.100", 6378,300,"footbar");

        return jedisPool;
    }

    public Jedis getJedis(){
        Jedis jedis=new Jedis("192.168.99.100",6378);
        jedis.auth("footbar");
        jedis.select(0);
        return jedis;
    }
   public void closePipeline(Pipeline pipeline){
       if(pipeline!=null){
           pipeline.close();
       }
   }
    public void closeJedis(Jedis jedis){
        if(jedis!=null){
            jedis.close();
        }
    }
   public void setString(String key,String value){
       Jedis jedis= getJedis();
       jedis.set(key,value);
       closeJedis(jedis);
   }
   public void setListString(String key, List<String> list){
        Jedis jedis= getJedis();
        for(String value:list){
            jedis.lpush(key,value);
        }
        closeJedis(jedis);
    }

    public List<String> getListString(String key){
        Jedis jedis= getJedis();
        List<String> list = jedis.lrange(key, 0, jedis.llen(key));
        closeJedis(jedis);
        return list;
    }

    public Long getListLength(String key){
        Jedis jedis= getJedis();

        return jedis.llen(key);
    }


    public Long setExpr(String key,Long time){
        Jedis jedis= getJedis();
        jedis.pexpire(key,time);
        return jedis.ttl(key);
    }




    public void setPipelineString(String key,String value){
        Pipeline pipeline= getPipeline();
        pipeline.set(key,value);
        closePipeline(pipeline);
    }

    public void setPipelineString(Map<String,String> map){
        Pipeline pipeline= getPipeline();
        Set<String > keyset=map.keySet();
        for(String key:keyset){
            pipeline.set(key,map.get(key));
        }
        closePipeline(pipeline);
    }
}
