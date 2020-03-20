package com.sping;

import org.springframework.context.ApplicationContext;
import com.spring.model.Message;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {
    public static void main (String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("prototype-bean.xml");
            Message message1 = ac.getBean("messageServ1", Message.class);
            message1.setId(1001);
            message1.setMessage("bhgj");
            System.out.println(message1.toString());
            Message message2 = ac.getBean("messageServ1", Message.class);
            message2.setId(345);
            message2.setMessage("hi");
            System.out.println(message2.toString());
            ((AbstractApplicationContext)ac).close();
    }
}
