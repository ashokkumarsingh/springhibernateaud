
package v1;
import java.util.Scanner;
import org.hibernate.*;


public class EmpGetter {
   
    public static void main(String arr[])
    {
    Scanner in=new Scanner(System.in);    
    System.out.println("Enter Id");
    int id=in.nextInt();
    System.out.println("Loading...");
    Session s=MyFactory.getSession();
    Emp e=(Emp)s.get(Emp.class, id);
    s.close();
    System.out.println("Loaded and session closed.");
    System.out.println("State of loaded entity.");
    System.out.println(e.getName()+"\t"+e.getJob()+"\t"+e.getSalary());
   
    
    }
}
