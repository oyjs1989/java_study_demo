import java.util.Scanner;

public class method_demo {
    public static void main(String[] args) {
        getMax(10,20);
    };
    public static void getMax(int a, int b) {
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
