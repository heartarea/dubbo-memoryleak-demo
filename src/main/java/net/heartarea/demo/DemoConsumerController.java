package net.heartarea.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dingcuiping
 * @desc
 * @date 2021/11/1 11:34
 */
@RestController
public class DemoConsumerController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        String result = helloService.sayHello(name);
        System.out.println("sayHello: " + result);
        return result;
    }

}
