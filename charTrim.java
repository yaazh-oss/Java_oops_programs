import java.util.Scanner;

public class charTrim {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str=sc.nextLine();
    String newstr="";
    int n=str.length();

    for(int i=1;i<=n-2;i++){
        newstr=newstr+str.charAt(i);
    }
    System.out.println("New String: "+newstr);
    sc.close();
}
}