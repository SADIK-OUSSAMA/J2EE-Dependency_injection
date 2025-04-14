package Pres;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {

    private IMetier metier;  // UML-detectable dependency
    private IDao dao;        // UML-detectable dependency

    public Pres2(IMetier metier, IDao dao) {
        this.metier = metier;
        this.dao = dao;
    }

    public void run() {
        try {
            // Inject dao into metier
            Method setDao = metier.getClass().getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);

            // Business logic
            System.out.println(metier.calcul());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class<?> cDao = Class.forName(daoClassname);
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            String metierClassname = scanner.nextLine();
            Class<?> cMetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

            // Pass dependencies explicitly (UML can now see them)
            Pres2 app = new Pres2(metier, dao);
            app.run();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
