package com.springboot.controller.conn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FowordController {
    private static final Logger logger = LogManager.getLogger(FowordController.class);
    @RequestMapping("/fw")
    public void to(HttpServletRequest r, HttpServletResponse m, String commond) throws Exception {
        logger.info("to(HttpServletRequest r,HttpServletResponse m,String a)" + m);
        String st = r.getContextPath();
        StringBuffer sf = r.getRequestURL();
        String re = r.getRequestURI();
        logger.info("this is HttpServletRequest ::"+ r);
        logger.info("this is HttpServletResponse :: "+ m);
        logger.info("(this is  commond)  :: "+ commond );
        r.getRequestDispatcher(commond).forward(r,m);
    }

}
