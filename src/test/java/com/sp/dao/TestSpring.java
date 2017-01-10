package com.sp.dao;

import com.sp.controller.Demo1;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author txcx on 2017/1/9.
 * @Description TODO
 */
public class TestSpring {
    public ApplicationContext applicationContext;
    @Before
    public void testbefore(){
        this.applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testSpring(){
        Demo1 tosay =(Demo1) applicationContext.getBean("tosay");
        tosay.sayHello();

    }
}
