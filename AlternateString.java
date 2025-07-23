/* Example1  
i/p:Hello,World  
o/p:HWeolrllod */


import java.util.Scanner;

class AlternateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        String newstr = "";
        
        int i = 0, j = 0;

        while (i < n1 || j < n2) {
            if (i < n1)
                newstr += str1.charAt(i++);
            if (j < n2)
                newstr += str2.charAt(j++);
        }
        
        System.out.print(newstr);
        sc.close();
    }
}