import java.util.Scanner;

public class switch_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string:");
        int week = sc.nextInt();
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        };
//        switch (week) {
//            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
//            case 6, 7 -> System.out.println("休息日");
//            default -> System.out.println("没有这个星期");
//        };
    }
}
