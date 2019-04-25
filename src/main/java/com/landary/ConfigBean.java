package com.landary;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;


@Configuration
public class ConfigBean  {

    public DruidDataSource dataSourceOne() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://192.168.147.140:3306/base?useSSL=true");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("yjssaje");
        druidDataSource.init();
        return druidDataSource;
    }

    public DruidDataSource dataSourceTwo() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://192.168.147.140:3306/crm?useSSL=true");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("yjssaje");
        druidDataSource.init();
        return druidDataSource;
    }

    @Bean(name = "currentDataSource")
    public DynamicDataSource currentDataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map map = new LinkedHashMap();
        DruidDataSource one = null;
        DruidDataSource two = null;
        try {
            one = dataSourceOne();
            two = dataSourceTwo();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        map.put("dataSourceOne", one);
        map.put("dataSourceOTwo", two);
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(one);
        return dynamicDataSource;
    }
}