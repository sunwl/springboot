package com.springboot.controller.conn;

import com.springboot.bean.user.MySee;
import com.springboot.bean.user.User;
import com.springboot.service.connservice.SeeService;
import com.springboot.service.userservice.UserService;
import com.springboot.util.RedisUtil;
import com.springboot.util.TockenUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
public class ThisController {
    private static final Logger logger = LogManager.getLogger(ThisController.class);
    @Autowired
    private SeeService seeService;
    @Autowired
    private UserService userService;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @RequestMapping("/tomain")
    public ModelAndView to(Model model, HttpServletRequest r, HttpServletResponse m, String cpass, String cname) {
        logger.info("to(HttpServletRequest r,HttpServletResponse m,String a)" + m);
        String st = r.getContextPath();
        StringBuffer sf = r.getRequestURL();
        String re = r.getRequestURI();
        model.addAttribute("name", "jack");
        model.addAttribute("age", 20);
        model.addAttribute("info", "我是一个爱学习的好青年");
        logger.info("跳转到mains/main.html页面" + cpass + "              " + cname);

        User user = userService.find(cname, cpass);
        int boo = userService.setpasswd("123sss", 2l);
        userService.getUserSee();
        logger.info(userService.getUserSee());
        if (user.getId() > 0) {
            String tocken= TockenUtil.sign(user.getId()+"",user.getName());
            ModelAndView modelandview = new ModelAndView("mains/main");
            modelandview.addObject("tocken",tocken);
            return modelandview;
        } else {
            ModelAndView modelandview = new ModelAndView("/default/index");
            message = "密码错误";
            modelandview.addObject("message", message);
            return modelandview;
        }
    }

    @RequestMapping("/todefault")
    public ModelAndView toDefault(Model model,String tocken) {
        model.addAttribute("name", "jack");
        model.addAttribute("age", 20);
        model.addAttribute("info", "我是一个爱学习的好青年");
        logger.info("index(Model model)");
        logger.info("index(Model model)"+tocken);
        ModelAndView modelandview = new ModelAndView("/mains/default");
        modelandview.addObject("tocken",tocken);
        return modelandview;
    }

    @RequestMapping("/toCon1")
    public ModelAndView toM(MySee user) {
        logger.info("modelandviewto JSP");
        List<MySee> mysee = seeService.findAll();
        List<String> li = new ArrayList<String>();
        li.add("ID");
        li.add("描述");
        li.add("日期");
        li.add("info");
        ModelAndView mv = new ModelAndView("jsp/info");
        mv.addObject("mysees", mysee);
        mv.addObject("myseehead", li);
        return mv;
    }

    @RequestMapping("/toFrame")
    public ModelAndView toFrame(Model user) throws Exception {
        logger.info("modelandviewto JSP");
        ModelAndView mv = new ModelAndView("jsp/frame/indes");
        return mv;
    }


    @RequestMapping("/toJspadd")
    public ModelAndView toJspadd(Model user) {
        logger.info("modelandviewto JSP");
        ModelAndView mv = new ModelAndView("jsp/frame/toJspadd");
        return mv;
    }

    @RequestMapping("/toAJSP")
    public ModelAndView toJspA(MySee mySee) {
        logger.info("toJspAmodelandviewto JSP");
        logger.info(mySee.getInfo());
        for (int i = 0; i <= 5; i++) {
            MySee se = new MySee();
            se.setInfo(mySee.getInfo() + i);
            se.setV_date(mySee.getV_date());
            se.setV_desc(mySee.getV_desc() + i);
            seeService.save(se);
        }
        return toM(mySee);
    }


    @ResponseBody
    @RequestMapping("/ajaxdata")
    public Map aJaxdata(Model mySee) {
        List<String> data1 = new ArrayList<String>();
        List<String> data2 = new ArrayList<String>();
        List<String> ta3 = new ArrayList<String>();
        List<String> ta1 = new ArrayList<String>();
        List<String> ta2 = new ArrayList<String>();
        RedisUtil redisUtil = new RedisUtil();
        Random r = new Random(1);
        for (int i = 1; i <= 3; i++) {
            data1.add(getread());
        }
        ;

        for (int i = 1; i <= 12; i++) {
            data2.add(getread());
            ta1.add(getread());
            ta2.add(getread());
            ta3.add(getread());
        }
        ;
        redisUtil.setListString("data1", data1);
        redisUtil.setListString("data2", data2);
        redisUtil.setListString("ta3", ta3);
        redisUtil.setListString("ta2", ta2);
        redisUtil.setListString("ta1", ta1);
       /* logger.info("设置过期时间，并返回还有多少毫秒过期：   " + redisUtil.setExpr("data1", 5000l));
        ;
        logger.info("设置过期时间，并返回还有多少毫秒过期：   " + redisUtil.setExpr("data2", 5000l));
        ;
        logger.info("设置过期时间，并返回还有多少毫秒过期：   " + redisUtil.setExpr("ta3", 5000l));
        ;
        logger.info("设置过期时间，并返回还有多少毫秒过期：   " + redisUtil.setExpr("ta2", 5000l));
        ;
        logger.info("设置过期时间，并返回还有多少毫秒过期：   " + redisUtil.setExpr("ta1", 5000l));
        ;*/

        Map<String, List<String>> map = new HashMap();
        map.put("pie", data1);
        map.put("bar", data2);
        map.put("li1", ta1);
        map.put("li2", ta2);
        map.put("li3", ta3);
        // redisUtil.setPipelineString();
        return map;
    }

    public String getread() {
        Random r = new Random();
        int ran3 = r.nextInt(10000000);
       // logger.info(ran3);
        return ran3 + "";
    }
}
