import javax.swing.JOptionPane;
public class jun
{
	public static void main(String aa[])
	{
	String s1 = JOptionPane.showInputDialog("请输入第一个数:");
	double a = Double.parseDouble(s1);
	String s2 = JOptionPane.showInputDialog("请输入第二个数:");
	double b = Double.parseDouble(s2);

	double c = a/b;
JOptionPane.showMessageDialog(null,"这两个数的商 为: "+c);

	}
}