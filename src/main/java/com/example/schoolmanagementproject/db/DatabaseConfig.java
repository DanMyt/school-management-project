package com.example.schoolmanagementproject.db;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@Getter
public class DatabaseConfig {

    private final String url;
    private final String username;
    private final String password;


    public DatabaseConfig(@Value("${spring.datasource.url}") String url,
                          @Value("${spring.datasource.username}") String username,
                          @Value("${spring.datasource.password}") String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.username, this.password);
    }
}
