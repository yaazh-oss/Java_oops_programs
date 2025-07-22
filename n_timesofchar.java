import java.util.Scanner;

public class n_timesofchar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String newstr="";
        int n=str.length();

        for(int i=0;i<n;i++){
            newstr=newstr+str.charAt(0)+str.charAt(1);
        }
        System.out.print("New String: " + newstr);
        sc.close();
    
}
}
