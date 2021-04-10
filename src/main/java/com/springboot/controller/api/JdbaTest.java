package com.springboot.controller.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
@Controller
public class JdbaTest {
    @Autowired
    private DataSource dataSource;
    private static final Logger logger = LogManager.getLogger(JdbaTest.class);


    @RequestMapping("/testHikari")
    public String test() throws Exception  {

        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            ResultSet resultSet = connection.prepareStatement("select count(*) from see").executeQuery();
            String str = "";
            while (resultSet.next()) {
                str = resultSet.getString(1);
            }
            logger.info("JdbaTestJdbaTestJdbaTestJdbaTestJdbaTest     "+str);
            connection.close();
            return str;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
}
