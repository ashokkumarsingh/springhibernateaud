
package v1;
import java.util.Scanner;
import org.hibernate.*;


public class DisConnectedUpdate {
   
    public static void main(String arr[])
    {
    Scanner in=new Scanner(System.in);    
    System.out.println("Enter Id");
    int id=in.nextInt();
    in.nextLine();//to remove \n from the buffer
    System.out.println("Loading...");
    EmpDao dao=new EmpDao();
    Emp e=dao.getById(id);
    System.out.println("Current state of the entity.");
    System.out.println(e.getName()+"\t"+e.getJob()+"\t"+e.getSalary());
    System.out.println("Enter New Name:");
    String n=in.nextLine();
     System.out.println("Enter New Job:");
    String j=in.nextLine();
     System.out.println("Enter New Salary:");
    int sal=in.nextInt();
    e.setName(n);
    e.setJob(j);
    e.setSalary(sal);
    //to update, entity is provided to the dao
    dao.update(e);
    System.out.println("Successfully saved.");
    }
}
