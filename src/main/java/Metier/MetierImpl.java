package Metier;
import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import Dao.DaoImpl;

@Service("metier")

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("Dao")IDao dao){
        this.dao=dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t *23;
        return res;
    }

    // Pour injecter  dans la variable Dao un Objet d'une classe qui implemente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
