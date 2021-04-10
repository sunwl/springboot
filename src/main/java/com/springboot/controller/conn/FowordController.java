package com.springboot.controller.conn;

import com.springboot.util.TockenUtil;
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
    public void to(HttpServletRequest r, HttpServletResponse m, String commond, String tocken) throws Exception {
        logger.info("to(HttpServletRequest r,HttpServletResponse m,String a)" + m);
        String st = r.getContextPath();
        StringBuffer sf = r.getRequestURL();
        String re = r.getRequestURI();
        logger.info("this is HttpServletRequest ::" + r);
        logger.info("this is HttpServletResponse :: " + m);
        logger.info("(this is  commond)  :: " + commond);
        logger.info("(this is  tocken)  :: " + tocken);
        if ("tomain".equals(commond)) {
            r.getRequestDispatcher(commond).forward(r, m);
        }else {
            boolean f = TockenUtil.veirty(tocken);
            //if(tocken==null)f=true;
            if (f) {
                logger.info("(this is  f)  :: " + f);
                r.getRequestDispatcher(commond).forward(r, m);
            } else {
                logger.info("tocken :: " + f);
                logger.info("tocken 失效了 ");
                logger.info("tocken 失效了 ");
                logger.info("tocken 失效了 请跳转到登陆页面");
                // r.getServletContext().getRequestDispatcher("/").forward(r, m);
                m.sendRedirect("http://localhost:8002/myboot/");
                m.setContentType("text/html;charset=UTF-8");
                m.getWriter().write("林肯公园");
                // m.getOutputStream().write("林肯公园".getBytes());
            }
        }
    }

}
