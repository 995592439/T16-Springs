package test;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试类
public class SpringTest {
    String file="application-spring-context.xml";
    @Test
    public void whoTest(){
        //1、加载配置文件
        ApplicationContext context=
                new ClassPathXmlApplicationContext(file);
         //2、读取放在bean中的对象，参数是bean里面的id的参数
           Spring spring=
                   (Spring) context.getBean("gazi");
           spring.print();
        Spring spring2=
                (Spring) context.getBean("rod");
        spring2.print();
        //控制反转：把new对象的权利交给spring，我们通过spring的bean来获取对象
    }
}
