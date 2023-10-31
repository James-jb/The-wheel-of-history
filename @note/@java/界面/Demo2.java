import javax.swing.*;
import java.awt.*;

public class Demo2{
    /**
     * @param args
     */
    public static void main(String[] args) {
// 制定一个窗口 构造窗口标题
JFrame frame = new JFrame("窗口");
// 关闭 退出整个程序
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 // 窗口大小
 frame.setSize(500, 500);
 

        // 设置一个容器
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        // 按钮
        JButton button = new JButton("测试");
        panel.add(button);
        



  // 显示窗口
  frame.setVisible(true);
    }

    // 监听 开始

}