import javafx.scene.transform.Scale;

import java.util.Scanner;

public class lindesh {
  public static void main(String args[]){
      System.out.println("enter the number:\t");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[]= new int[10];
      for(int i=0;i<=a.length;i++){
          if(i%2==0){
              a[i]=i;
          }
          System.out.println("the divisible numbers are:"+a[i]);


      }
  }
}
