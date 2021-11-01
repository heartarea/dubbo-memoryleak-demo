package net.heartarea.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @author dingcuiping
 * @desc
 * @date 2021/11/1 11:17
 */
@EnableDubbo
@SpringBootApplication
public class DemoProvider {
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        // wait for embedded zookeeper start completely.
        Thread.sleep(1000);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/dubbo-provider.xml");
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
