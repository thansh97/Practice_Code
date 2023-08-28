import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int a[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers in array");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }

        System.out.println("after ");
        for(int i=a.length-1;i>=0;i--){
            System.out.println("values in array are:\n"+a[i]);
        }

    }
}