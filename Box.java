public class Box {
    int l;
    int b;
    int h;

    Box(int length, int breadth, int height){
        l = length;
        b = breadth;
        h = height;
    }

    void volume(){
        int vol = l * b * h;
        System.out.println("Volume of the box is: " + vol);
    }
    public static void main(String args[]){
        Box b1=new Box(20,10,25);
        b1.volume();
        Box b2=new Box(15,5,10);
        b2.volume();
    }
    
}
