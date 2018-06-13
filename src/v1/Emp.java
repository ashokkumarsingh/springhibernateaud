package v1;


public class Emp {
    
     private int id;
     private String name,job;
     private int salary;

    public Emp(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public Emp() {
    }
    
    public void display()
    {
    System.out.println(name+"\t"+job+"\t"+salary);
    }
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
   
    
    
}
