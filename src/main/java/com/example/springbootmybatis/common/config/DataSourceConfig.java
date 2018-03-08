package com.example.springbootmybatis.common.config;

import com.example.springbootmybatis.Exception.MyException;
import com.example.springbootmybatis.common.Constanst.ErrorConst;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@Configurable
public class DataSourceConfig {
    @Value("spring.dataSource.driver-class-name")
    private String driverClass ;
    @Value("spring.dataSource.url")
    private String url;
    @Value("spring.dataSource.username")
    private String username;
    @Value("spring.dataSource.password")
    private String password;

    @Bean(value = "dataSource")
    public DataSource getDataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setJdbcUrl(url);
            dataSource.setDriverClass(driverClass);
            dataSource.setUser(username);
            dataSource.setPassword(password);
        }catch (Exception e){
            throw  new MyException(ErrorConst.EROOR3);
        }
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
