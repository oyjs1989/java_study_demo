/*
* #### 2.5.1==号的作用
- 比较基本数据类型：比较的是具体的值
- 比较引用数据类型：比较的是对象地址值
*
* equals 比较两个字符串内容是否相同、区分大小写
*
* charAt(i) 根据索引获取字符串里面的一个字符
* */
public class string_demo {
    public static void main(String[] args) {
        String x = "x";
        String y = "x";
        String z = new String("x");
        System.out.println("x" == "x");
        System.out.println(x == y);
        System.out.println(z == y);
        System.out.println(z.equals(y));
        String a = "wf";
        char c = a.charAt(1);
        System.out.println(c);
    }
}
