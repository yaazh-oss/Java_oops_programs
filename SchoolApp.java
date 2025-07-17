class Person{
    String name;
    String dob;

    Person(String name, String dob){
        this.name=name;
        this.dob=dob;
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("DOB:"+dob);
    }
}

class Teacher extends Person{
        double salary;
        String subject;

        Teacher(String name, String dob, double salary, String subject){
            super(name, dob); 
            this.salary=salary;
            this.subject=subject;
        }
        void display(){
            super.display();
            System.out.println("Salary:"+salary);
            System.out.println("Subject:"+subject);
        }
}

class Student extends Person{
    int id;

    Student(int id, String name, String dob){
        super(name, dob);
        this.id=id;
    }
    void display(){
        super.display();
        System.out.println("ID:"+id);
    }

}
class CollegeStudent extends Student{
    String clg_name;
    int year;

    CollegeStudent(int id, String name, String dob,String clg_name, int year){
        super(id, name, dob);
        this.clg_name=clg_name;
        this.year=year;
    }
    void display(){
        super.display();
        System.out.println("College Name:"+clg_name);
        System.out.println("Year:"+year);
    }
}

public class SchoolApp {
    public static void main(String args[]){
        //possible ways of creating an object
        Person p = new Person("Ravi Kumar", "12-03-1980");
        p.display();
        System.out.println("______________________");

        Teacher t = new Teacher("Mrs. Anitha", "05-07-1975", 50000, "Mathematics");
        t.display();
        System.out.println("______________________");


        Student s = new Student(101, "John Doe", "15-08-2000");
        s.display();
        System.out.println("______________________");


        CollegeStudent cs = new CollegeStudent(102, "Jane Smith", "20-09-2001", "ABC University", 3);
        cs.display();
        System.out.println("______________________");

        Person p1 = new Teacher("asmi","12-03-1980", 60000, "Physics");
        p1.display();
        System.out.println("______________________");

        Person p2 = new CollegeStudent(102,"Lidiya","01-05-2004","XYZ College",4);
        p2.display();
        System.out.println("______________________");
    }
    
}
