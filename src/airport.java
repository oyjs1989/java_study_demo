/*
* 需求:
机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
*/
import java.util.Scanner;

public class airport {
    public static void main(String[] args) {
        //1.键盘录入机票原价、月份、头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        double discount = 1.0;
        switch (month){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (seat==0){
                    discount=0.9;
                }else {
                    discount=0.85;
                }
                break;
            default:
                if (seat==0){
                    discount=0.7;
                }else {
                    discount=0.65;
                }
                break;
        };
        System.out.println(ticket*discount);
    }
}
