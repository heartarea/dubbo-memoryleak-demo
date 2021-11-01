package net.heartarea.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import net.heartarea.demo.HelloService;

/**
 * @author dingcuiping
 * @desc
 * @date 2021/11/1 11:18
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("你好：" + name);
        return "hello, " + name;
    }
}
