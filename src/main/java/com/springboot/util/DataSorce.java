package com.springboot.util;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.*;

public class DataSorce {
    Connection connection = null;
    @Autowired
    private DataSource dataSource;

    /**
     *
     * @return
     */
    private Connection getConn() {
        try {
            if (connection == null) {
                connection = dataSource.getConnection();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    /**
     *
     * @param connection
     * @param resultSet
     * @param preparedStatement
     * @param statement
     */
    private void resource(Connection connection, ResultSet resultSet, PreparedStatement preparedStatement, Statement statement) {

        try {
            if (connection != null) connection.close();
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
