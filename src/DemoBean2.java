
import java.util.Date;


public class DemoBean2 implements Demo2
{

    int age;
    String name;
    Date d;

    public void setAge(int age) {
        this.age = age;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public void setName(String name) {
        this.name = name;
    }
    //custom life cycle method
    public void myInit()throws Exception
    {
        System.out.println("DemoBean:myInit(-) method");
        if(age<=0 || d==null) //checking inject value of bean property
        {
            throw new Exception("age & d property not injected with value");
        }

    }//myinit()
    public void myDestroy()
    {
        System.out.println("DemoBean: myDestroy(-) method ");
        //nullify bean property
        age=0;
        name=null;
        d=null;

    }//myDestroy(-)
    public String sayHello()
    {
        return "good morning   "+name+"   age "+age+"   date "+d;
    }

}
