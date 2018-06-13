
package v1;
import org.hibernate.*;


public class EmpSaver {
   
    public static void main(String arr[])
    {
    Emp e1=new Emp("Amit","Trainee",10000);
    Emp e2=new Emp("Raman","Accountant",25000);
    System.out.println("Following objects will be saved.");
    e1.display();
    e2.display();
    System.out.println("Saving...");
    Session s=MyFactory.getSession();
    Transaction t=s.beginTransaction();
    s.save(e1);
    s.save(e2);
    t.commit();
    s.close();
    System.out.println("Successfully saved.");
    }
}
