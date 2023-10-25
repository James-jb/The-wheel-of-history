import javax.swing.JOptionPane;
public class max
{
	public static void main(String args[])
	{
		String s1=JOptionPane.showInputDialog("输入一个整数：");
		int a=Integer.parseInt(s1.trim());
		String s2=JOptionPane.showInputDialog("输入一个整数：");
		int b=Integer.parseInt(s2.trim());
		String s3=JOptionPane.showInputDialog("输入一个整数：");
		int c=Integer.parseInt(s3.trim());
		String s4=JOptionPane.showInputDialog("输入一个整数：");
		int d=Integer.parseInt(s4.trim());

		if(a>b&&a>c&&a>d)
		JOptionPane.showMessageDialog(null,"最大数为："+a);
		else if(b>a&&b>c&&b>d)
		JOptionPane.showMessageDialog(null,"最大数为："+b);
		else if(c>a&&c>b&&c>d)
		JOptionPane.showMessageDialog(null,"最大数为："+c);
		else if(d>a&&d>b&&d>c)
		JOptionPane.showMessageDialog(null,"最大数为："+d);
	}
}