/*
* StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的。
* 链式编程
* StringJoiner 同StringBuilder 提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。
* */

import java.util.StringJoiner;

public class StringBuilder_demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append(1);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int len = sb.length();
        System.out.println(len);
        // 链式编程
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);
        // 转字符串
        String str = sb.toString();
        System.out.println(str);//aaabbbcccddd
        System.out.println(str.equals(sb)); // false

        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //3.打印结果
        System.out.println(sj);//aaa---bbb---ccc
    }
}
