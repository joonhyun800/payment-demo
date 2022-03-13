package com.wjh.payment;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
@Slf4j
class PaymentDemoApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {

    }

    @Test
    void getDatasource() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.info("连接结果:{}",connection);
    }

}
