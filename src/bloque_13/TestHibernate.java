package bloque_13;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * @author alonsocucei
 */
public class TestHibernate {
    public static void main(String[] args) {
        String products = "from Product";
        
        List productsList = executeHQLQuery(products);
        
        for (Object o: productsList) {
            System.out.println(o);
        }
        
        System.exit(0);
    }
    
    private static List executeHQLQuery(String hql) {
        List resultList = null;
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            resultList = q.list();
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        
        return resultList;
    }
}
