
import javax.swing.*;
import java.util.Scanner;

public class game_demo {

    //登录界面
    public class LoginJFrame extends JFrame {
        //LoginJFrame 表示登录界面
        //以后所有跟登录相关的代码，都写在这里


        public LoginJFrame() {
            //在创建登录界面的时候，同时给这个界面去设置一些信息
            //比如，宽高，直接展示出来
            this.setSize(488, 430);
            //设置界面的标题
            this.setTitle("拼图 登录");
            //设置界面置顶
            this.setAlwaysOnTop(true);
            //设置界面居中
            this.setLocationRelativeTo(null);
            //设置关闭模式
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //让显示显示出来，建议写在最后
            this.setVisible(true);
        }
    }


    //注册界面
    public class RegisterJFrame extends JFrame {
        //跟注册相关的代码，都写在这个界面中
        public RegisterJFrame() {
            this.setSize(488, 500);
            //设置界面的标题
            this.setTitle("拼图 注册");
            //设置界面置顶
            this.setAlwaysOnTop(true);
            //设置界面居中
            this.setLocationRelativeTo(null);
            //设置关闭模式
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //让显示显示出来，建议写在最后
            this.setVisible(true);


            getContentPane();
        }
    }

    //游戏主界面
    public class GameJFrame extends JFrame {

        public GameJFrame() {
            //设置界面的宽高
            this.setSize(603, 680);
            //设置界面的标题
            this.setTitle("拼图单机版 v1.0");
            //设置界面置顶
            this.setAlwaysOnTop(true);
            //设置界面居中
            this.setLocationRelativeTo(null);
            //设置关闭模式
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
            this.setLayout(null);
            //让界面显示出来，建议写在最后
            this.setVisible(true);
        }
    }

    public static void main(String[] args) {
        //创建一个菜单对象
                JMenuBar jMenuBar = new JMenuBar();
        //设置菜单的宽高
                jMenuBar.setSize(514, 20);
        //创建一个选项
                JMenu jMenu1 = new JMenu("功能");
        //创建一个条目
                jMenuItem1 = new JMenuItem("重新游戏");

        //把条目添加到选项当中
                jMenu1.add(jMenuItem1);
        //把选项添加到菜单当中
                jMenuBar.add(jMenu1);
        //把菜单添加到最外层的窗体当中
                this.setJMenuBar(jMenuBar);
    }
}
}