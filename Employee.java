public class Employee extends Person{
   private double salary;
    private int year;
    private String ins_number;

    public Employee(String name, double salary, int year, String ins_number) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.ins_number = ins_number;
    }

    public double getsalary(){
        return salary;
    }
    public int getyear(){
        return year;
    }
    public String getins_number(){
        return ins_number;
    }
    public void setsalary(double salary) {
        this.salary = salary;
    }
    public void setyear(int year){
        this.year=year;
    }
    public void setins_number(String ins_number){
        this.ins_number=ins_number;
    }

    public void display(){
        System.out.println("Name: " + getname());
        System.out.println("Salary: " + getsalary());
        System.out.println("Year: " + getyear());
        System.out.println("Insurance Number: " + getins_number());

    }
}
