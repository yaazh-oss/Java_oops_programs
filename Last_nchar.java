import java.util.Scanner;

public class Last_nchar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        int n = str.length();
        String newstr = "";


        if(k<n){
        for(int i=1;i<=k;i++){
            for(int j=n-k;j<n;j++){
                newstr = newstr + str.charAt(j);
            }
        }
    }
        System.out.println("NewString: "+ newstr);
        sc.close();
    }
    
}
