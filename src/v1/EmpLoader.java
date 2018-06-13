
package v1;
import java.util.Scanner;
import org.hibernate.*;


public class EmpLoader {
   
    public static void main(String arr[])
    {
    Scanner in=new Scanner(System.in);    
    System.out.println("Enter Id");
    int id=in.nextInt();
    System.out.println("Loading...");
    Session s=MyFactory.getSession();
    Emp e=(Emp)s.load(Emp.class, id);
    System.out.println("Loaded.");
    System.out.println("State of loaded entity.");
    System.out.println(e.getName()+"\t"+e.getJob()+"\t"+e.getSalary());
   
    s.close();
    }
}
