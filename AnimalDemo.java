class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }
    
}

class Bird extends Animal{
    void eat(){
        System.out.println("Bird is eating");
    }

    void sleep(){
        System.out.println("Bird is sleeping");
    }
    void fly(){
        System.out.println("Bird is flying");
    }
}
public class AnimalDemo{
public static void main(String args[]){
    Animal a=new Animal();
    a.eat();
    a.sleep();
    Bird b=new Bird();
    b.eat();
    b.sleep();
    b.fly();
    Animal a1=new Bird();
    a1.eat();
    a1.sleep();
}
}