import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Studentdetails
{
    String Student_Name;
    int Student_english,Student_tamil,Student_roll_no,Total;
    Studentdetails(String name,int roll_no,int eng,int tam)
    {
        this.Student_Name = name;
        this.Student_roll_no = roll_no;
        this.Student_english = eng;
        this.Student_tamil = tam;


    }
    public void display(){
        System.out.println("Student Name:\t"+this.Student_Name);
        System.out.println("Student Roll Number:\t"+this.Student_roll_no);

    }
    public void total(){
        int sum = this.Student_english+this.Student_tamil;
        System.out.println("sum of two numbers are:"+sum);
    }
    public void result(){
        int eng = this.Student_english;
        int tam = this.Student_tamil;
        
        if(eng >75 && tam >75){
            System.out.println("student is pass");
        }else{
            System.out.println("student need to improve");
        }

    }

}
class Student{
    public static void main(String[] args){
        //Normal value display
        //Studentdetails s = new Studentdetails("Thansh",123);
        //s.display();
        //multiple student details:
        //List<Studentdetails> lists = new ArrayList<Studentdetails>();
            String name[]={"thansh","Lindesh","lindesh"};
            int rollno[]={1,2,3};
            int eng[]={97,88,77};
            int tam[]={34,54,80};



            for(int i=0;i<3;i++){
                Studentdetails st = new Studentdetails(name[i],rollno[i],eng[i],tam[i]);
              //  lists.add(st);
                //lists.get(i).display();
               // lists.get(i).total();
                //System.out.println(i+"."+"student Name:\t"+name[i]+"\n"+i+"."+"Student roll no:\t"+rollno[i]);
                st.display();
                st.total();
                st.result();
            }


    }
}
