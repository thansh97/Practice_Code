public class string {
    public static void main(String[] args){

        String[] s ={"thansh","lindesh"};
        String  s1="thansh dhanavel";
        char[] a1 =s1.toCharArray();
        int count=0;
        for(int i=0;i<a1.length;i++){
            count=count+1;
        }
        System.out.println("count:"+count);
        for(int i=a1.length-1;i>=0;i--){
            System.out.print(a1[i]);
        }
        System.out.print("\n");
        for(int i=s.length-1;i>=0;i--){

           System.out.print(s[i]);        }


    }
    }
