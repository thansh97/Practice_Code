import java.util.Scanner;

public class Reversestr {
    public static void main(String[] args){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        System.out.println("before reverse:"+a);
        char s[]=a.toCharArray();
        String rev="";
        for(int i=s.length-1;i>=0;i--){
            rev=rev+s[i];
        }
        System.out.print("reverse string:"+rev);
        System.out.print("\n");
        if(rev.equals(a)){
            System.out.println("pall");
        }
        else {
            System.out.println("not");
        }
            }

}
