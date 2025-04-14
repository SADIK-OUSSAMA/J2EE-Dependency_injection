package Pres;
import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation  {
    public static void main(String[] args) {
        ApplicationContext con=new AnnotationConfigApplicationContext("ext","metier","dao");
        IMetier mtt=con.getBean(IMetier.class);
        System.out.println(mtt.calcul());

    }
}
