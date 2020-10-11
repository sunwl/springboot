package com.springboot;


import com.springboot.bean.user.NbUser;
import com.springboot.service.userservice.NbUserService;
import com.springboot.service.userservice.impl.NbUserServiceImpl;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NbUserServiceTest {
    private static final Logger logger = LogManager.getLogger(NbUserServiceTest.class);
    @TestConfiguration
    static class prepareCustomServices{
        @Bean
        public NbUserService getNbUserServiceImpl() {
            return new NbUserServiceImpl();
        }
        
    }
    @Qualifier("getNbUserServiceImpl")
    @Autowired
    private NbUserService nbUserService;
    @Test
   public void testNbuse(){
     logger.info(nbUserService);
        NbUser nbUser=new NbUser();
        nbUser.setUserid("L005951");
        nbUser.setName("火影忍者");
        nbUser.setEmail("13054434190@qq.com");
        nbUser.setTellno("17600148911");
        nbUser.setPassw("123450");
        nbUser.setInfo("中国的火影忍者用户");
        nbUserService.save(nbUser);
   }
}
