import java.util.Scanner;

public class StringHalf {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String half="";
        int n=str.length();

        if(n%2==0){
            for(int i=0;i<n/2;i++){
            half=half+str.charAt(i);
        }
        System.out.print("Half:" + half);
    }
    else{
        System.out.println("null");
    }
    sc.close();
    }    
}
