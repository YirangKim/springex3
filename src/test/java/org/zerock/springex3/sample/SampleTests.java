package org.zerock.springex3.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springex3.mapper.TimeMapper;

//import javax.sql.DataSource;
//import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {

    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Test
    public void testGetTime(){
        log.info(timeMapper.getTime());
    }

//    @Autowired
//    private SampleService sampleService;
//
//    @Autowired
//    private DataSource dataSource; // HikariCP를 주입받기위해 dataSource 변수선언
//
//    @Test
//    public void setSampleTests1(){
//        log.info(sampleService);
//        Assertions.assertNotNull(sampleService);
//    }
//
//    @Test
//    public void testConnection() throws Exception{ //데이터베이스와 연결이 가능한지 확인
//        Connection connection = dataSource.getConnection();
//        log.info(connection);
//        Assertions.assertNotNull(connection);
//
//        connection.close();
//    }
}
