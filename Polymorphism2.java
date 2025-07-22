class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
    void erase(){
        System.out.println("Erasing a shape");
    }

}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circlee");
    }
    void erase(){
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Circle{
    void draw(){
        System.out.println("Drawing a triangle");
    }
    void erase(){
        System.out.println("Erasing a triangle");
    }
}

class Square extends Circle{
    void draw(){
        System.out.println("Drawing a squaree");
    }
    void erase(){
        System.out.println("Erasing a square");
    }
}



public class Polymorphism2 {
    public static void main(String args[]){
        Shape c=new Circle();  
        Shape t=new Triangle();  
        Shape s=new Square();

        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}
