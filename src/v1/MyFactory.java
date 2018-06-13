
package v1;

import auditlog.MyInterceptor;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class MyFactory {
    
    private static SessionFactory factory;
    
    static
    {
        Configuration cfg=new Configuration().configure();
        factory=cfg.buildSessionFactory();
    }
    
    public static Session getSession()
    {
         return factory.openSession(new MyInterceptor());
    }
}
