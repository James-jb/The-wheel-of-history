import javax.swing.*;

class shang {
    public static void main(String[] args) {
        String s1= JOptionPane.showInputDialog("请输入一个小数：");
        double a=Double.parseDouble(s1);
        String s2= JOptionPane.showInputDialog("请输入一个另小数：");
        double b=Double.parseDouble(s2);
        double c=a/b;
        JOptionPane.showMessageDialog(null,"结果为："+a+"/"+b+"="+c);
    }
}