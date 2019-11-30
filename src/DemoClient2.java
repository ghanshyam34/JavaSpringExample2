
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient2
{
public static void main(String[] args)
{
 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("DemoCfg2.xml");
 Demo2 d=(Demo2)ctx.getBean("db");
    System.out.println("result  "+d.sayHello());
    ctx.close();
}
}
