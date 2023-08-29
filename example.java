package PracticeProblems;

import java.util.Scanner;

public class example {
    public static void main (String args[]){
        try{
            System.out.println("enter the number");
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int v=0;
            int d=n%v;
            System.out.println("number is divisible");
        }catch (Exception e){
            System.out.println("fix this exception"+e);

        }
        System.out.println("end of code");
    }
}
