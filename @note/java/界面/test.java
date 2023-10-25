import java.awt.Container;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("这个一个标题");
        
        // 获取面板
        // Container c = Frame.getContentPne();

        JButton JButton = new JButton("按钮哦");
        jFrame.add(JButton);
        

        // 显示 ,大小
        jFrame.setSize(600, 400); //单位px

        // 1 居中显示
        jFrame.setLocationRelativeTo(null);
        // 2 计算 中间位置



        // 关闭程序
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 大小不可改变
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
}
