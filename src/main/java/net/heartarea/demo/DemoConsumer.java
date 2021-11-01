package net.heartarea.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dingcuiping
 * @desc
 * @date 2021/11/1 11:18
 */
@SpringBootApplication
@EnableDubbo
public class DemoConsumer {

    public static void main(String[] args)  throws Exception {
        SpringApplication.run(DemoConsumer.class, args);
    }

}
