package bloque_13;

import java.util.Properties;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author alonsocucei
 */
public class ConfigureHibernate {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        
        Properties properties = new Properties();
        properties.put("hibernate.connection.username", "app");
        properties.put("hibernate.connection.password", "app");
        properties.put("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
        properties.put("hibernate.connection.url", "jdbc:derby://localhost:1527/sample");
        properties.put("hibernate.connection.driver_class", "org.apache.derby.jdbc.ClientDriver");
        
        configuration.addAnnotatedClass(MyProductCode.class);
        configuration.setProperties(properties);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
        Session session = sessionFactory.openSession();
//        session.beginTransaction();
        Query query = session.createQuery("from MyProductCode");
//        session.getTransaction().commit();
        query.list().stream().forEach(p -> System.out.println(p.toString()));
        session.close();
        System.exit(0);
    }
}
