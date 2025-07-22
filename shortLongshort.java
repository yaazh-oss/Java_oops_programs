import java.util.Scanner;

public class shortLongshort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1=sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2=sc.nextLine();
        String newstr="";
        int n1=str1.length();
        int n2=str2.length();

        if(n1>n2){
            newstr=newstr+str2+str1+str2;
        }
        else{
            newstr=newstr+str1+str2+str1;
        }
        System.out.print("new string: "+newstr);
        sc.close();
}
}