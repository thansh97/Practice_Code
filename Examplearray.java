package PracticeProblems;

public class Examplearray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3,3, 2, 1};
        int flag=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print("duplicate numbers are:\t"+a[i]+"\n");
                    flag  =flag+1;
                }
            }

        }
        System.out.println("Total duplicates are:\t"+flag);

    }
}