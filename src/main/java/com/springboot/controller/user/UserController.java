package com.springboot.controller.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.bean.user.User;
import com.springboot.service.userservice.UserService;

@RequestMapping(value = "user")
@Controller
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World ABCD !!!";
    }

    @RequestMapping("/index")
    public ModelAndView index(Model model) {
        model.addAttribute("name", "jack");
        model.addAttribute("age", 20);
        model.addAttribute("info", "我是一个爱学习的好青年");
        logger.info("index(Model model)");
        ModelAndView modelandview = new ModelAndView("index");
        return modelandview;
    }

    @RequestMapping("/save")
    public ModelAndView save(User user) {
        logger.info(user + " save(User user)");
        for (int i = 0; i < 2; i++) {
            user.setInfo(user.getInfo() + i);
            User user0 = new User();
            user0.setAge(user.getAge());
            user0.setName(user.getName());
            user0.setInfo(user.getInfo());
            userService.save(user0);
            logger.info("save(User user)");
        }
        ModelAndView mv = new ModelAndView("res");
        return mv;
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll(Model model) {
        List<User> all = userService.findAll();
        model.addAttribute("collects", all);
        ModelAndView mv = new ModelAndView("res");
        logger.info( " findAll(User user)");
        return mv;
    }
}
