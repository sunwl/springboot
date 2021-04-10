package com.springboot.controller;

import com.springboot.controller.conn.ToController;
import com.springboot.util.TockenUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
@RequestMapping("/")
@Controller
public class DefaultPage {
    private static final Logger logger = LogManager.getLogger(ToController.class);

    @RequestMapping("/")
    public String index(Model model, HttpServletResponse response,String tocken) {
        model.addAttribute("name", "simonsfan");
        logger.info("(this is  tocken)  :: "+ tocken );
        boolean f= TockenUtil.veirty(tocken);
        return "/default/index";
    }
}
