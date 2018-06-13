
package v1;
import java.util.Scanner;
import org.hibernate.*;


public class EmpRemover {
   
    public static void main(String arr[])
    {
    Scanner in=new Scanner(System.in);    
    System.out.println("Enter Id");
    int id=in.nextInt();
    System.out.println("Removing...");
    Session s=MyFactory.getSession();
    Emp e=(Emp)s.get(Emp.class, id);
    Transaction t=s.beginTransaction();
    s.delete(e);
    t.commit();
    s.close();
    System.out.println("Successfully removed.");
   
    
    }
}
