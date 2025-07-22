/* Example1  
i/p:ab*cd  
o/p:ad  */

import java.util.Scanner;

public class StarIgnore {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str=sc.nextLine();
    String newstr="";
    int n=str.length();
    int star=str.indexOf("*");

    for(int i=0;i<star-1;i++){
        newstr=newstr+str.charAt(i);
    }
    for(int j=star+2;j<n;j++){
        newstr=newstr+str.charAt(j);
    }
    System.out.println("New String: "+newstr);
    sc.close();
    
}
}