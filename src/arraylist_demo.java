import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student(){};
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    };
    public void spark(){
        System.out.println("name is "+this.name);
        System.out.println("age is "+this.age);
    }
}

public class arraylist_demo {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<Student>();
        s.add(new Student("张山",11));
        s.add(new Student("李四",21));
        s.add(new Student("王五",31));
        s.add(new Student("赵六",41));

        for(int i=0;i<s.size();i++){
            s.get(i).spark();
        }
    }
}
