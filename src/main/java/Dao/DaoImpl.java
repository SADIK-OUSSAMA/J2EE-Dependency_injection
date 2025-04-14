package Dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("Dao")
public class DaoImpl implements IDao {
@Override
    public  double getData() {
        System.out.println("Version Base de données");
        double t = 24;
        return t;
    }
}
