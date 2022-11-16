class Animal{
    public int age=10;
    public void move(){
        System.out.println("动物可以移动");
    };
}

class Dog extends Animal{
    public int age=9;
    @Override
    public void move(){
        System.out.println("狗可以跑和走");
    }

    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

public class override_demo{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Animal 对象 指向子类  Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
//        b.bark();
        System.out.println(a.age);
        System.out.println(b.age);
    }
}