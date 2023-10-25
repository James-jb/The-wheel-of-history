import java.awt.*;
import javax.swing.*;
public class GridDemo {
    public static void main(String[] args) {
        // 计算机布局
        // 没有绑定 事件处理
        JFrame fm = new JFrame("GridLayout布局/计算器");
        Container c = fm.getContentPane();

        // 4*4布局
        String str[]={"7","8","9","/",
                      "4","5","6","*",
                      "1","2","3","-",
                      "0",".","=","+"
                    };

        GridLayout g = new GridLayout(4,4);
        c.setLayout(g);
        int length=16;
        JButton b[]=new JButton[length];

        for(int i=0;i<length;i++){
            b[i] = new JButton(str[i]);
            c.add(b[i]);
        }

        fm.pack();

        // 显示 ,大小
        fm.setSize(600, 400); //单位px

        fm.setVisible(true);
    }
}
