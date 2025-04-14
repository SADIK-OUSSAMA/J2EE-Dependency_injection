package Pres;
import Dao.DaoImpl;
import Metier.MetierImpl;

public class Pres {
        public static void main(String[] args) {

            DaoImpl d= new DaoImpl();
            MetierImpl mt=new MetierImpl(d);
            //mt.setDao(d);
            System.out.println("res " + mt.calcul());

        }
    }

