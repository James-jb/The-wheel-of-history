import javax.swing.JOptionPane;
public class tzk
{
public static void main(String [] args)
{
int a,b;
String str1 =JOptionPane.showInputDialog("输入值");
String str2 =JOptionPane.showInputDialog("输入值");
a=Integer.parseInt(str1);
b=Integer.parseInt(str2);
if(a>b)
{
int c=a;
a=b;
b=c;
}
JOptionPane.showMessageDialog(null,"a="+a+"b="+b);
}
}