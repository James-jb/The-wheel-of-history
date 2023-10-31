// package zhuye;
import java.awt.Container;
import java.util.Random;
import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //  遍历数据 排序
        Random r = new Random();
        for(int i=0;i<tempArr.length;i++){
            // 获取 随机索引
            int index = r.nextInt(tempArr.length);
            // 遍历获取
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 遍历数组
        // for(int i=0;i<tempArr.length;i++){
        //     System.out.println(tempArr[i] + "\t");
        // }
        // System.out.println();


        // 创建一个 2维数组
        int[][] date = new int[4][4];

        // 添加数据
        for(int i=0; i<tempArr.length; i++){
            date[i/4][i%4] = tempArr[i];
        }

        // 第二次 遍历数组
        for(int i =0 ; i<date.length ; i++){
           for(int j=0 ; j<date[i].length ; j++){
                System.out.print(date[i][j]);
            }
            System.err.println();
        }
    }

    private void initImage1(){
        // 创建一个图片ImageIcon对象
         // 所有的图片是105 高 宽
        ImageIcon icon = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\1.jpg");
        // 创建一个JLable对象（管理容器）
        JLabel jLabel = new JLabel(icon);
        // 指定位置
        jLabel.setBounds(0, 0, 105, 105);
        // 添加 到容器
        // this.add(jLabel);
        this.getContentPane().add(jLabel);


            // 第2个图片
        ImageIcon icon2 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\2.jpg");
        JLabel jLabel2 = new JLabel(icon2);
        jLabel2.setBounds(105, 0, 105, 105);
        this.getContentPane().add(jLabel2);

            // 3
        ImageIcon icon3 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\3.jpg");
        JLabel jLabel3 = new JLabel(icon3);
        jLabel3.setBounds(210, 0, 105, 105);
        this.getContentPane().add(jLabel3);
            // 4
        ImageIcon icon4 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\4.jpg");
        JLabel jLabel4 = new JLabel(icon4);
        jLabel4.setBounds(315, 0, 105, 105);
        this.getContentPane().add(jLabel4);

        // 5-6-7-8 第二条
        ImageIcon icon5 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\5.jpg");
        JLabel jLabel5 = new JLabel(icon5);
        jLabel5.setBounds(0, 105, 105, 105);
        this.getContentPane().add(jLabel5);

        ImageIcon icon6 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\6.jpg");
        JLabel jLabel6 = new JLabel(icon6);
        jLabel6.setBounds(105, 105, 105, 105);
        this.getContentPane().add(jLabel6);

        ImageIcon icon7 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\7.jpg");
        JLabel jLabel7 = new JLabel(icon7);
        jLabel7.setBounds(210, 105, 105, 105);
        this.getContentPane().add(jLabel7);

        ImageIcon icon8 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\8.jpg");
        JLabel jLabel8 = new JLabel(icon8);
        jLabel8.setBounds(315, 105, 105, 105);
        this.getContentPane().add(jLabel8);

        // 9-10-11-12 第三条
        ImageIcon icon9 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\9.jpg");
        JLabel jLabel9 = new JLabel(icon9);
        jLabel9.setBounds(0, 210, 105, 105);
        this.getContentPane().add(jLabel9);

        ImageIcon icon10 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\10.jpg");
        JLabel jLabel10 = new JLabel(icon10);
        jLabel10.setBounds(105, 210, 105, 105);
        this.getContentPane().add(jLabel10);

        ImageIcon icon11 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\11.jpg");
        JLabel jLabel11 = new JLabel(icon11);
        jLabel11.setBounds(210, 210, 105, 105);
        this.getContentPane().add(jLabel11);

        ImageIcon icon12 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\12.jpg");
        JLabel jLabel12 = new JLabel(icon12);
        jLabel12.setBounds(315, 210, 105, 105);
        this.getContentPane().add(jLabel12);


        // 13-14-15 第四条 
        ImageIcon icon13 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\13.jpg");
        JLabel jLabel13 = new JLabel(icon13);
        jLabel13.setBounds(0, 315, 105, 105);
        this.getContentPane().add(jLabel13);

        ImageIcon icon14 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\14.jpg");
        JLabel jLabel14 = new JLabel(icon14);
        jLabel14.setBounds(105, 315, 105, 105);
        this.getContentPane().add(jLabel14);

        ImageIcon icon15 = new ImageIcon("E:\\@0编程\\java\\B站\\p144\\img\\15.jpg");
        JLabel jLabel15 = new JLabel(icon15);
        jLabel15.setBounds(210, 315, 105, 105);
        this.getContentPane().add(jLabel15);
    }

    private Container getContentPane() {
        return null;
    }
}
