package com.springboot;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {
    private static final Logger logger = LogManager.getLogger(ThreadTest.class);
    private byte[] abe=new byte[102400];

    @Test
    public void getOom() throws  Exception{
        List<Object> list=new ArrayList<Object>();
      while(true){
         list.add(new ThreadTest()) ;
         Thread.sleep(5);
          logger.info("测试 OutOfMemoryError");
      }
    }
}
