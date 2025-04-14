package Pres;
import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presxml {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        IMetier m= (IMetier) con.getBean("mt");
        System.out.println(m.calcul());}
}
