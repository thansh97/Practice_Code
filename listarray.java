import java.util.Scanner;

public class listarray
{
    public static void main(String args[]){
        try{
            Object a[]= {"thansh",2.3,4.5f,"thansh"};
            for(int i=0;i<=a.length;i++){
                System.out.println(a[i]);
            }
        }catch (Exception e){
            System.out.println("enter correct element");
        }

    }
}
