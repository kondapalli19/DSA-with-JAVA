public class NeedCheck {
    public static void main(String[] args) {
        Student koyal=new Student();
        System.out.println(koyal.rno);
        System.out.println(koyal.name);
        System.out.println(koyal.marks);
        Student kunal=new Student(13, "kunal", 90.0f);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;
     
    Student(){
        rno=0;
        name="default name";
        marks=0.0f;
    }

    // It Worked without this keyword it is printing the assigned values
    Student(int Rno, String Name, float Marks){
        rno=Rno;
        name=Name;
       marks=Marks;
    }
  
}