class Fruit{
    String name;
    String taste;

    Fruit(String name, String taste){
        this.name=name;
        this.taste=taste;
    }
    void eat(){
        System.out.println("Eating " + name + " which is " + taste);
    }

}


class Apple extends Fruit{
    Apple(){
        super("Apple","Sweet");
    }
    void eat(){
        System.out.println("Apple is a " + taste + " fruit.");
    }
}

class Orange extends Fruit{
    Orange(){
        super("Orange","Sour");
    }
    void eat(){
        System.out.println("Orange is a " + taste + " fruit.");
    }
}


public class Polymorphism {
    public static void main(String args[]){
        Fruit f1=new Apple();
        f1.eat();
        Fruit f2=new Orange();
        f2.eat();

    }
    
}
