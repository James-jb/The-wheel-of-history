package view;
import java.awt.*;
import javax.swing.*;

public class LoginView extends JFrame{
    JLabel namLabel = new JLabel("java swing 学生管理",JLabel.CENTER);
    // 弹簧布局
    SpringLayout springLayout = new SpringLayout();
    JPanel centJPanel = new JPanel(springLayout);

    JLabel userNameLabel = new JLabel("用户名:");
    JTextField userTxt = new JTextField();

    JLabel pwdJLabel = new JLabel("密码:");
    JPasswordField pwdField = new JPasswordField();
    // 登录 注册
    JButton loginBtn = new JButton("登录");
    JButton resetBtn = new JButton("注册");

    public LoginView(){
        super("java 学生管理系统");
        // 获取面板
       Container contentPane= getContentPane ();

        // 主要样式
        namLabel.setFont(new Font("华文行楷", Font.PLAIN, 40));
        namLabel.setPreferredSize(new Dimension(0, 80));

        Font centerFont = new Font("楷体", Font.PLAIN, 20);
        userNameLabel.setFont(centerFont);
        
        // 输入框 
        userTxt.setPreferredSize(new Dimension(200,30));
        pwdField.setPreferredSize(new Dimension(200,30));

        // 按钮
        pwdJLabel.setFont(centerFont);
        loginBtn.setFont(centerFont);
        resetBtn.setFont(centerFont);

        Container centerPanel;
        // 加入到面板里面来
        centerPanel.add(userNameLabel);
        centerPanel.add(userTxt);

        centerPanel.add(pwdJLabel);
        centerPanel.add(pwdField);

        centerPanel.add(loginBtn);
        centerPanel.add(resetBtn);


        
        // 放位置
        contentPane.add(nameLabel,BorderLayout.NORTH);
        contentPane.add(centerPanel, BorderLayout.CENTER);

       // 显示 ,大小
       setSize(600, 400); //单位px
        setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       // 大小不可改变
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginView();
    }
}
