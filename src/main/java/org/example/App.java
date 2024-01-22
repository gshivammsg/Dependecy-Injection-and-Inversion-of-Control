package org.example;

import org.example.DI.AppConfig;
import org.example.DI.MessagingService;
import org.example.DI.FaceBookMsg;
import org.example.IOC.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        // IoC Example
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        Employee obj=applicationContext.getBean("employee",Employee.class);
        System.out.println(obj);

        // DI -Example
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Constructor Injection
        MessagingService whatsAppMessageService = context.getBean(MessagingService.class);
        whatsAppMessageService.sendNotification("Whatsapp Message Service");

        // Setter Injection
        MessagingService faceBookMessageService = new MessagingService(new FaceBookMsg());
        faceBookMessageService.sendNotification("FaceBook Message Service");


        context.close();

    }
}
