import javax.swing.JOptionPane;
public class chjidj {
    public static void main(String[] args) {
        float a;
        String str1 = JOptionPane.showInputDialog("输入一个数");
        a = Float.parseFloat(str1);
        if (a >= 90)
            JOptionPane.showMessageDialog(null, "优秀");
        else if (90 > a && a >= 70)
            JOptionPane.showMessageDialog(null, "良好");
        else if (70 > a && a >= 60)
            JOptionPane.showMessageDialog(null, "及格");
        else if (a < 60)
            JOptionPane.showMessageDialog(null, "不及格");
    }
}

